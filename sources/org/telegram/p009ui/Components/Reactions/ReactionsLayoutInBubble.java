package org.telegram.p009ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ChatListItemAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AvatarsDrawable;
import org.telegram.p009ui.Components.CounterView;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessagePeerReaction;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$User;

public class ReactionsLayoutInBubble {
    private static int animationUniq;
    private int animateFromTotalHeight;
    private boolean animateHeight;
    private boolean animateMove;
    private boolean animateWidth;
    boolean attached;
    public float drawServiceShaderBackground;
    public int fromWidth;
    private float fromX;
    private float fromY;
    public boolean hasUnreadReactions;
    public int height;
    public boolean isEmpty;
    public boolean isSmall;
    private int lastDrawTotalHeight;
    private int lastDrawnWidth;
    private float lastDrawnX;
    private float lastDrawnY;
    public int lastLineX;
    ReactionButton lastSelectedButton;
    float lastX;
    float lastY;
    Runnable longPressRunnable;
    MessageObject messageObject;
    ChatMessageCell parentView;
    public int positionOffsetY;
    boolean pressed;
    Theme.ResourcesProvider resourcesProvider;
    private String scrimViewReaction;
    public int totalHeight;
    private float touchSlop;
    private boolean wasDrawn;
    public int width;
    public int f1131x;
    public int f1132y;
    private static Paint paint = new Paint(1);
    private static TextPaint textPaint = new TextPaint(1);
    private static final ButtonsComparator comparator = new ButtonsComparator();
    private static int pointer = 1;
    private static final Comparator<TLRPC$User> usersComparator = ReactionsLayoutInBubble$$ExternalSyntheticLambda1.INSTANCE;
    ArrayList<ReactionButton> reactionButtons = new ArrayList<>();
    ArrayList<ReactionButton> outButtons = new ArrayList<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtons = new HashMap<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtonsTmp = new HashMap<>();
    HashMap<VisibleReaction, ImageReceiver> animatedReactions = new HashMap<>();
    int currentAccount = UserConfig.selectedAccount;

    public static int lambda$static$0(TLRPC$User tLRPC$User, TLRPC$User tLRPC$User2) {
        return (int) (tLRPC$User.f995id - tLRPC$User2.f995id);
    }

    public ReactionsLayoutInBubble(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
        paint.setColor(Theme.getColor("chat_inLoader", this.resourcesProvider));
        textPaint.setColor(Theme.getColor("featuredStickers_buttonText", this.resourcesProvider));
        textPaint.setTextSize(AndroidUtilities.m35dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean equalsTLReaction(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2) {
        if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon);
        }
        return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id;
    }

    public void setMessage(MessageObject messageObject, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.isSmall = z;
        this.messageObject = messageObject;
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.reactionButtons.get(i).detach();
        }
        this.hasUnreadReactions = false;
        this.reactionButtons.clear();
        if (messageObject != null) {
            comparator.dialogId = messageObject.getDialogId();
            TLRPC$TL_messageReactions tLRPC$TL_messageReactions = messageObject.messageOwner.reactions;
            if (tLRPC$TL_messageReactions != null && tLRPC$TL_messageReactions.results != null) {
                int i2 = 0;
                for (int i3 = 0; i3 < messageObject.messageOwner.reactions.results.size(); i3++) {
                    i2 += messageObject.messageOwner.reactions.results.get(i3).count;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= messageObject.messageOwner.reactions.results.size()) {
                        break;
                    }
                    TLRPC$ReactionCount tLRPC$ReactionCount = messageObject.messageOwner.reactions.results.get(i4);
                    ReactionButton reactionButton = new ReactionButton(tLRPC$ReactionCount, z);
                    this.reactionButtons.add(reactionButton);
                    if (!z && messageObject.messageOwner.reactions.recent_reactions != null) {
                        ArrayList<TLRPC$User> arrayList = null;
                        if (messageObject.getDialogId() > 0) {
                            ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
                            if (tLRPC$ReactionCount.count == 2) {
                                arrayList2.add(UserConfig.getInstance(this.currentAccount).getCurrentUser());
                                arrayList2.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                            } else if (tLRPC$ReactionCount.chosen) {
                                arrayList2.add(UserConfig.getInstance(this.currentAccount).getCurrentUser());
                            } else {
                                arrayList2.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())));
                            }
                            reactionButton.setUsers(arrayList2);
                            if (!arrayList2.isEmpty()) {
                                reactionButton.count = 0;
                                reactionButton.counterDrawable.setCount(0, false);
                            }
                        } else if (tLRPC$ReactionCount.count <= 3 && i2 <= 3) {
                            for (int i5 = 0; i5 < messageObject.messageOwner.reactions.recent_reactions.size(); i5++) {
                                TLRPC$MessagePeerReaction tLRPC$MessagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i5);
                                if (VisibleReaction.fromTLReaction(tLRPC$MessagePeerReaction.reaction).equals(VisibleReaction.fromTLReaction(tLRPC$ReactionCount.reaction)) && MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$MessagePeerReaction.peer_id))) != null) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$MessagePeerReaction.peer_id))));
                                }
                            }
                            reactionButton.setUsers(arrayList);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                reactionButton.count = 0;
                                reactionButton.counterDrawable.setCount(0, false);
                            }
                        }
                    }
                    if (z && tLRPC$ReactionCount.count > 1 && tLRPC$ReactionCount.chosen) {
                        this.reactionButtons.add(new ReactionButton(tLRPC$ReactionCount, z));
                        this.reactionButtons.get(0).isSelected = false;
                        this.reactionButtons.get(1).isSelected = true;
                        this.reactionButtons.get(0).realCount = 1;
                        this.reactionButtons.get(1).realCount = 1;
                        this.reactionButtons.get(1).key += "_";
                        break;
                    }
                    if (z && i4 == 2) {
                        break;
                    }
                    if (this.attached) {
                        reactionButton.attach();
                    }
                    i4++;
                }
            }
            if (!z && !this.reactionButtons.isEmpty()) {
                ButtonsComparator buttonsComparator = comparator;
                buttonsComparator.currentAccount = this.currentAccount;
                Collections.sort(this.reactionButtons, buttonsComparator);
                for (int i6 = 0; i6 < this.reactionButtons.size(); i6++) {
                    TLRPC$ReactionCount tLRPC$ReactionCount2 = this.reactionButtons.get(i6).reactionCount;
                    int i7 = pointer;
                    pointer = i7 + 1;
                    tLRPC$ReactionCount2.lastDrawnPosition = i7;
                }
            }
            this.hasUnreadReactions = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        this.isEmpty = this.reactionButtons.isEmpty();
    }

    public void measure(int i, int i2) {
        this.height = 0;
        this.width = 0;
        this.positionOffsetY = 0;
        this.totalHeight = 0;
        if (this.isEmpty) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.reactionButtons.size(); i6++) {
            ReactionButton reactionButton = this.reactionButtons.get(i6);
            if (reactionButton.isSmall) {
                reactionButton.width = AndroidUtilities.m35dp(14.0f);
                reactionButton.height = AndroidUtilities.m35dp(14.0f);
            } else {
                reactionButton.width = AndroidUtilities.m35dp(8.0f) + AndroidUtilities.m35dp(20.0f) + AndroidUtilities.m35dp(4.0f);
                if (reactionButton.avatarsDrawable != null && reactionButton.users.size() > 0) {
                    reactionButton.users.size();
                    reactionButton.width = (int) (reactionButton.width + AndroidUtilities.m35dp(2.0f) + (AndroidUtilities.m35dp(20.0f) * 1) + ((reactionButton.users.size() > 1 ? reactionButton.users.size() - 1 : 0) * AndroidUtilities.m35dp(20.0f) * 0.8f) + AndroidUtilities.m35dp(1.0f));
                    reactionButton.avatarsDrawable.height = AndroidUtilities.m35dp(26.0f);
                } else {
                    reactionButton.width = (int) (reactionButton.width + reactionButton.counterDrawable.textPaint.measureText(reactionButton.countText) + AndroidUtilities.m35dp(8.0f));
                }
                reactionButton.height = AndroidUtilities.m35dp(26.0f);
            }
            if (reactionButton.width + i3 > i) {
                i4 += reactionButton.height + AndroidUtilities.m35dp(4.0f);
                i3 = 0;
            }
            reactionButton.f1133x = i3;
            reactionButton.f1134y = i4;
            i3 += reactionButton.width + AndroidUtilities.m35dp(4.0f);
            if (i3 > i5) {
                i5 = i3;
            }
        }
        if (i2 == 5 && !this.reactionButtons.isEmpty()) {
            int i7 = this.reactionButtons.get(0).f1134y;
            int i8 = 0;
            for (int i9 = 0; i9 < this.reactionButtons.size(); i9++) {
                if (this.reactionButtons.get(i9).f1134y != i7) {
                    int i10 = i9 - 1;
                    int i11 = i - (this.reactionButtons.get(i10).f1133x + this.reactionButtons.get(i10).width);
                    while (i8 < i9) {
                        this.reactionButtons.get(i8).f1133x += i11;
                        i8++;
                    }
                    i8 = i9;
                }
            }
            int size = this.reactionButtons.size() - 1;
            int i12 = i - (this.reactionButtons.get(size).f1133x + this.reactionButtons.get(size).width);
            while (i8 <= size) {
                this.reactionButtons.get(i8).f1133x += i12;
                i8++;
            }
        }
        this.lastLineX = i3;
        if (i2 == 5) {
            this.width = i;
        } else {
            this.width = i5;
        }
        this.height = i4 + (this.reactionButtons.size() != 0 ? AndroidUtilities.m35dp(26.0f) : 0);
        this.drawServiceShaderBackground = 0.0f;
    }

    public void draw(Canvas canvas, float f, String str) {
        float f2;
        if (this.isEmpty && this.outButtons.isEmpty()) {
            return;
        }
        float f3 = this.f1131x;
        float f4 = this.f1132y;
        if (this.isEmpty) {
            f3 = this.lastDrawnX;
            f4 = this.lastDrawnY;
        } else if (this.animateMove) {
            float f5 = 1.0f - f;
            f3 = (f3 * f) + (this.fromX * f5);
            f4 = (f4 * f) + (this.fromY * f5);
        }
        canvas.save();
        canvas.translate(f3, f4);
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            ReactionButton reactionButton = this.reactionButtons.get(i);
            if (!reactionButton.reaction.equals(this.scrimViewReaction) && (str == null || reactionButton.reaction.equals(str))) {
                canvas.save();
                int i2 = reactionButton.f1133x;
                float f6 = i2;
                int i3 = reactionButton.f1134y;
                float f7 = i3;
                if (f != 1.0f && reactionButton.animationType == 3) {
                    float f8 = 1.0f - f;
                    f6 = (reactionButton.animateFromX * f8) + (i2 * f);
                    f7 = (i3 * f) + (reactionButton.animateFromY * f8);
                }
                canvas.translate(f6, f7);
                if (f == 1.0f || reactionButton.animationType != 1) {
                    f2 = 1.0f;
                } else {
                    float f9 = (f * 0.5f) + 0.5f;
                    canvas.scale(f9, f9, reactionButton.width / 2.0f, reactionButton.height / 2.0f);
                    f2 = f;
                }
                reactionButton.draw(canvas, reactionButton.animationType == 3 ? f : 1.0f, f2, str != null);
                canvas.restore();
            }
        }
        for (int i4 = 0; i4 < this.outButtons.size(); i4++) {
            ReactionButton reactionButton2 = this.outButtons.get(i4);
            canvas.save();
            canvas.translate(reactionButton2.f1133x, reactionButton2.f1134y);
            float f10 = 1.0f - f;
            float f11 = (f10 * 0.5f) + 0.5f;
            canvas.scale(f11, f11, reactionButton2.width / 2.0f, reactionButton2.height / 2.0f);
            this.outButtons.get(i4).draw(canvas, 1.0f, f10, false);
            canvas.restore();
        }
        canvas.restore();
    }

    public void recordDrawingState() {
        this.lastDrawingReactionButtons.clear();
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.lastDrawingReactionButtons.put(this.reactionButtons.get(i).key, this.reactionButtons.get(i));
        }
        this.wasDrawn = !this.isEmpty;
        this.lastDrawnX = this.f1131x;
        this.lastDrawnY = this.f1132y;
        this.lastDrawnWidth = this.width;
        this.lastDrawTotalHeight = this.totalHeight;
    }

    public boolean animateChange() {
        if (this.messageObject == null) {
            return false;
        }
        this.lastDrawingReactionButtonsTmp.clear();
        for (int i = 0; i < this.outButtons.size(); i++) {
            this.outButtons.get(i).detach();
        }
        this.outButtons.clear();
        this.lastDrawingReactionButtonsTmp.putAll(this.lastDrawingReactionButtons);
        boolean z = false;
        for (int i2 = 0; i2 < this.reactionButtons.size(); i2++) {
            ReactionButton reactionButton = this.reactionButtons.get(i2);
            ReactionButton reactionButton2 = this.lastDrawingReactionButtonsTmp.get(reactionButton.key);
            if (reactionButton2 != null && reactionButton.isSmall != reactionButton2.isSmall) {
                reactionButton2 = null;
            }
            if (reactionButton2 != null) {
                this.lastDrawingReactionButtonsTmp.remove(reactionButton.key);
                int i3 = reactionButton.f1133x;
                int i4 = reactionButton2.f1133x;
                if (i3 != i4 || reactionButton.f1134y != reactionButton2.f1134y || reactionButton.width != reactionButton2.width || reactionButton.count != reactionButton2.count || reactionButton.choosen != reactionButton2.choosen || reactionButton.avatarsDrawable != null || reactionButton2.avatarsDrawable != null) {
                    reactionButton.animateFromX = i4;
                    reactionButton.animateFromY = reactionButton2.f1134y;
                    reactionButton.animateFromWidth = reactionButton2.width;
                    reactionButton.fromTextColor = reactionButton2.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = reactionButton2.lastDrawnBackgroundColor;
                    reactionButton.animationType = 3;
                    int i5 = reactionButton.count;
                    int i6 = reactionButton2.count;
                    if (i5 != i6) {
                        reactionButton.counterDrawable.setCount(i6, false);
                        reactionButton.counterDrawable.setCount(reactionButton.count, true);
                    }
                    AvatarsDrawable avatarsDrawable = reactionButton.avatarsDrawable;
                    if (avatarsDrawable != null || reactionButton2.avatarsDrawable != null) {
                        if (avatarsDrawable == null) {
                            reactionButton.setUsers(new ArrayList<>());
                        }
                        if (reactionButton2.avatarsDrawable == null) {
                            reactionButton2.setUsers(new ArrayList<>());
                        }
                        if (!equalsUsersList(reactionButton2.users, reactionButton.users)) {
                            reactionButton.avatarsDrawable.animateFromState(reactionButton2.avatarsDrawable, this.currentAccount, false);
                        }
                    }
                } else {
                    reactionButton.animationType = 0;
                }
            } else {
                reactionButton.animationType = 1;
            }
            z = true;
        }
        if (!this.lastDrawingReactionButtonsTmp.isEmpty()) {
            this.outButtons.addAll(this.lastDrawingReactionButtonsTmp.values());
            for (int i7 = 0; i7 < this.outButtons.size(); i7++) {
                this.outButtons.get(i7).drawImage = this.outButtons.get(i7).lastImageDrawn;
                this.outButtons.get(i7).attach();
            }
            z = true;
        }
        if (this.wasDrawn) {
            float f = this.lastDrawnX;
            if (f != this.f1131x || this.lastDrawnY != this.f1132y) {
                this.animateMove = true;
                this.fromX = f;
                this.fromY = this.lastDrawnY;
                z = true;
            }
        }
        int i8 = this.lastDrawnWidth;
        if (i8 != this.width) {
            this.animateWidth = true;
            this.fromWidth = i8;
            z = true;
        }
        int i9 = this.lastDrawTotalHeight;
        if (i9 != this.totalHeight) {
            this.animateHeight = true;
            this.animateFromTotalHeight = i9;
            return true;
        }
        return z;
    }

    private boolean equalsUsersList(ArrayList<TLRPC$User> arrayList, ArrayList<TLRPC$User> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).f995id != arrayList.get(i).f995id) {
                return false;
            }
        }
        return true;
    }

    public void resetAnimation() {
        for (int i = 0; i < this.outButtons.size(); i++) {
            this.outButtons.get(i).detach();
        }
        this.outButtons.clear();
        this.animateMove = false;
        this.animateWidth = false;
        this.animateHeight = false;
        for (int i2 = 0; i2 < this.reactionButtons.size(); i2++) {
            this.reactionButtons.get(i2).animationType = 0;
        }
    }

    public ReactionButton getReactionButton(VisibleReaction visibleReaction) {
        String str = visibleReaction.emojicon;
        if (str == null) {
            str = Long.toString(visibleReaction.documentId);
        }
        if (this.isSmall) {
            HashMap<String, ReactionButton> hashMap = this.lastDrawingReactionButtons;
            ReactionButton reactionButton = hashMap.get(str + "_");
            if (reactionButton != null) {
                return reactionButton;
            }
        }
        return this.lastDrawingReactionButtons.get(str);
    }

    public void setScrimReaction(String str) {
        this.scrimViewReaction = str;
    }

    public class ReactionButton {
        public int animateFromWidth;
        public int animateFromX;
        public int animateFromY;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        int animatedEmojiDrawableColor;
        public int animationType;
        AvatarsDrawable avatarsDrawable;
        int backgroundColor;
        public boolean choosen;
        public int choosenOrder;
        int count;
        String countText;
        CounterView.CounterDrawable counterDrawable;
        public int fromBackgroundColor;
        public int fromTextColor;
        public int height;
        boolean isSelected;
        private final boolean isSmall;
        public String key;
        int lastDrawnBackgroundColor;
        int lastDrawnTextColor;
        public boolean lastImageDrawn;
        TLRPC$Reaction reaction;
        private final TLRPC$ReactionCount reactionCount;
        public int realCount;
        int serviceBackgroundColor;
        int serviceTextColor;
        int textColor;
        ArrayList<TLRPC$User> users;
        VisibleReaction visibleReaction;
        public int width;
        public int f1133x;
        public int f1134y;
        public boolean drawImage = true;
        Rect drawingImageRect = new Rect();
        ImageReceiver imageReceiver = new ImageReceiver();

        public ReactionButton(TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
            this.counterDrawable = new CounterView.CounterDrawable(ReactionsLayoutInBubble.this.parentView, false, null);
            this.reactionCount = tLRPC$ReactionCount;
            TLRPC$Reaction tLRPC$Reaction = tLRPC$ReactionCount.reaction;
            this.reaction = tLRPC$Reaction;
            this.visibleReaction = VisibleReaction.fromTLReaction(tLRPC$Reaction);
            int i = tLRPC$ReactionCount.count;
            this.count = i;
            this.choosen = tLRPC$ReactionCount.chosen;
            this.realCount = i;
            this.choosenOrder = tLRPC$ReactionCount.chosen_order;
            this.isSmall = z;
            TLRPC$Reaction tLRPC$Reaction2 = this.reaction;
            if (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji) {
                this.key = ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon;
            } else if (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) {
                this.key = Long.toString(((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id);
            } else {
                throw new RuntimeException("unsupported");
            }
            this.countText = Integer.toString(tLRPC$ReactionCount.count);
            this.imageReceiver.setParentView(ReactionsLayoutInBubble.this.parentView);
            this.isSelected = tLRPC$ReactionCount.chosen;
            CounterView.CounterDrawable counterDrawable = this.counterDrawable;
            counterDrawable.updateVisibility = false;
            counterDrawable.shortFormat = true;
            if (this.reaction != null) {
                VisibleReaction visibleReaction = this.visibleReaction;
                if (visibleReaction.emojicon != null) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(ReactionsLayoutInBubble.this.currentAccount).getReactionsMap().get(this.visibleReaction.emojicon);
                    if (tLRPC$TL_availableReaction != null) {
                        this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_lastframe", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, "windowBackgroundGray", 1.0f), "webp", tLRPC$TL_availableReaction, 1);
                    }
                } else if (visibleReaction.documentId != 0) {
                    this.animatedEmojiDrawable = new AnimatedEmojiDrawable(3, ReactionsLayoutInBubble.this.currentAccount, this.visibleReaction.documentId);
                }
            }
            this.counterDrawable.setSize(AndroidUtilities.m35dp(26.0f), AndroidUtilities.m35dp(100.0f));
            this.counterDrawable.textPaint = ReactionsLayoutInBubble.textPaint;
            this.counterDrawable.setCount(this.count, false);
            this.counterDrawable.setType(2);
            this.counterDrawable.gravity = 3;
        }

        public void draw(Canvas canvas, float f, float f2, boolean z) {
            int m35dp;
            int i;
            Theme.MessageDrawable currentBackgroundDrawable;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
            if (this.isSmall && imageReceiver != null) {
                imageReceiver.setAlpha(f2);
                this.drawingImageRect.set(0, 0, AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(14.0f));
                imageReceiver.setImageCoords(this.drawingImageRect);
                imageReceiver.setRoundRadius(0);
                drawImage(canvas, f2);
                return;
            }
            if (this.choosen) {
                this.backgroundColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonBackground" : "chat_inReactionButtonBackground", ReactionsLayoutInBubble.this.resourcesProvider);
                this.textColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonTextSelected" : "chat_inReactionButtonTextSelected", ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceTextColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonBackground" : "chat_inReactionButtonBackground", ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceBackgroundColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outBubble" : "chat_inBubble");
            } else {
                this.textColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonText" : "chat_inReactionButtonText", ReactionsLayoutInBubble.this.resourcesProvider);
                int color = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonBackground" : "chat_inReactionButtonBackground", ReactionsLayoutInBubble.this.resourcesProvider);
                this.backgroundColor = color;
                this.backgroundColor = ColorUtils.setAlphaComponent(color, (int) (Color.alpha(color) * 0.156f));
                this.serviceTextColor = Theme.getColor("chat_serviceText", ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceBackgroundColor = 0;
            }
            updateColors(f);
            ReactionsLayoutInBubble.textPaint.setColor(this.lastDrawnTextColor);
            ReactionsLayoutInBubble.paint.setColor(this.lastDrawnBackgroundColor);
            if (f2 != 1.0f) {
                ReactionsLayoutInBubble.textPaint.setAlpha((int) (ReactionsLayoutInBubble.textPaint.getAlpha() * f2));
                ReactionsLayoutInBubble.paint.setAlpha((int) (ReactionsLayoutInBubble.paint.getAlpha() * f2));
            }
            if (imageReceiver != null) {
                imageReceiver.setAlpha(f2);
            }
            int i2 = this.width;
            if (f != 1.0f && this.animationType == 3) {
                i2 = (int) ((i2 * f) + (this.animateFromWidth * (1.0f - f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i2, this.height);
            float f3 = this.height / 2.0f;
            ReactionsLayoutInBubble reactionsLayoutInBubble = ReactionsLayoutInBubble.this;
            if (reactionsLayoutInBubble.drawServiceShaderBackground > 0.0f) {
                Paint themedPaint = reactionsLayoutInBubble.getThemedPaint("paintChatActionBackground");
                Paint paint = Theme.chat_actionBackgroundGradientDarkenPaint;
                int alpha = themedPaint.getAlpha();
                int alpha2 = paint.getAlpha();
                themedPaint.setAlpha((int) (alpha * f2 * ReactionsLayoutInBubble.this.drawServiceShaderBackground));
                paint.setAlpha((int) (alpha2 * f2 * ReactionsLayoutInBubble.this.drawServiceShaderBackground));
                canvas.drawRoundRect(rectF, f3, f3, themedPaint);
                if (ReactionsLayoutInBubble.this.hasGradientService()) {
                    canvas.drawRoundRect(rectF, f3, f3, paint);
                }
                themedPaint.setAlpha(alpha);
                paint.setAlpha(alpha2);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = ReactionsLayoutInBubble.this;
            if (reactionsLayoutInBubble2.drawServiceShaderBackground < 1.0f && z && (currentBackgroundDrawable = reactionsLayoutInBubble2.parentView.getCurrentBackgroundDrawable(false)) != null) {
                canvas.drawRoundRect(rectF, f3, f3, currentBackgroundDrawable.getPaint());
            }
            canvas.drawRoundRect(rectF, f3, f3, ReactionsLayoutInBubble.paint);
            if (imageReceiver != null) {
                if (this.animatedEmojiDrawable != null) {
                    i = AndroidUtilities.m35dp(24.0f);
                    m35dp = AndroidUtilities.m35dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.m35dp(6.0f));
                } else {
                    int m35dp2 = AndroidUtilities.m35dp(20.0f);
                    m35dp = AndroidUtilities.m35dp(8.0f);
                    imageReceiver.setRoundRadius(0);
                    i = m35dp2;
                }
                int i3 = (int) ((this.height - i) / 2.0f);
                this.drawingImageRect.set(m35dp, i3, m35dp + i, i + i3);
                imageReceiver.setImageCoords(this.drawingImageRect);
                drawImage(canvas, f2);
            }
            if (this.count != 0 || this.counterDrawable.countChangeProgress != 1.0f) {
                canvas.save();
                canvas.translate(AndroidUtilities.m35dp(8.0f) + AndroidUtilities.m35dp(20.0f) + AndroidUtilities.m35dp(2.0f), 0.0f);
                this.counterDrawable.draw(canvas);
                canvas.restore();
            }
            if (this.avatarsDrawable != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.m35dp(10.0f) + AndroidUtilities.m35dp(20.0f) + AndroidUtilities.m35dp(2.0f), 0.0f);
                this.avatarsDrawable.setAlpha(f2);
                this.avatarsDrawable.setTransitionProgress(f);
                this.avatarsDrawable.onDraw(canvas);
                canvas.restore();
            }
        }

        private void updateColors(float f) {
            this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, ColorUtils.blendARGB(this.textColor, this.serviceTextColor, ReactionsLayoutInBubble.this.drawServiceShaderBackground), f);
            this.lastDrawnBackgroundColor = ColorUtils.blendARGB(this.fromBackgroundColor, ColorUtils.blendARGB(this.backgroundColor, this.serviceBackgroundColor, ReactionsLayoutInBubble.this.drawServiceShaderBackground), f);
        }

        private void drawImage(Canvas canvas, float f) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 != null && this.animatedEmojiDrawableColor != this.lastDrawnTextColor) {
                int i = this.lastDrawnTextColor;
                this.animatedEmojiDrawableColor = i;
                animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            boolean z = false;
            if (this.drawImage && (this.realCount > 1 || !ReactionsEffectOverlay.isPlaying(ReactionsLayoutInBubble.this.messageObject.getId(), ReactionsLayoutInBubble.this.messageObject.getGroupId(), this.visibleReaction) || !this.isSelected)) {
                ImageReceiver imageReceiver2 = ReactionsLayoutInBubble.this.animatedReactions.get(this.visibleReaction);
                if (imageReceiver2 != null) {
                    z = (imageReceiver2.getLottieAnimation() == null || !imageReceiver2.getLottieAnimation().hasBitmap()) ? true : true;
                    if (f != 1.0f) {
                        imageReceiver2.setAlpha(f);
                        if (f <= 0.0f) {
                            imageReceiver2.onDetachedFromWindow();
                            ReactionsLayoutInBubble.this.animatedReactions.remove(this.visibleReaction);
                        }
                    } else if (imageReceiver2.getLottieAnimation() != null && !imageReceiver2.getLottieAnimation().isRunning()) {
                        float alpha = imageReceiver2.getAlpha() - 0.08f;
                        if (alpha <= 0.0f) {
                            imageReceiver2.onDetachedFromWindow();
                            ReactionsLayoutInBubble.this.animatedReactions.remove(this.visibleReaction);
                        } else {
                            imageReceiver2.setAlpha(alpha);
                        }
                        ReactionsLayoutInBubble.this.parentView.invalidate();
                        z = true;
                    }
                    imageReceiver2.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                    imageReceiver2.draw(canvas);
                } else {
                    z = true;
                }
                if (z) {
                    imageReceiver.draw(canvas);
                }
                this.lastImageDrawn = true;
                return;
            }
            imageReceiver.setAlpha(0.0f);
            imageReceiver.draw(canvas);
            this.lastImageDrawn = false;
        }

        public void setUsers(ArrayList<TLRPC$User> arrayList) {
            this.users = arrayList;
            if (arrayList != null) {
                Collections.sort(arrayList, ReactionsLayoutInBubble.usersComparator);
                if (this.avatarsDrawable == null) {
                    AvatarsDrawable avatarsDrawable = new AvatarsDrawable(ReactionsLayoutInBubble.this.parentView, false);
                    this.avatarsDrawable = avatarsDrawable;
                    avatarsDrawable.transitionDuration = 250L;
                    Interpolator interpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
                    avatarsDrawable.setSize(AndroidUtilities.m35dp(20.0f));
                    this.avatarsDrawable.width = AndroidUtilities.m35dp(100.0f);
                    AvatarsDrawable avatarsDrawable2 = this.avatarsDrawable;
                    avatarsDrawable2.height = this.height;
                    avatarsDrawable2.setAvatarsTextSize(AndroidUtilities.m35dp(22.0f));
                    if (ReactionsLayoutInBubble.this.attached) {
                        this.avatarsDrawable.onAttachedToWindow();
                    }
                }
                for (int i = 0; i < arrayList.size() && i != 3; i++) {
                    this.avatarsDrawable.setObject(i, ReactionsLayoutInBubble.this.currentAccount, arrayList.get(i));
                }
                this.avatarsDrawable.commitTransition(false);
            }
        }

        public void attach() {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
            AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
            if (avatarsDrawable != null) {
                avatarsDrawable.onAttachedToWindow();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(ReactionsLayoutInBubble.this.parentView);
            }
        }

        public void detach() {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
            AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
            if (avatarsDrawable != null) {
                avatarsDrawable.onDetachedFromWindow();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(ReactionsLayoutInBubble.this.parentView);
            }
        }
    }

    public boolean chekTouchEvent(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC$Message tLRPC$Message;
        int i = 0;
        if (this.isEmpty || this.isSmall || (messageObject = this.messageObject) == null || (tLRPC$Message = messageObject.messageOwner) == null || tLRPC$Message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f1131x;
        float y = motionEvent.getY() - this.f1132y;
        if (motionEvent.getAction() == 0) {
            int size = this.reactionButtons.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (x <= this.reactionButtons.get(i).f1133x || x >= this.reactionButtons.get(i).f1133x + this.reactionButtons.get(i).width || y <= this.reactionButtons.get(i).f1134y || y >= this.reactionButtons.get(i).f1134y + this.reactionButtons.get(i).height) {
                    i++;
                } else {
                    this.lastX = motionEvent.getX();
                    this.lastY = motionEvent.getY();
                    this.lastSelectedButton = this.reactionButtons.get(i);
                    Runnable runnable = this.longPressRunnable;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        this.longPressRunnable = null;
                    }
                    final ReactionButton reactionButton = this.lastSelectedButton;
                    MessageObject messageObject2 = this.messageObject;
                    if (messageObject2.messageOwner.reactions.can_see_list || messageObject2.getDialogId() >= 0) {
                        Runnable runnable2 = new Runnable() {
                            @Override
                            public final void run() {
                                ReactionsLayoutInBubble.this.lambda$chekTouchEvent$1(reactionButton);
                            }
                        };
                        this.longPressRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
                    }
                    this.pressed = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if ((this.pressed && Math.abs(motionEvent.getX() - this.lastX) > this.touchSlop) || Math.abs(motionEvent.getY() - this.lastY) > this.touchSlop) {
                this.pressed = false;
                this.lastSelectedButton = null;
                Runnable runnable3 = this.longPressRunnable;
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                    this.longPressRunnable = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            Runnable runnable4 = this.longPressRunnable;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
                this.longPressRunnable = null;
            }
            if (this.pressed && this.lastSelectedButton != null && motionEvent.getAction() == 1 && this.parentView.getDelegate() != null) {
                this.parentView.getDelegate().didPressReaction(this.parentView, this.lastSelectedButton.reactionCount, false);
            }
            this.pressed = false;
            this.lastSelectedButton = null;
        }
        return this.pressed;
    }

    public void lambda$chekTouchEvent$1(ReactionButton reactionButton) {
        this.parentView.getDelegate().didPressReaction(this.parentView, reactionButton.reactionCount, true);
        this.longPressRunnable = null;
    }

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }

    public Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint2 = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint2 != null ? paint2 : Theme.getThemePaint(str);
    }

    public float getCurrentWidth(float f) {
        if (this.animateWidth) {
            return (this.fromWidth * (1.0f - f)) + (this.width * f);
        }
        return this.width;
    }

    public float getCurrentTotalHeight(float f) {
        if (this.animateHeight) {
            return (this.animateFromTotalHeight * (1.0f - f)) + (this.totalHeight * f);
        }
        return this.totalHeight;
    }

    public static class ButtonsComparator implements Comparator<ReactionButton> {
        int currentAccount;
        long dialogId;

        private ButtonsComparator() {
        }

        @Override
        public int compare(ReactionButton reactionButton, ReactionButton reactionButton2) {
            int i;
            int i2;
            int i3;
            int i4;
            if (this.dialogId >= 0) {
                boolean z = reactionButton.isSelected;
                if (z != reactionButton2.isSelected) {
                    return z ? -1 : 1;
                } else if (z && (i3 = reactionButton.choosenOrder) != (i4 = reactionButton2.choosenOrder)) {
                    return i3 - i4;
                } else {
                    i = reactionButton.reactionCount.lastDrawnPosition;
                    i2 = reactionButton2.reactionCount.lastDrawnPosition;
                }
            } else {
                int i5 = reactionButton.realCount;
                int i6 = reactionButton2.realCount;
                if (i5 != i6) {
                    return i6 - i5;
                }
                i = reactionButton.reactionCount.lastDrawnPosition;
                i2 = reactionButton2.reactionCount.lastDrawnPosition;
            }
            return i - i2;
        }
    }

    public void onAttachToWindow() {
        this.attached = true;
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.reactionButtons.get(i).attach();
        }
    }

    public void onDetachFromWindow() {
        this.attached = false;
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.reactionButtons.get(i).detach();
        }
        if (!this.animatedReactions.isEmpty()) {
            for (ImageReceiver imageReceiver : this.animatedReactions.values()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.animatedReactions.clear();
    }

    public void animateReaction(VisibleReaction visibleReaction) {
        if (visibleReaction.documentId == 0 && this.animatedReactions.get(visibleReaction) == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setParentView(this.parentView);
            int i = animationUniq;
            animationUniq = i + 1;
            imageReceiver.setUniqKeyPrefix(Integer.toString(i));
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
            if (tLRPC$TL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tLRPC$TL_availableReaction, 1);
            }
            imageReceiver.setAutoRepeat(0);
            imageReceiver.onAttachedToWindow();
            this.animatedReactions.put(visibleReaction, imageReceiver);
        }
    }

    public static class VisibleReaction {
        public long documentId;
        public String emojicon;

        public static VisibleReaction fromTLReaction(TLRPC$Reaction tLRPC$Reaction) {
            VisibleReaction visibleReaction = new VisibleReaction();
            if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                visibleReaction.emojicon = ((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon;
            } else if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
                visibleReaction.documentId = ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
            }
            return visibleReaction;
        }

        public static VisibleReaction fromEmojicon(TLRPC$TL_availableReaction tLRPC$TL_availableReaction) {
            VisibleReaction visibleReaction = new VisibleReaction();
            visibleReaction.emojicon = tLRPC$TL_availableReaction.reaction;
            return visibleReaction;
        }

        public static VisibleReaction fromEmojicon(String str) {
            VisibleReaction visibleReaction = new VisibleReaction();
            if (str.startsWith("animated_")) {
                try {
                    visibleReaction.documentId = Long.parseLong(str.substring(9));
                } catch (Exception unused) {
                    visibleReaction.emojicon = str;
                }
            } else {
                visibleReaction.emojicon = str;
            }
            return visibleReaction;
        }

        public static VisibleReaction fromCustomEmoji(Long l) {
            VisibleReaction visibleReaction = new VisibleReaction();
            visibleReaction.documentId = l.longValue();
            return visibleReaction;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VisibleReaction.class != obj.getClass()) {
                return false;
            }
            VisibleReaction visibleReaction = (VisibleReaction) obj;
            return this.documentId == visibleReaction.documentId && Objects.equals(this.emojicon, visibleReaction.emojicon);
        }

        public int hashCode() {
            return Objects.hash(this.emojicon, Long.valueOf(this.documentId));
        }
    }
}
