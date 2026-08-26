package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Stories.StoryReactionWidgetView;

public class EmojiAnimationsOverlay implements NotificationCenter.NotificationCenterDelegate {
    private static final HashSet<String> excludeEmojiFromPack;
    private static final HashSet<String> supportedEmoji = new HashSet<>();
    private boolean attached;
    ChatActivity chatActivity;
    FrameLayout contentLayout;
    int currentAccount;
    long dialogId;
    Runnable hintRunnable;
    String lastTappedEmoji;
    RecyclerListView listView;
    private HashMap<Long, Boolean> preloaded;
    Runnable sentInteractionsRunnable;
    TLRPC.TL_messages_stickerSet set;
    long threadMsgId;
    private final int ANIMATION_JSON_VERSION = 1;
    private final String INTERACTIONS_STICKER_PACK = "EmojiAnimations";
    boolean inited = false;
    HashMap<String, ArrayList<TLRPC.Document>> emojiInteractionsStickersMap = new HashMap<>();
    HashMap<Long, Integer> lastAnimationIndex = new HashMap<>();
    Random random = new Random();
    int lastTappedMsgId = -1;
    long lastTappedTime = 0;
    ArrayList<Long> timeIntervals = new ArrayList<>();
    ArrayList<Integer> animationIndexes = new ArrayList<>();
    final ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    public static class DrawingObject {
        TLRPC.Document document;
        public long documentId;
        private String fileName;
        public AnimatedEmojiEffect genericEffect;
        ImageReceiver imageReceiver;
        public boolean isMessageEffect;
        boolean isOut;
        public boolean isPremiumSticker;
        public boolean isReaction;
        public float lastH;
        public float lastW;
        public float lastX;
        public float lastY;
        int messageId;
        public float randomOffsetX;
        public float randomOffsetY;
        float removeProgress;
        boolean removing;
        public boolean viewFound;
        boolean wasPlayed;

        public DrawingObject() {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setAllowDrawWhileCacheGenerating(true);
        }

        public float getProgress() {
            ImageLocation mediaLocation = this.imageReceiver.getMediaLocation();
            if (mediaLocation == null) {
                mediaLocation = this.imageReceiver.getImageLocation();
            }
            if (mediaLocation == null) {
                mediaLocation = this.imageReceiver.getThumbLocation();
            }
            if (mediaLocation == null) {
                return -1.0f;
            }
            if (this.fileName == null) {
                TLRPC.Document document = mediaLocation.document;
                if (document != null) {
                    this.fileName = FileLoader.getAttachFileName(document, "tgs");
                } else {
                    this.fileName = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                }
            }
            if (this.fileName == null) {
                return -1.0f;
            }
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.fileName);
            if (fileProgress == null) {
                fileProgress = Float.valueOf(1.0f);
            }
            return (fileProgress.floatValue() * 0.3f) + (fileProgress.floatValue() * 0.55f) + 0.15f;
        }

        public boolean isPlaying() {
            ImageReceiver imageReceiver = this.imageReceiver;
            return (imageReceiver == null || imageReceiver.getLottieAnimation() == null) ? false : true;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        excludeEmojiFromPack = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public EmojiAnimationsOverlay(FrameLayout frameLayout, int i) {
        this.contentLayout = frameLayout;
        this.currentAccount = i;
    }

    private void clearSendingInfo() {
        this.lastTappedMsgId = 0;
        this.lastTappedEmoji = null;
        this.lastTappedTime = 0L;
        this.timeIntervals.clear();
        this.animationIndexes.clear();
    }

    public void findViewAndShowAnimation(int i, int i2) {
        ChatMessageCell chatMessageCell;
        ChatActivity chatActivity;
        if (this.attached) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.listView.getChildCount()) {
                    chatMessageCell = null;
                    break;
                }
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof ChatMessageCell) {
                    chatMessageCell = (ChatMessageCell) childAt;
                    String stickerEmoji = chatMessageCell.getMessageObject().getStickerEmoji();
                    if (stickerEmoji == null) {
                        stickerEmoji = chatMessageCell.getMessageObject().messageOwner.message;
                    }
                    if (chatMessageCell.getPhotoImage().hasNotThumb() && stickerEmoji != null && chatMessageCell.getMessageObject().getId() == i) {
                        break;
                    }
                }
                i3++;
            }
            if (chatMessageCell == null || (chatActivity = this.chatActivity) == null) {
                return;
            }
            chatActivity.restartSticker(chatMessageCell);
            if (!EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    chatMessageCell.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            showAnimationForCell(chatMessageCell, i2, false, true);
        }
    }

    public static int getFilterWidth() {
        float fMin;
        float f;
        if (AndroidUtilities.isTablet()) {
            fMin = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f = 0.5f;
        }
        return (int) ((((int) (fMin * f)) * 2.0f) / AndroidUtilities.density);
    }

    public void lambda$createDrawingObject$1(MessageObject messageObject, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, tLObject, messageObject, 17));
    }

    public void lambda$createDrawingObject$2() {
        sendCurrentTaps();
        this.sentInteractionsRunnable = null;
    }

    public void lambda$showStickerSetBulletin$3(MessageObject messageObject) {
        Activity parentActivity = this.chatActivity.getParentActivity();
        ChatActivity chatActivity = this.chatActivity;
        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
        ChatActivity chatActivity2 = this.chatActivity;
        StickersAlert stickersAlert = new StickersAlert(parentActivity, chatActivity, inputStickerSet, null, chatActivity2.chatActivityEnterView, chatActivity2.getResourceProvider(), false);
        stickersAlert.setCalcMandatoryInsets(this.chatActivity.isKeyboardVisible());
        this.chatActivity.showDialog(stickersAlert);
    }

    private void sendCurrentTaps() {
        if (this.lastTappedMsgId == 0) {
            return;
        }
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
        tL_sendMessageEmojiInteraction.msg_id = this.lastTappedMsgId;
        tL_sendMessageEmojiInteraction.emoticon = this.lastTappedEmoji;
        tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", 1);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.timeIntervals.size(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("i", this.animationIndexes.get(i).intValue() + 1);
                jSONObject2.put("t", this.timeIntervals.get(i).longValue() / 1000.0f);
                jSONArray.put(i, jSONObject2);
            }
            jSONObject.put("a", jSONArray);
            tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
            TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
            long j = this.threadMsgId;
            if (j != 0) {
                tL_messages_setTyping.top_msg_id = (int) j;
                tL_messages_setTyping.flags |= 1;
            }
            tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
            tL_messages_setTyping.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, null);
            clearSendingInfo();
        } catch (JSONException e) {
            clearSendingInfo();
            FileLog.e(e);
        }
    }

    public void lambda$createDrawingObject$0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        if (this.chatActivity == null || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.chatActivity.getParentActivity() == null) {
            return;
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(this.contentLayout.getContext(), null, -1, messageObject.getDocument(), this.chatActivity.getResourceProvider());
        stickerSetBulletinLayout.titleTextView.setText(tL_messages_stickerSet.set.title);
        stickerSetBulletinLayout.subtitleTextView.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(this.chatActivity.getParentActivity(), true, this.chatActivity.getResourceProvider());
        stickerSetBulletinLayout.setButton(undoButton);
        undoButton.setUndoAction(new LinkManager$$ExternalSyntheticLambda2(3, this, messageObject));
        undoButton.setText(LocaleController.getString(R.string.ViewAction));
        Bulletin bulletinMake = Bulletin.make(this.chatActivity, stickerSetBulletinLayout, 2750);
        bulletinMake.hash = messageObject.getId();
        bulletinMake.show();
    }

    public static String unwrapEmoji(String str) {
        CharSequence charSequenceConcat;
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (i2 >= length - 1) {
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i2) == 65039) {
                    length--;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                    i2--;
                }
            } else if (charSequenceConcat.charAt(i2) == 55356) {
                int i3 = i2 + 1;
                if (charSequenceConcat.charAt(i3) < 57339 || charSequenceConcat.charAt(i3) > 57343) {
                    charSequenceConcat = str;
                    charSequenceConcat = str;
                    charSequenceConcat = str;
                    if (charSequenceConcat.charAt(i2) == 8205) {
                        i = i2 + 1;
                        if (charSequenceConcat.charAt(i) != 9792 || charSequenceConcat.charAt(i) == 9794) {
                        }
                        i2--;
                    }
                    charSequenceConcat = str;
                    if (charSequenceConcat.charAt(i2) == 65039) {
                        length--;
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                        i2--;
                    }
                }
                charSequenceConcat = str;
                length -= 2;
                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                i2--;
            } else {
                charSequenceConcat = str;
                charSequenceConcat = str;
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i2) == 8205) {
                    i = i2 + 1;
                    if (charSequenceConcat.charAt(i) != 9792) {
                    }
                    charSequenceConcat = str;
                    length -= 2;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                    i2--;
                }
                charSequenceConcat = str;
                if (charSequenceConcat.charAt(i2) == 65039) {
                    length--;
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                    i2--;
                }
            }
            i2++;
            charSequenceConcat = charSequenceConcat;
        }
        charSequenceConcat = str;
        return charSequenceConcat.toString();
    }

    public void cancelAllAnimations() {
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).removing = true;
        }
    }

    public void cancelHintRunnable() {
        Runnable runnable = this.hintRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.hintRunnable = null;
    }

    public boolean checkPosition(ChatMessageCell chatMessageCell, float f, int i) {
        float centerY = chatMessageCell.getPhotoImage().getCenterY() + chatMessageCell.getY();
        return centerY > f && centerY < ((float) i);
    }

    public void checkStickerPack() {
        if (this.inited) {
            return;
        }
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("EmojiAnimations");
        this.set = stickerSetByName;
        if (stickerSetByName == null) {
            this.set = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("EmojiAnimations");
        }
        if (this.set == null) {
            MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("EmojiAnimations", false, true);
        }
        if (this.set != null) {
            HashMap map = new HashMap();
            for (int i = 0; i < this.set.documents.size(); i++) {
                map.put(Long.valueOf(this.set.documents.get(i).id), this.set.documents.get(i));
            }
            for (int i2 = 0; i2 < this.set.packs.size(); i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.set.packs.get(i2);
                if (!excludeEmojiFromPack.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    supportedEmoji.add(tL_stickerPack.emoticon);
                    ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
                    this.emojiInteractionsStickersMap.put(tL_stickerPack.emoticon, arrayList);
                    for (int i3 = 0; i3 < tL_stickerPack.documents.size(); i3++) {
                        arrayList.add((TLRPC.Document) map.get(tL_stickerPack.documents.get(i3)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i4 = 0; i4 < 8; i4++) {
                            String str = strArr[i4];
                            supportedEmoji.add(str);
                            this.emojiInteractionsStickersMap.put(str, arrayList);
                        }
                    }
                }
            }
            this.inited = true;
        }
    }

    public void clear() {
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onDetachedFromWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.removeView(this.contentLayout);
            }
        }
        this.drawingObjects.clear();
    }

    public boolean createDrawingObject(String str, int i, TLRPC.Document document, final MessageObject messageObject, int i2, final boolean z, boolean z2, float f, float f2, boolean z3) {
        long j;
        TLRPC.Document document2;
        int iAbs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z4;
        Runnable runnable;
        boolean z5;
        int iAbs2 = i2;
        boolean z6 = messageObject != null && messageObject.isPremiumSticker();
        boolean z7 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z7 || z6 || supportedEmoji.contains(str)) {
            ArrayList<TLRPC.Document> arrayList = this.emojiInteractionsStickersMap.get(str);
            if (z7 || ((arrayList != null && !arrayList.isEmpty()) || z6)) {
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < this.drawingObjects.size()) {
                    if (this.drawingObjects.get(i3).messageId == i) {
                        i4++;
                        if (!z7 && (this.drawingObjects.get(i3).imageReceiver.getLottieAnimation() == null || this.drawingObjects.get(i3).imageReceiver.getLottieAnimation().isGeneratingCache())) {
                        }
                    }
                    if (this.drawingObjects.get(i3).document == null || document == null) {
                        z5 = z6;
                    } else {
                        z5 = z6;
                        if (this.drawingObjects.get(i3).document.id == document.id) {
                            i5++;
                        }
                    }
                    i3++;
                    z6 = z5;
                }
                boolean z8 = z6;
                if (z && z8 && i4 > 0) {
                    if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().hash == messageObject.getId()) {
                        return false;
                    }
                    TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                    TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.currentAccount).getStickerSetByName(inputStickerSet.short_name) : null;
                    if (stickerSetByName == null) {
                        stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetById(inputStickerSet.id);
                    }
                    if (stickerSetByName != null) {
                        lambda$createDrawingObject$0(stickerSetByName, messageObject);
                        return false;
                    }
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    tL_messages_getStickerSet.stickerset = inputStickerSet;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new IntroActivity$$ExternalSyntheticLambda6(25, this, messageObject));
                    return false;
                }
                if (i4 >= 4) {
                    return false;
                }
                if (z7) {
                    TLRPC.TL_availableEffect effect = messageObject.getEffect();
                    TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
                    if (availableEffects == null) {
                        return false;
                    }
                    j = 0;
                    long j2 = effect.effect_animation_id;
                    if (j2 == 0) {
                        j2 = effect.effect_sticker_id;
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 >= availableEffects.documents.size()) {
                            document2 = null;
                            break;
                        }
                        document2 = availableEffects.documents.get(i6);
                        if (document2 != null && document2.id == j2) {
                            break;
                        }
                        i6++;
                    }
                    if (document2 == null) {
                        return false;
                    }
                    if (effect.effect_sticker_id != 0) {
                        premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                        z4 = premiumStickerAnimation != null;
                    } else {
                        z4 = z8;
                        premiumStickerAnimation = null;
                    }
                } else {
                    j = 0;
                    if (z8) {
                        document2 = messageObject.getDocument();
                        premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                        z4 = z8;
                    } else {
                        if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                            if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                iAbs2 = Math.abs(this.random.nextInt()) % arrayList.size();
                            }
                            document2 = arrayList.get(iAbs2);
                        } else {
                            if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TLRPC.Document document3 = arrayList.get(i7);
                                    if (document3 != null) {
                                        HashMap<Long, Boolean> map = this.preloaded;
                                        Boolean bool = map != null ? map.get(Long.valueOf(document3.id)) : null;
                                        if (bool != null && bool.booleanValue()) {
                                            arrayList2.add(Integer.valueOf(i7));
                                        }
                                    }
                                }
                                iAbs = arrayList2.isEmpty() ? Math.abs(this.random.nextInt()) % arrayList.size() : ((Integer) arrayList2.get(Math.abs(this.random.nextInt()) % arrayList2.size())).intValue();
                            } else {
                                iAbs = iAbs2;
                            }
                            document2 = arrayList.get(iAbs);
                            iAbs2 = iAbs;
                        }
                        z4 = z8;
                        premiumStickerAnimation = null;
                    }
                }
                if (document2 == null && premiumStickerAnimation == null) {
                    return false;
                }
                final DrawingObject drawingObject = new DrawingObject();
                drawingObject.isPremiumSticker = z4;
                drawingObject.isMessageEffect = z7;
                if (!z7) {
                    drawingObject.randomOffsetX = ((this.random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                    drawingObject.randomOffsetY = ((this.random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                }
                drawingObject.messageId = i;
                drawingObject.document = document2;
                drawingObject.isOut = z3;
                drawingObject.imageReceiver.setAllowStartAnimation(true);
                drawingObject.imageReceiver.setAllowLottieVibration(z);
                boolean z9 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                if (premiumStickerAnimation == null) {
                    int filterWidth = getFilterWidth();
                    boolean z10 = z9;
                    Integer num = this.lastAnimationIndex.get(Long.valueOf(document2.id));
                    int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                    this.lastAnimationIndex.put(Long.valueOf(document2.id), Integer.valueOf(iIntValue));
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    drawingObject.imageReceiver.setUniqKeyPrefix(iIntValue + "_" + drawingObject.messageId + "_");
                    ImageReceiver imageReceiver = drawingObject.imageReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append(filterWidth);
                    sb.append("_");
                    sb.append(filterWidth);
                    sb.append(z10 ? "_pcache" : "");
                    imageReceiver.setImage(forDocument, sb.toString(), null, "tgs", this.set, 1);
                    drawingObject.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                        @Override
                        public void didSetImage(ImageReceiver imageReceiver2, boolean z11, boolean z12, boolean z13) {
                            if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                            }
                        }

                        @Override
                        public final void didSetImageBitmap(int i8, String str2, Drawable drawable) {
                            ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i8, str2, drawable);
                        }

                        @Override
                        public void onAnimationReady(ImageReceiver imageReceiver2) {
                            MessageObject messageObject2;
                            if (!z || (messageObject2 = messageObject) == null || !messageObject2.isAnimatedAnimatedEmoji() || imageReceiver2.getLottieAnimation() == null || imageReceiver2.getLottieAnimation().hasVibrationPattern()) {
                                return;
                            }
                            try {
                                EmojiAnimationsOverlay.this.contentLayout.performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                        }
                    });
                    if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                        drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    iAbs2 = iAbs2;
                } else {
                    boolean z11 = z9;
                    int filterWidth2 = getFilterWidth();
                    if (i5 > 0) {
                        Integer num2 = this.lastAnimationIndex.get(Long.valueOf(document2.id));
                        int iIntValue2 = num2 == null ? 0 : num2.intValue();
                        this.lastAnimationIndex.put(Long.valueOf(document2.id), Integer.valueOf((iIntValue2 + 1) % 4));
                        drawingObject.imageReceiver.setUniqKeyPrefix(iIntValue2 + "_" + drawingObject.messageId + "_");
                    }
                    drawingObject.document = document2;
                    ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                    ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(filterWidth2);
                    sb2.append("_");
                    sb2.append(filterWidth2);
                    sb2.append(z11 ? "_pcache" : "");
                    imageReceiver2.setImage(forDocument2, sb2.toString(), null, "tgs", this.set, 1);
                }
                drawingObject.imageReceiver.setLayerNum(Integer.MAX_VALUE);
                drawingObject.imageReceiver.setAutoRepeat(0);
                if (drawingObject.imageReceiver.getLottieAnimation() != null) {
                    if (drawingObject.isPremiumSticker) {
                        drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    drawingObject.imageReceiver.getLottieAnimation().start();
                }
                this.drawingObjects.add(drawingObject);
                drawingObject.imageReceiver.onAttachedToWindow();
                drawingObject.imageReceiver.setParentView(this.contentLayout);
                this.contentLayout.invalidate();
                if (z && !z4 && UserConfig.getInstance(this.currentAccount).clientUserId != this.dialogId) {
                    int i8 = this.lastTappedMsgId;
                    if (i8 != 0 && i8 != i && (runnable = this.sentInteractionsRunnable) != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        this.sentInteractionsRunnable.run();
                    }
                    this.lastTappedMsgId = i;
                    this.lastTappedEmoji = str;
                    if (this.lastTappedTime == j) {
                        this.lastTappedTime = System.currentTimeMillis();
                        this.timeIntervals.clear();
                        this.animationIndexes.clear();
                        this.timeIntervals.add(Long.valueOf(j));
                        this.animationIndexes.add(Integer.valueOf(iAbs2));
                    } else {
                        this.timeIntervals.add(Long.valueOf(System.currentTimeMillis() - this.lastTappedTime));
                        this.animationIndexes.add(Integer.valueOf(iAbs2));
                    }
                    Runnable runnable2 = this.sentInteractionsRunnable;
                    if (runnable2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable2);
                        this.sentInteractionsRunnable = null;
                    }
                    IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda5 = new IntroActivity$$ExternalSyntheticLambda5(this, 21);
                    this.sentInteractionsRunnable = introActivity$$ExternalSyntheticLambda5;
                    AndroidUtilities.runOnUIThread(introActivity$$ExternalSyntheticLambda5, 500L);
                }
                if (!z2) {
                    return true;
                }
                MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadMsgId, 11, str, 0);
                return true;
            }
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer printingStringType;
        if (i == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                checkStickerPack();
                return;
            }
            return;
        }
        if (i != NotificationCenter.onEmojiInteractionsReceived) {
            if (i == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId)) != null && printingStringType.intValue() == 5) {
                cancelHintRunnable();
                return;
            }
            return;
        }
        if (this.chatActivity == null) {
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (jLongValue == this.dialogId && supportedEmoji.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            final int i3 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i4);
                        final int iOptInt = jSONObject.optInt("i", 1) - 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public void run() {
                                EmojiAnimationsOverlay.this.findViewAndShowAnimation(i3, iOptInt);
                            }
                        }, (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float y;
        MessageObject messageObject;
        ImageReceiver photoImage;
        if (this.drawingObjects.isEmpty()) {
            return;
        }
        int i = 0;
        while (i < this.drawingObjects.size()) {
            DrawingObject drawingObject = this.drawingObjects.get(i);
            float f2 = 3.0f;
            if (this.chatActivity != null) {
                drawingObject.viewFound = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.listView.getChildCount()) {
                        f = 3.0f;
                        y = 0.0f;
                        break;
                    }
                    View childAt = this.listView.getChildAt(i2);
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        messageObject = chatMessageCell.getMessageObject();
                        photoImage = chatMessageCell.getPhotoImage();
                    } else if (childAt instanceof ChatActionCell) {
                        ChatActionCell chatActionCell = (ChatActionCell) childAt;
                        messageObject = chatActionCell.getMessageObject();
                        photoImage = chatActionCell.getPhotoImage();
                    } else {
                        messageObject = null;
                        photoImage = null;
                    }
                    if (messageObject != null && messageObject.getId() == drawingObject.messageId) {
                        drawingObject.viewFound = true;
                        float x = childAt.getX() + this.listView.getX();
                        float y2 = childAt.getY() + this.listView.getY();
                        y = childAt.getY();
                        drawingObject.lastW = photoImage.getImageWidth();
                        drawingObject.lastH = photoImage.getImageHeight();
                        if (!drawingObject.isMessageEffect || !(childAt instanceof ChatMessageCell)) {
                            f = 3.0f;
                            if (!drawingObject.isPremiumSticker) {
                                float imageX = photoImage.getImageX() + x;
                                float imageY = photoImage.getImageY() + y2;
                                float fDp = drawingObject.isOut ? ((-photoImage.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - photoImage.getImageWidth();
                                drawingObject.lastX = fDp;
                                drawingObject.lastY = imageWidth;
                                break;
                            }
                            drawingObject.lastX = photoImage.getImageX() + x;
                            drawingObject.lastY = photoImage.getImageY() + y2;
                            break;
                        }
                        ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                        float filterWidth = (getFilterWidth() * AndroidUtilities.density) / 1.3f;
                        float f3 = filterWidth / f2;
                        drawingObject.lastW = f3;
                        drawingObject.lastH = f3;
                        float timeX = chatMessageCell2.getTimeX() + x;
                        float f4 = filterWidth / 2.0f;
                        f = 3.0f;
                        drawingObject.lastX = Utilities.clamp(timeX - f4, AndroidUtilities.displaySize.x - filterWidth, 0.0f);
                        drawingObject.lastY = (chatMessageCell2.getTimeY() + y2) - f4;
                        break;
                    }
                    i2++;
                    f2 = 3.0f;
                }
                if (!drawingObject.viewFound || drawingObject.lastH + y < this.chatActivity.getChatListViewPadding() || y > this.listView.getMeasuredHeight() - this.chatActivity.blurredViewBottomOffset) {
                    drawingObject.removing = true;
                }
                if (drawingObject.isPremiumSticker) {
                    float f5 = drawingObject.lastH / 2.0f;
                    boolean z = ((float) this.listView.getMeasuredHeight()) - y <= f5;
                    boolean z2 = (y - this.chatActivity.getChatListViewPadding()) + f5 <= 0.0f;
                    if (z || z2) {
                        drawingObject.removing = true;
                    }
                }
                if (drawingObject.removing) {
                    float f6 = drawingObject.removeProgress;
                    if (f6 != 1.0f) {
                        float fClamp = Utilities.clamp(f6 + 0.10666667f, 1.0f, 0.0f);
                        drawingObject.removeProgress = fClamp;
                        drawingObject.imageReceiver.setAlpha(1.0f - fClamp);
                        this.chatActivity.contentView.invalidate();
                    }
                }
            } else {
                f = 3.0f;
                layoutObject(drawingObject);
            }
            boolean z3 = !drawingObject.wasPlayed && drawingObject.removing;
            if (!z3) {
                if (!drawingObject.isPremiumSticker || drawingObject.isMessageEffect) {
                    AnimatedEmojiEffect animatedEmojiEffect = drawingObject.genericEffect;
                    if (animatedEmojiEffect != null) {
                        float f7 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f8 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f9 = drawingObject.lastW * f;
                        int i3 = (int) f7;
                        int i4 = (int) f8;
                        int i5 = (int) (f7 + f9);
                        int i6 = (int) (f8 + f9);
                        Rect rect = animatedEmojiEffect.bounds;
                        rect.set(i3, i4, i5, i6);
                        ImageReceiver imageReceiver = animatedEmojiEffect.effectImageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawingObject.genericEffect.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                        float f10 = drawingObject.lastX + drawingObject.randomOffsetX;
                        float f11 = drawingObject.lastY + drawingObject.randomOffsetY;
                        float f12 = drawingObject.lastW * f;
                        imageReceiver2.setImageCoords(f10, f11, f12, f12);
                        if (drawingObject.isOut) {
                            drawingObject.imageReceiver.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, drawingObject.imageReceiver.getCenterX(), drawingObject.imageReceiver.getCenterY());
                            drawingObject.imageReceiver.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f13 = drawingObject.lastH;
                    float f14 = 1.49926f * f13;
                    float f15 = 0.0546875f * f14;
                    float f16 = (((f13 / 2.0f) + drawingObject.lastY) - (f14 / 2.0f)) - (0.00279f * f14);
                    if (drawingObject.isOut) {
                        drawingObject.imageReceiver.setImageCoords(((drawingObject.lastX + drawingObject.lastW) - f14) + f15, f16, f14, f14);
                    } else {
                        drawingObject.imageReceiver.setImageCoords(drawingObject.lastX - f15, f16, f14, f14);
                    }
                    if (drawingObject.isOut) {
                        drawingObject.imageReceiver.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, drawingObject.imageReceiver.getCenterX(), drawingObject.imageReceiver.getCenterY());
                        drawingObject.imageReceiver.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            AnimatedEmojiEffect animatedEmojiEffect2 = drawingObject.genericEffect;
            boolean z4 = animatedEmojiEffect2 == null ? !(!drawingObject.wasPlayed || drawingObject.imageReceiver.getLottieAnimation() == null || drawingObject.imageReceiver.getLottieAnimation().getCurrentFrame() < drawingObject.imageReceiver.getLottieAnimation().getFramesCount() + (-2)) : System.currentTimeMillis() - animatedEmojiEffect2.startTime > 2500;
            if (drawingObject.removeProgress == 1.0f || z4 || z3) {
                DrawingObject drawingObjectRemove = this.drawingObjects.remove(i);
                if (drawingObject.isPremiumSticker && drawingObject.imageReceiver.getLottieAnimation() != null) {
                    drawingObjectRemove.imageReceiver.getLottieAnimation().setCurrentFrame(0, true, true);
                }
                drawingObjectRemove.imageReceiver.onDetachedFromWindow();
                AnimatedEmojiEffect animatedEmojiEffect3 = drawingObjectRemove.genericEffect;
                if (animatedEmojiEffect3 != null) {
                    animatedEmojiEffect3.removeView(this.contentLayout);
                }
                i--;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                drawingObject.wasPlayed = true;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && !drawingObject.imageReceiver.getLottieAnimation().isRunning()) {
                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, true);
                drawingObject.imageReceiver.getLottieAnimation().start();
            }
            i++;
        }
        if (this.drawingObjects.isEmpty()) {
            onAllEffectsEnd();
        }
        this.contentLayout.invalidate();
    }

    public float getProgress() {
        if (this.drawingObjects.isEmpty()) {
            return -1.0f;
        }
        return ((DrawingObject) zzin.m(1, this.drawingObjects)).getProgress();
    }

    public boolean hasPlaying() {
        if (this.drawingObjects.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            if (this.drawingObjects.get(i).isPlaying()) {
                return true;
            }
        }
        return false;
    }

    public boolean isIdle() {
        return this.drawingObjects.isEmpty();
    }

    public void layoutObject(DrawingObject drawingObject) {
    }

    public void onAllEffectsEnd() {
    }

    public void onAttachedToWindow() {
        this.attached = true;
        checkStickerPack();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onAttachedToWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.setView(this.contentLayout);
            }
        }
    }

    public void onDetachedFromWindow() {
        this.attached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        for (int i = 0; i < this.drawingObjects.size(); i++) {
            this.drawingObjects.get(i).imageReceiver.onDetachedFromWindow();
            if (this.drawingObjects.get(i).genericEffect != null) {
                this.drawingObjects.get(i).genericEffect.removeView(this.contentLayout);
            }
        }
        this.drawingObjects.clear();
    }

    public void onScrolled(int i) {
        for (int i2 = 0; i2 < this.drawingObjects.size(); i2++) {
            if (!this.drawingObjects.get(i2).viewFound) {
                this.drawingObjects.get(i2).lastY -= i;
            }
        }
    }

    public boolean onTapItem(ChatMessageCell chatMessageCell, ChatActivity chatActivity, boolean z) {
        if (chatActivity.isSecretChat() || chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() < 0) {
            return false;
        }
        if (!chatMessageCell.getMessageObject().isPremiumSticker() && chatActivity.currentUser == null) {
            return false;
        }
        boolean zShowAnimationForCell = showAnimationForCell(chatMessageCell, -1, z, false);
        if (z && zShowAnimationForCell && !EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
            try {
                chatMessageCell.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
        if (chatMessageCell.getMessageObject().isPremiumSticker() || chatMessageCell.getEffect() != null || (!z && chatMessageCell.getMessageObject().isAnimatedEmojiStickerSingle())) {
            chatMessageCell.getMessageObject().forcePlayEffect = false;
            chatMessageCell.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
            chatActivity.getMessagesStorage().updateMessageCustomParams(this.dialogId, chatMessageCell.getMessageObject().messageOwner);
            return zShowAnimationForCell;
        }
        Integer printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.dialogId, this.threadMsgId);
        if ((printingStringType == null || printingStringType.intValue() != 5) && this.hintRunnable == null && zShowAnimationForCell && ((Bulletin.getVisibleBulletin() == null || !Bulletin.getVisibleBulletin().isShowing()) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.currentAccount).getClientUserId() != chatActivity.currentUser.id)) {
            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
            StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(chatActivity.getParentActivity(), null, -1, chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji() ? chatMessageCell.getMessageObject().getDocument() : MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(chatMessageCell.getMessageObject().getStickerEmoji()), chatActivity.getResourceProvider());
            stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
            stickerSetBulletinLayout.titleTextView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, chatActivity.currentUser.first_name)), stickerSetBulletinLayout.titleTextView.getPaint().getFontMetricsInt(), false));
            stickerSetBulletinLayout.titleTextView.setTypeface(null);
            stickerSetBulletinLayout.titleTextView.setMaxLines(3);
            stickerSetBulletinLayout.titleTextView.setSingleLine(false);
            final Bulletin bulletinMake = Bulletin.make(chatActivity, stickerSetBulletinLayout, 2750);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    bulletinMake.show();
                    EmojiAnimationsOverlay.this.hintRunnable = null;
                }
            };
            this.hintRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 1500L);
        }
        return zShowAnimationForCell;
    }

    public void preload(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        ArrayList<TLRPC.Document> arrayList;
        String strFindAnimatedEmojiEmoticon = visibleReaction.emojicon;
        if (strFindAnimatedEmojiEmoticon == null) {
            strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, visibleReaction.documentId));
        }
        if (strFindAnimatedEmojiEmoticon == null || (arrayList = this.emojiInteractionsStickersMap.get(strFindAnimatedEmojiEmoticon)) == null || arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(1, arrayList.size());
        for (int i = 0; i < iMin; i++) {
            preloadAnimation(arrayList.get(i));
        }
    }

    public void preloadAnimation(ChatMessageCell chatMessageCell) {
        ArrayList<TLRPC.Document> arrayList;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String strUnwrapEmoji = unwrapEmoji(stickerEmoji);
        if (!supportedEmoji.contains(strUnwrapEmoji) || (arrayList = this.emojiInteractionsStickersMap.get(strUnwrapEmoji)) == null || arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(1, arrayList.size());
        for (int i = 0; i < iMin; i++) {
            preloadAnimation(arrayList.get(i));
        }
    }

    public void setAccount(int i) {
        this.currentAccount = i;
    }

    public boolean showAnimationForActionCell(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        if (this.drawingObjects.size() > 12 || !chatActionCell.getPhotoImage().hasNotThumb()) {
            return false;
        }
        float imageHeight = chatActionCell.getPhotoImage().getImageHeight();
        float imageWidth = chatActionCell.getPhotoImage().getImageWidth();
        if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.drawingObjects.size(); i3++) {
            if (this.drawingObjects.get(i3).messageId == chatActionCell.getMessageObject().getId()) {
                i++;
                if (this.drawingObjects.get(i3).imageReceiver.getLottieAnimation() == null || this.drawingObjects.get(i3).imageReceiver.getLottieAnimation().isGeneratingCache()) {
                    return false;
                }
            }
            if (this.drawingObjects.get(i3).document != null && document != null && this.drawingObjects.get(i3).document.id == document.id) {
                i2++;
            }
        }
        if (i >= 4) {
            return false;
        }
        DrawingObject drawingObject = new DrawingObject();
        drawingObject.isPremiumSticker = true;
        if (!drawingObject.isMessageEffect) {
            drawingObject.randomOffsetX = ((this.random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
            drawingObject.randomOffsetY = ((this.random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
        }
        drawingObject.messageId = chatActionCell.getMessageObject().getId();
        drawingObject.isOut = true;
        drawingObject.imageReceiver.setAllowStartAnimation(true);
        int filterWidth = getFilterWidth();
        if (i2 > 0) {
            Integer num = this.lastAnimationIndex.get(Long.valueOf(document.id));
            int iIntValue = num == null ? 0 : num.intValue();
            this.lastAnimationIndex.put(Long.valueOf(document.id), Integer.valueOf((iIntValue + 1) % 4));
            drawingObject.imageReceiver.setUniqKeyPrefix(iIntValue + "_" + drawingObject.messageId + "_");
        }
        drawingObject.document = document;
        drawingObject.imageReceiver.setImage(ImageLocation.getForDocument(videoSize, document), DiffUtil.m(filterWidth, filterWidth, "_"), null, "tgs", this.set, 1);
        drawingObject.imageReceiver.setLayerNum(Integer.MAX_VALUE);
        drawingObject.imageReceiver.setAutoRepeat(0);
        if (drawingObject.imageReceiver.getLottieAnimation() != null) {
            if (drawingObject.isPremiumSticker) {
                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
            }
            drawingObject.imageReceiver.getLottieAnimation().start();
        }
        this.drawingObjects.add(drawingObject);
        if (this.attached) {
            drawingObject.imageReceiver.onAttachedToWindow();
            drawingObject.imageReceiver.setParentView(this.contentLayout);
        }
        this.contentLayout.invalidate();
        return true;
    }

    public boolean showAnimationForCell(ChatMessageCell chatMessageCell, int i, boolean z, boolean z2) {
        if (chatMessageCell == null || this.drawingObjects.size() > 12) {
            return false;
        }
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (chatMessageCell.getEffect() == null && !chatMessageCell.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (chatMessageCell.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
        float imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
        if (chatMessageCell.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return createDrawingObject(unwrapEmoji(stickerEmoji), chatMessageCell.getMessageObject().getId(), chatMessageCell.getMessageObject().getDocument(), messageObject, i, z, z2, imageWidth, imageHeight, chatMessageCell.getMessageObject().isOutOwner());
        }
        return false;
    }

    public boolean showAnimationForWidget(StoryReactionWidgetView storyReactionWidgetView) {
        float f;
        float width;
        if (this.drawingObjects.size() > 12) {
            return false;
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(storyReactionWidgetView.mediaArea.reaction);
        String strFindAnimatedEmojiEmoticon = visibleReactionFromTL.emojicon;
        if (strFindAnimatedEmojiEmoticon == null) {
            strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, visibleReactionFromTL.documentId));
        }
        float measuredHeight = storyReactionWidgetView.getMeasuredHeight();
        float measuredWidth = storyReactionWidgetView.getMeasuredWidth();
        View view = (View) storyReactionWidgetView.getParent();
        if (measuredWidth > view.getWidth() * 0.5f) {
            width = view.getWidth() * 0.4f;
            f = width;
        } else {
            f = measuredHeight;
            width = measuredWidth;
        }
        String strUnwrapEmoji = unwrapEmoji(strFindAnimatedEmojiEmoticon);
        int iHashCode = storyReactionWidgetView.hashCode();
        boolean z = storyReactionWidgetView.getTranslationX() > ((float) this.contentLayout.getMeasuredWidth()) / 2.0f;
        if (visibleReactionFromTL.emojicon != null && createDrawingObject(strUnwrapEmoji, iHashCode, null, null, -1, false, false, width, f, z)) {
            if (!this.drawingObjects.isEmpty()) {
                DrawingObject drawingObject = (DrawingObject) zzin.m(1, this.drawingObjects);
                drawingObject.isReaction = true;
                drawingObject.lastH = f;
                drawingObject.lastW = width;
                drawingObject.lastX = storyReactionWidgetView.getTranslationX() - (drawingObject.lastW / 2.0f);
                float translationY = storyReactionWidgetView.getTranslationY();
                float f2 = drawingObject.lastW;
                drawingObject.lastY = translationY - (1.5f * f2);
                if (drawingObject.isOut) {
                    drawingObject.lastX = ((-f2) * 1.8f) + drawingObject.lastX;
                } else {
                    drawingObject.lastX = ((-f2) * 0.2f) + drawingObject.lastX;
                }
            }
            return true;
        }
        if (visibleReactionFromTL.documentId == 0 || storyReactionWidgetView.getAnimatedEmojiDrawable() == null) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.drawingObjects.size(); i2++) {
            if (this.drawingObjects.get(i2).documentId == visibleReactionFromTL.documentId) {
                i++;
            }
        }
        if (i >= 4) {
            return false;
        }
        DrawingObject drawingObject2 = new DrawingObject();
        drawingObject2.genericEffect = new AnimatedEmojiEffect(storyReactionWidgetView.getAnimatedEmojiDrawable(), UserConfig.selectedAccount, true, true);
        if (!drawingObject2.isMessageEffect) {
            drawingObject2.randomOffsetX = ((this.random.nextInt() % 101) / 100.0f) * (width / 4.0f);
            drawingObject2.randomOffsetY = ((this.random.nextInt() % 101) / 100.0f) * (f / 4.0f);
        }
        drawingObject2.messageId = iHashCode;
        drawingObject2.document = null;
        drawingObject2.documentId = visibleReactionFromTL.documentId;
        drawingObject2.isOut = z;
        drawingObject2.isReaction = true;
        drawingObject2.lastH = f;
        drawingObject2.lastW = width;
        drawingObject2.lastX = storyReactionWidgetView.getTranslationX() - (drawingObject2.lastW / 2.0f);
        float translationY2 = storyReactionWidgetView.getTranslationY();
        float f3 = drawingObject2.lastW;
        drawingObject2.lastY = translationY2 - (1.5f * f3);
        drawingObject2.lastX = ((-f3) * 1.8f) + drawingObject2.lastX;
        if (this.attached) {
            drawingObject2.genericEffect.setView(this.contentLayout);
        }
        this.drawingObjects.add(drawingObject2);
        return true;
    }

    public boolean supports(String str) {
        return this.emojiInteractionsStickersMap.containsKey(unwrapEmoji(str));
    }

    private void preloadAnimation(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap<Long, Boolean> map = this.preloaded;
        if (map == null || !map.containsKey(Long.valueOf(document.id))) {
            if (this.preloaded == null) {
                this.preloaded = new HashMap<>();
            }
            this.preloaded.put(Long.valueOf(document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public EmojiAnimationsOverlay(ChatActivity chatActivity, FrameLayout frameLayout, RecyclerListView recyclerListView, int i, long j, long j2) {
        this.chatActivity = chatActivity;
        this.contentLayout = frameLayout;
        this.listView = recyclerListView;
        this.currentAccount = i;
        this.dialogId = j;
        this.threadMsgId = j2;
    }
}
