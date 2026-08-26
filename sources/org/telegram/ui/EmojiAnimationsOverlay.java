package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.wearable.zzy;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.StickerSetBulletinLayout;

public class EmojiAnimationsOverlay implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet excludeEmojiFromPack;
    public static final HashSet supportedEmoji = new HashSet();
    public boolean attached;
    public final ChatActivity chatActivity;
    public final FrameLayout contentLayout;
    public int currentAccount;
    public final long dialogId;
    public zzy hintRunnable;
    public String lastTappedEmoji;
    public final ChatActivity.AnonymousClass21 listView;
    public HashMap preloaded;
    public ComposeDrawable$$ExternalSyntheticLambda0 sentInteractionsRunnable;
    public TLRPC.TL_messages_stickerSet set;
    public final long threadMsgId;
    public boolean inited = false;
    public final HashMap emojiInteractionsStickersMap = new HashMap();
    public final HashMap lastAnimationIndex = new HashMap();
    public final Random random = new Random();
    public int lastTappedMsgId = -1;
    public long lastTappedTime = 0;
    public final ArrayList timeIntervals = new ArrayList();
    public final ArrayList animationIndexes = new ArrayList();
    public final ArrayList drawingObjects = new ArrayList();

    public final class AnonymousClass1 implements Runnable {
        public final int $r8$classId = 1;
        public final Object this$0;
        public int val$animation;
        public int val$messageId;

        public AnonymousClass1(NumberPicker numberPicker) {
            this.this$0 = numberPicker;
        }

        public void cancel() {
            this.val$animation = 0;
            this.val$messageId = 0;
            NumberPicker numberPicker = (NumberPicker) this.this$0;
            numberPicker.removeCallbacks(this);
            if (numberPicker.mIncrementVirtualButtonPressed) {
                numberPicker.mIncrementVirtualButtonPressed = false;
                numberPicker.invalidate(0, numberPicker.mBottomSelectionDividerBottom, numberPicker.getRight(), numberPicker.getBottom());
            }
            numberPicker.mDecrementVirtualButtonPressed = false;
        }

        @Override
        public final void run() {
            ChatMessageCell chatMessageCell;
            ChatActivity chatActivity;
            switch (this.$r8$classId) {
                case 0:
                    EmojiAnimationsOverlay emojiAnimationsOverlay = (EmojiAnimationsOverlay) this.this$0;
                    if (emojiAnimationsOverlay.attached) {
                        int i = 0;
                        while (true) {
                            ChatActivity.AnonymousClass21 anonymousClass21 = emojiAnimationsOverlay.listView;
                            if (i < anonymousClass21.getChildCount()) {
                                View childAt = anonymousClass21.getChildAt(i);
                                if (childAt instanceof ChatMessageCell) {
                                    chatMessageCell = (ChatMessageCell) childAt;
                                    String stickerEmoji = chatMessageCell.getMessageObject().getStickerEmoji();
                                    if (stickerEmoji == null) {
                                        stickerEmoji = chatMessageCell.getMessageObject().messageOwner.message;
                                    }
                                    if (!chatMessageCell.getPhotoImage().hasNotThumb() || stickerEmoji == null || chatMessageCell.getMessageObject().getId() != this.val$messageId) {
                                    }
                                }
                                i++;
                            } else {
                                chatMessageCell = null;
                            }
                        }
                        if (chatMessageCell != null && (chatActivity = emojiAnimationsOverlay.chatActivity) != null) {
                            chatActivity.restartSticker(chatMessageCell);
                            if (!EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                                try {
                                    chatMessageCell.performHapticFeedback(3);
                                    break;
                                } catch (Exception unused) {
                                }
                            }
                            emojiAnimationsOverlay.showAnimationForCell(chatMessageCell, this.val$animation, false, true);
                            break;
                        }
                    }
                    break;
                default:
                    int i2 = this.val$animation;
                    NumberPicker numberPicker = (NumberPicker) this.this$0;
                    if (i2 == 1) {
                        int i3 = this.val$messageId;
                        if (i3 == 1) {
                            numberPicker.mIncrementVirtualButtonPressed = true;
                            numberPicker.invalidate(0, numberPicker.mBottomSelectionDividerBottom, numberPicker.getRight(), numberPicker.getBottom());
                            break;
                        } else if (i3 == 2) {
                            numberPicker.mDecrementVirtualButtonPressed = true;
                            numberPicker.invalidate(0, 0, numberPicker.getRight(), numberPicker.mTopSelectionDividerTop);
                            break;
                        }
                    } else if (i2 == 2) {
                        int i4 = this.val$messageId;
                        if (i4 == 1) {
                            if (!numberPicker.mIncrementVirtualButtonPressed) {
                                numberPicker.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                            }
                            numberPicker.mIncrementVirtualButtonPressed = (byte) (!numberPicker.mIncrementVirtualButtonPressed ? 1 : 0);
                            numberPicker.invalidate(0, numberPicker.mBottomSelectionDividerBottom, numberPicker.getRight(), numberPicker.getBottom());
                            break;
                        } else if (i4 == 2) {
                            if (!numberPicker.mDecrementVirtualButtonPressed) {
                                numberPicker.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                            }
                            numberPicker.mDecrementVirtualButtonPressed = (byte) (!numberPicker.mDecrementVirtualButtonPressed ? 1 : 0);
                            numberPicker.invalidate(0, 0, numberPicker.getRight(), numberPicker.mTopSelectionDividerTop);
                            break;
                        }
                    }
                    break;
            }
        }

        public AnonymousClass1(EmojiAnimationsOverlay emojiAnimationsOverlay, int i, int i2) {
            this.this$0 = emojiAnimationsOverlay;
            this.val$messageId = i;
            this.val$animation = i2;
        }
    }

    public final class DrawingObject {
        public TLRPC.Document document;
        public long documentId;
        public String fileName;
        public AnimatedEmojiEffect genericEffect;
        public final ImageReceiver imageReceiver;
        public boolean isMessageEffect;
        public boolean isOut;
        public boolean isPremiumSticker;
        public float lastH;
        public float lastW;
        public float lastX;
        public float lastY;
        public int messageId;
        public float randomOffsetX;
        public float randomOffsetY;
        public float removeProgress;
        public boolean removing;
        public boolean viewFound;
        public boolean wasPlayed;

        public DrawingObject() {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setAllowDrawWhileCacheGenerating(true);
        }
    }

    static {
        HashSet hashSet = new HashSet();
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

    public static boolean checkPosition(ChatMessageCell chatMessageCell, float f, int i) {
        float centerY = chatMessageCell.getPhotoImage().getCenterY() + chatMessageCell.getY();
        return centerY > f && centerY < ((float) i);
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

    public final void checkStickerPack() {
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
                    HashSet hashSet = supportedEmoji;
                    hashSet.add(tL_stickerPack.emoticon);
                    ArrayList arrayList = new ArrayList();
                    HashMap map2 = this.emojiInteractionsStickersMap;
                    map2.put(tL_stickerPack.emoticon, arrayList);
                    for (int i3 = 0; i3 < tL_stickerPack.documents.size(); i3++) {
                        arrayList.add((TLRPC.Document) map.get(tL_stickerPack.documents.get(i3)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i4 = 0; i4 < 8; i4++) {
                            String str = strArr[i4];
                            hashSet.add(str);
                            map2.put(str, arrayList);
                        }
                    }
                }
            }
            this.inited = true;
        }
    }

    public final void clear$1() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.drawingObjects;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((DrawingObject) arrayList.get(i)).imageReceiver.onDetachedFromWindow();
            if (((DrawingObject) arrayList.get(i)).genericEffect != null) {
                ((DrawingObject) arrayList.get(i)).genericEffect.removeView(this.contentLayout);
            }
            i++;
        }
    }

    public final boolean createDrawingObject(String str, int i, TLRPC.Document document, final MessageObject messageObject, int i2, final boolean z, boolean z2, float f, float f2, boolean z3) {
        Random random;
        long j;
        TLRPC.Document document2;
        int iAbs;
        TLRPC.VideoSize premiumStickerAnimation;
        ImageReceiver imageReceiver;
        String str2;
        ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0;
        int iAbs2 = i2;
        boolean z4 = messageObject != null && messageObject.isPremiumSticker();
        boolean z5 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z5 || z4 || supportedEmoji.contains(str)) {
            ArrayList arrayList = (ArrayList) this.emojiInteractionsStickersMap.get(str);
            if (z5 || ((arrayList != null && !arrayList.isEmpty()) || z4)) {
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = this.drawingObjects;
                    if (i3 >= arrayList2.size()) {
                        if (z && z4 && i4 > 0) {
                            Bulletin bulletin = Bulletin.visibleBulletin;
                            if (bulletin != null && bulletin.hash == messageObject.getId()) {
                                return false;
                            }
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.currentAccount).getStickerSetByName(inputStickerSet.short_name) : null;
                            if (stickerSetByName == null) {
                                stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetById(inputStickerSet.id);
                            }
                            if (stickerSetByName != null) {
                                showStickerSetBulletin(stickerSetByName, messageObject);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new LinkManager$$ExternalSyntheticLambda8(12, this, messageObject));
                            return false;
                        }
                        if (i4 >= 4) {
                            return false;
                        }
                        Random random2 = this.random;
                        if (z5) {
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
                            random = random2;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i6);
                                long j3 = j2;
                                if (document2 != null && document2.id == j3) {
                                    break;
                                }
                                i6++;
                                j2 = j3;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                z4 = premiumStickerAnimation != null;
                            } else {
                                premiumStickerAnimation = null;
                            }
                        } else {
                            random = random2;
                            j = 0;
                            if (z4) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                                    if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                        iAbs2 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(iAbs2);
                                } else {
                                    if (iAbs2 < 0 || iAbs2 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i7);
                                            if (document3 != null) {
                                                HashMap map = this.preloaded;
                                                Boolean bool = map != null ? (Boolean) map.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i7));
                                                }
                                            }
                                        }
                                        iAbs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        iAbs = iAbs2;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(iAbs);
                                    iAbs2 = iAbs;
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        final DrawingObject drawingObject = new DrawingObject();
                        drawingObject.isPremiumSticker = z4;
                        drawingObject.isMessageEffect = z5;
                        if (!z5) {
                            drawingObject.randomOffsetX = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                            drawingObject.randomOffsetY = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        }
                        drawingObject.messageId = i;
                        drawingObject.document = document2;
                        drawingObject.isOut = z3;
                        ImageReceiver imageReceiver2 = drawingObject.imageReceiver;
                        imageReceiver2.setAllowStartAnimation(true);
                        imageReceiver2.setAllowLottieVibration(z);
                        boolean z6 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap map2 = this.lastAnimationIndex;
                        int i8 = iAbs2;
                        if (premiumStickerAnimation == null) {
                            int filterWidth = getFilterWidth();
                            Integer num = (Integer) map2.get(Long.valueOf(document2.id));
                            int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                            map2.put(Long.valueOf(document2.id), Integer.valueOf(iIntValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            imageReceiver2.setUniqKeyPrefix(iIntValue + "_" + drawingObject.messageId + "_");
                            StringBuilder sb = new StringBuilder();
                            sb.append(filterWidth);
                            sb.append("_");
                            sb.append(filterWidth);
                            sb.append(z6 ? "_pcache" : "");
                            imageReceiver2.setImage(forDocument, sb.toString(), null, "tgs", this.set, 1);
                            imageReceiver = imageReceiver2;
                            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                                @Override
                                public final void didSetImage(ImageReceiver imageReceiver3, boolean z7, boolean z8, boolean z9) {
                                    DrawingObject drawingObject2 = drawingObject;
                                    if (drawingObject2.imageReceiver.getLottieAnimation() != null) {
                                        drawingObject2.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                                    }
                                }

                                @Override
                                public final void didSetImageBitmap(int i9, String str3, Drawable drawable) {
                                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i9, str3, drawable);
                                }

                                @Override
                                public final void onAnimationReady(ImageReceiver imageReceiver3) {
                                    MessageObject messageObject2;
                                    if (z && (messageObject2 = messageObject) != null && messageObject2.isAnimatedAnimatedEmoji() && imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().vibrationPattern == null) {
                                        try {
                                            EmojiAnimationsOverlay.this.contentLayout.performHapticFeedback(3, 1);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            });
                            if (imageReceiver.getLottieAnimation() != null) {
                                imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                            }
                        } else {
                            imageReceiver = imageReceiver2;
                            int filterWidth2 = getFilterWidth();
                            if (i5 > 0) {
                                Integer num2 = (Integer) map2.get(Long.valueOf(document2.id));
                                int iIntValue2 = num2 == null ? 0 : num2.intValue();
                                map2.put(Long.valueOf(document2.id), Integer.valueOf((iIntValue2 + 1) % 4));
                                imageReceiver.setUniqKeyPrefix(iIntValue2 + "_" + drawingObject.messageId + "_");
                            }
                            drawingObject.document = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(filterWidth2);
                            sb2.append("_");
                            sb2.append(filterWidth2);
                            sb2.append(z6 ? "_pcache" : "");
                            imageReceiver.setImage(forDocument2, sb2.toString(), null, "tgs", this.set, 1);
                        }
                        imageReceiver.setLayerNum(Integer.MAX_VALUE);
                        imageReceiver.setAutoRepeat(0);
                        if (imageReceiver.getLottieAnimation() != null) {
                            if (drawingObject.isPremiumSticker) {
                                imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                            }
                            imageReceiver.getLottieAnimation().start();
                        }
                        arrayList2.add(drawingObject);
                        imageReceiver.onAttachedToWindow();
                        FrameLayout frameLayout = this.contentLayout;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (!z || z4 || UserConfig.getInstance(this.currentAccount).clientUserId == this.dialogId) {
                            str2 = str;
                        } else {
                            int i9 = this.lastTappedMsgId;
                            if (i9 != 0 && i9 != i && (composeDrawable$$ExternalSyntheticLambda0 = this.sentInteractionsRunnable) != null) {
                                AndroidUtilities.cancelRunOnUIThread(composeDrawable$$ExternalSyntheticLambda0);
                                this.sentInteractionsRunnable.run();
                            }
                            this.lastTappedMsgId = i;
                            str2 = str;
                            this.lastTappedEmoji = str2;
                            long j4 = this.lastTappedTime;
                            ArrayList arrayList4 = this.animationIndexes;
                            ArrayList arrayList5 = this.timeIntervals;
                            if (j4 == j) {
                                this.lastTappedTime = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j));
                                arrayList4.add(Integer.valueOf(i8));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.lastTappedTime));
                                arrayList4.add(Integer.valueOf(i8));
                            }
                            ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda1 = this.sentInteractionsRunnable;
                            if (composeDrawable$$ExternalSyntheticLambda1 != null) {
                                AndroidUtilities.cancelRunOnUIThread(composeDrawable$$ExternalSyntheticLambda1);
                                this.sentInteractionsRunnable = null;
                            }
                            ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda2 = new ComposeDrawable$$ExternalSyntheticLambda0(this, 18);
                            this.sentInteractionsRunnable = composeDrawable$$ExternalSyntheticLambda2;
                            AndroidUtilities.runOnUIThread(composeDrawable$$ExternalSyntheticLambda2, 500L);
                        }
                        if (!z2) {
                            return true;
                        }
                        MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadMsgId, 11, str2, 0);
                        return true;
                    }
                    if (((DrawingObject) arrayList2.get(i3)).messageId == i) {
                        i4++;
                        if (!z5 && (((DrawingObject) arrayList2.get(i3)).imageReceiver.getLottieAnimation() == null || ((DrawingObject) arrayList2.get(i3)).imageReceiver.getLottieAnimation().isGeneratingCache())) {
                            return false;
                        }
                    }
                    if (((DrawingObject) arrayList2.get(i3)).document != null && document != null) {
                        if (((DrawingObject) arrayList2.get(i3)).document.id == document.id) {
                            i5++;
                        }
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Integer printingStringType;
        if (i == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                checkStickerPack();
                return;
            }
            return;
        }
        int i3 = NotificationCenter.onEmojiInteractionsReceived;
        long j = this.dialogId;
        if (i != i3) {
            if (i == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(j, this.threadMsgId)) != null && printingStringType.intValue() == 5) {
                zzy zzyVar = this.hintRunnable;
                if (zzyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(zzyVar);
                }
                this.hintRunnable = null;
                return;
            }
            return;
        }
        if (this.chatActivity == null) {
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (jLongValue == j && supportedEmoji.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i4 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        AndroidUtilities.runOnUIThread(new AnonymousClass1(this, i4, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void draw(Canvas canvas) {
        float f;
        float y;
        MessageObject messageObject;
        ImageReceiver photoImage;
        if (this.drawingObjects.isEmpty()) {
            return;
        }
        int i = 0;
        while (i < this.drawingObjects.size()) {
            DrawingObject drawingObject = (DrawingObject) this.drawingObjects.get(i);
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
                if (!drawingObject.viewFound || drawingObject.lastH + y < this.chatActivity.chatListViewPaddingTop || y > this.listView.getMeasuredHeight() - this.chatActivity.blurredViewBottomOffset) {
                    drawingObject.removing = true;
                }
                if (drawingObject.isPremiumSticker) {
                    float f5 = drawingObject.lastH / 2.0f;
                    boolean z = ((float) this.listView.getMeasuredHeight()) - y <= f5;
                    boolean z2 = (y - this.chatActivity.chatListViewPaddingTop) + f5 <= 0.0f;
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
                        animatedEmojiEffect.bounds.set((int) f7, (int) f8, (int) (f7 + f9), (int) (f8 + f9));
                        ImageReceiver imageReceiver = animatedEmojiEffect.effectImageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(animatedEmojiEffect.bounds);
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
            boolean z4 = animatedEmojiEffect2 == null ? !(!drawingObject.wasPlayed || drawingObject.imageReceiver.getLottieAnimation() == null || drawingObject.imageReceiver.getLottieAnimation().currentFrame < drawingObject.imageReceiver.getLottieAnimation().metaData[0] + (-2)) : System.currentTimeMillis() - animatedEmojiEffect2.startTime > 2500;
            if (drawingObject.removeProgress == 1.0f || z4 || z3) {
                DrawingObject drawingObject2 = (DrawingObject) this.drawingObjects.remove(i);
                if (drawingObject.isPremiumSticker && drawingObject.imageReceiver.getLottieAnimation() != null) {
                    drawingObject2.imageReceiver.getLottieAnimation().setCurrentFrame(0, true, true);
                }
                drawingObject2.imageReceiver.onDetachedFromWindow();
                AnimatedEmojiEffect animatedEmojiEffect3 = drawingObject2.genericEffect;
                if (animatedEmojiEffect3 != null) {
                    animatedEmojiEffect3.removeView(this.contentLayout);
                }
                i--;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && drawingObject.imageReceiver.getLottieAnimation().isRunning) {
                drawingObject.wasPlayed = true;
            } else if (drawingObject.imageReceiver.getLottieAnimation() != null && !drawingObject.imageReceiver.getLottieAnimation().isRunning) {
                drawingObject.imageReceiver.getLottieAnimation().setCurrentFrame(0, true, false);
                drawingObject.imageReceiver.getLottieAnimation().start();
            }
            i++;
        }
        if (this.drawingObjects.isEmpty()) {
            onAllEffectsEnd();
        }
        this.contentLayout.invalidate();
    }

    public final boolean isIdle() {
        return this.drawingObjects.isEmpty();
    }

    public void layoutObject(DrawingObject drawingObject) {
    }

    public void onAllEffectsEnd() {
    }

    public final void onAttachedToWindow() {
        this.attached = true;
        checkStickerPack();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.drawingObjects;
            if (i >= arrayList.size()) {
                return;
            }
            ((DrawingObject) arrayList.get(i)).imageReceiver.onAttachedToWindow();
            if (((DrawingObject) arrayList.get(i)).genericEffect != null) {
                ((DrawingObject) arrayList.get(i)).genericEffect.setView(this.contentLayout);
            }
            i++;
        }
    }

    public final void onDetachedFromWindow() {
        int i = 0;
        this.attached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.drawingObjects;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((DrawingObject) arrayList.get(i)).imageReceiver.onDetachedFromWindow();
            if (((DrawingObject) arrayList.get(i)).genericEffect != null) {
                ((DrawingObject) arrayList.get(i)).genericEffect.removeView(this.contentLayout);
            }
            i++;
        }
    }

    public final void onTapItem(ChatMessageCell chatMessageCell, ChatActivity chatActivity, boolean z) {
        if (chatActivity.isSecretChat() || chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().getId() < 0) {
            return;
        }
        if (chatMessageCell.getMessageObject().isPremiumSticker() || chatActivity.currentUser != null) {
            boolean zShowAnimationForCell = showAnimationForCell(chatMessageCell, -1, z, false);
            if (z && zShowAnimationForCell && !EmojiData.hasEmojiSupportVibration(chatMessageCell.getMessageObject().getStickerEmoji()) && !chatMessageCell.getMessageObject().isPremiumSticker() && !chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    chatMessageCell.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean zIsPremiumSticker = chatMessageCell.getMessageObject().isPremiumSticker();
            long j = this.dialogId;
            if (zIsPremiumSticker || chatMessageCell.getEffect() != null || (!z && chatMessageCell.getMessageObject().isAnimatedEmojiStickerSingle())) {
                chatMessageCell.getMessageObject().forcePlayEffect = false;
                chatMessageCell.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                chatActivity.getMessagesStorage().updateMessageCustomParams(j, chatMessageCell.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.currentAccount).getPrintingStringType(j, this.threadMsgId);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.hintRunnable == null && zShowAnimationForCell) {
                Bulletin bulletin = Bulletin.visibleBulletin;
                if ((bulletin == null || !bulletin.showing) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.currentAccount).getClientUserId() != chatActivity.currentUser.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(chatActivity.getParentActivity(), null, 1, -1, chatMessageCell.getMessageObject().isAnimatedAnimatedEmoji() ? chatMessageCell.getMessageObject().getDocument() : MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(chatMessageCell.getMessageObject().getStickerEmoji()), chatActivity.getResourceProvider());
                    stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                    TextView textView = stickerSetBulletinLayout.titleTextView;
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, chatActivity.currentUser.first_name)), textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    zzy zzyVar = new zzy(12, (ChatActivity.AnonymousClass51) this, Bulletin.make(chatActivity, stickerSetBulletinLayout, 2750));
                    this.hintRunnable = zzyVar;
                    AndroidUtilities.runOnUIThread(zzyVar, 1500L);
                }
            }
        }
    }

    public final void preloadAnimation(ChatMessageCell chatMessageCell) {
        ArrayList arrayList;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String strUnwrapEmoji = unwrapEmoji(stickerEmoji);
        if (!supportedEmoji.contains(strUnwrapEmoji) || (arrayList = (ArrayList) this.emojiInteractionsStickersMap.get(strUnwrapEmoji)) == null || arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(1, arrayList.size());
        for (int i = 0; i < iMin; i++) {
            preloadAnimation((TLRPC.Document) arrayList.get(i));
        }
    }

    public final boolean showAnimationForCell(ChatMessageCell chatMessageCell, int i, boolean z, boolean z2) {
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

    public final void showStickerSetBulletin(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity == null || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || chatActivity.getParentActivity() == null) {
            return;
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(this.contentLayout.getContext(), null, 1, -1, messageObject.getDocument(), chatActivity.getResourceProvider());
        stickerSetBulletinLayout.titleTextView.setText(tL_messages_stickerSet.set.title);
        stickerSetBulletinLayout.subtitleTextView.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(chatActivity.getParentActivity(), chatActivity.getResourceProvider(), true, false);
        stickerSetBulletinLayout.setButton(undoButton);
        undoButton.undoAction = new DialogsActivity$$ExternalSyntheticLambda8(26, this, messageObject);
        String string = LocaleController.getString(R.string.ViewAction);
        TextView textView = undoButton.undoTextView;
        if (textView != null) {
            textView.setText(string);
        }
        Bulletin bulletinMake = Bulletin.make(chatActivity, stickerSetBulletinLayout, 2750);
        bulletinMake.hash = messageObject.getId();
        bulletinMake.show();
    }

    public final void preloadAnimation(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap map = this.preloaded;
        if (map == null || !map.containsKey(Long.valueOf(document.id))) {
            if (this.preloaded == null) {
                this.preloaded = new HashMap();
            }
            this.preloaded.put(Long.valueOf(document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public EmojiAnimationsOverlay(ChatActivity chatActivity, FrameLayout frameLayout, ChatActivity.AnonymousClass21 anonymousClass21, int i, long j, long j2) {
        this.chatActivity = chatActivity;
        this.contentLayout = frameLayout;
        this.listView = anonymousClass21;
        this.currentAccount = i;
        this.dialogId = j;
        this.threadMsgId = j2;
    }
}
