package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
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
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.CounterView;
public class ReactionsLayoutInBubble {
    private static int animationUniq;
    private static final ButtonsComparator comparator;
    private static Paint cutTagPaint;
    private static Paint paint = new Paint(1);
    private static int pointer;
    private static TextPaint textPaint;
    private static final Comparator<TLObject> usersComparator;
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
    public int x;
    public int y;
    ArrayList<ReactionButton> reactionButtons = new ArrayList<>();
    ArrayList<ReactionButton> outButtons = new ArrayList<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtons = new HashMap<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtonsTmp = new HashMap<>();
    HashMap<VisibleReaction, ImageReceiver> animatedReactions = new HashMap<>();
    int currentAccount = UserConfig.selectedAccount;

    static {
        new Paint(1);
        cutTagPaint = new Paint(1);
        textPaint = new TextPaint(1);
        comparator = new ButtonsComparator();
        pointer = 1;
        usersComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = ReactionsLayoutInBubble.lambda$static$0((TLObject) obj, (TLObject) obj2);
                return lambda$static$0;
            }
        };
    }

    public static int lambda$static$0(TLObject tLObject, TLObject tLObject2) {
        return (int) (getPeerId(tLObject) - getPeerId(tLObject2));
    }

    private static long getPeerId(TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            return ((TLRPC$User) tLObject).id;
        }
        if (tLObject instanceof TLRPC$Chat) {
            return ((TLRPC$Chat) tLObject).id;
        }
        return 0L;
    }

    public ReactionsLayoutInBubble(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
        paint.setColor(Theme.getColor(Theme.key_chat_inLoader, this.resourcesProvider));
        textPaint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        cutTagPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static boolean equalsTLReaction(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2) {
        if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon);
        }
        return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id;
    }

    public void setMessage(org.telegram.messenger.MessageObject r18, boolean r19, org.telegram.ui.ActionBar.Theme.ResourcesProvider r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble.setMessage(org.telegram.messenger.MessageObject, boolean, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
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
                reactionButton.width = AndroidUtilities.dp(14.0f);
                reactionButton.height = AndroidUtilities.dp(14.0f);
            } else {
                reactionButton.width = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(4.0f);
                if (reactionButton.avatarsDrawable != null && reactionButton.users.size() > 0) {
                    reactionButton.users.size();
                    reactionButton.width = (int) (reactionButton.width + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) * 1) + ((reactionButton.users.size() > 1 ? reactionButton.users.size() - 1 : 0) * AndroidUtilities.dp(20.0f) * 0.8f) + AndroidUtilities.dp(1.0f));
                    reactionButton.avatarsDrawable.height = AndroidUtilities.dp(26.0f);
                } else {
                    reactionButton.width = (int) (reactionButton.width + reactionButton.counterDrawable.textPaint.measureText(reactionButton.countText) + AndroidUtilities.dp(8.0f));
                }
                reactionButton.height = AndroidUtilities.dp(26.0f);
            }
            if (reactionButton.width + i3 > i) {
                i4 += reactionButton.height + AndroidUtilities.dp(4.0f);
                i3 = 0;
            }
            reactionButton.x = i3;
            reactionButton.y = i4;
            i3 += reactionButton.width + AndroidUtilities.dp(4.0f);
            if (i3 > i5) {
                i5 = i3;
            }
        }
        if (i2 == 5 && !this.reactionButtons.isEmpty()) {
            int i7 = this.reactionButtons.get(0).y;
            int i8 = 0;
            for (int i9 = 0; i9 < this.reactionButtons.size(); i9++) {
                if (this.reactionButtons.get(i9).y != i7) {
                    int i10 = i9 - 1;
                    int i11 = i - (this.reactionButtons.get(i10).x + this.reactionButtons.get(i10).width);
                    while (i8 < i9) {
                        this.reactionButtons.get(i8).x += i11;
                        i8++;
                    }
                    i8 = i9;
                }
            }
            int size = this.reactionButtons.size() - 1;
            int i12 = i - (this.reactionButtons.get(size).x + this.reactionButtons.get(size).width);
            while (i8 <= size) {
                this.reactionButtons.get(i8).x += i12;
                i8++;
            }
        }
        this.lastLineX = i3;
        if (i2 == 5) {
            this.width = i;
        } else {
            this.width = i5;
        }
        this.height = i4 + (this.reactionButtons.size() != 0 ? AndroidUtilities.dp(26.0f) : 0);
        this.drawServiceShaderBackground = 0.0f;
    }

    public void draw(Canvas canvas, float f, String str) {
        float f2;
        if (this.isEmpty && this.outButtons.isEmpty()) {
            return;
        }
        float f3 = this.x;
        float f4 = this.y;
        if (this.isEmpty) {
            f3 = this.lastDrawnX;
            f4 = this.lastDrawnY;
        } else if (this.animateMove) {
            float f5 = 1.0f - f;
            f3 = (f3 * f) + (this.fromX * f5);
            f4 = (f4 * f) + (this.fromY * f5);
        }
        float f6 = f3;
        float f7 = f4;
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            ReactionButton reactionButton = this.reactionButtons.get(i);
            if (!reactionButton.reaction.equals(this.scrimViewReaction) && (str == null || reactionButton.reaction.equals(str))) {
                canvas.save();
                int i2 = reactionButton.x;
                float f8 = i2;
                int i3 = reactionButton.y;
                float f9 = i3;
                if (f != 1.0f && reactionButton.animationType == 3) {
                    float f10 = 1.0f - f;
                    f8 = (reactionButton.animateFromX * f10) + (i2 * f);
                    f9 = (i3 * f) + (reactionButton.animateFromY * f10);
                }
                if (f == 1.0f || reactionButton.animationType != 1) {
                    f2 = 1.0f;
                } else {
                    float f11 = (f * 0.5f) + 0.5f;
                    canvas.scale(f11, f11, f6 + f8 + (reactionButton.width / 2.0f), f7 + f9 + (reactionButton.height / 2.0f));
                    f2 = f;
                }
                reactionButton.draw(canvas, f8 + f6, f7 + f9, reactionButton.animationType == 3 ? f : 1.0f, f2, str != null);
                canvas.restore();
            }
        }
        for (int i4 = 0; i4 < this.outButtons.size(); i4++) {
            ReactionButton reactionButton2 = this.outButtons.get(i4);
            float f12 = 1.0f - f;
            float f13 = (f12 * 0.5f) + 0.5f;
            canvas.save();
            canvas.scale(f13, f13, reactionButton2.x + f6 + (reactionButton2.width / 2.0f), reactionButton2.y + f7 + (reactionButton2.height / 2.0f));
            this.outButtons.get(i4).draw(canvas, reactionButton2.x + f6, f7 + reactionButton2.y, 1.0f, f12, false);
            canvas.restore();
        }
    }

    public void recordDrawingState() {
        this.lastDrawingReactionButtons.clear();
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.lastDrawingReactionButtons.put(this.reactionButtons.get(i).key, this.reactionButtons.get(i));
        }
        this.wasDrawn = !this.isEmpty;
        this.lastDrawnX = this.x;
        this.lastDrawnY = this.y;
        this.lastDrawnWidth = this.width;
        this.lastDrawTotalHeight = this.totalHeight;
    }

    public boolean animateChange() {
        AvatarsDrawable avatarsDrawable;
        CounterView.CounterDrawable counterDrawable;
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
                int i3 = reactionButton.x;
                int i4 = reactionButton2.x;
                if (i3 != i4 || reactionButton.y != reactionButton2.y || reactionButton.width != reactionButton2.width || reactionButton.count != reactionButton2.count || reactionButton.choosen != reactionButton2.choosen || reactionButton.avatarsDrawable != null || reactionButton2.avatarsDrawable != null) {
                    reactionButton.animateFromX = i4;
                    reactionButton.animateFromY = reactionButton2.y;
                    reactionButton.animateFromWidth = reactionButton2.width;
                    reactionButton.fromTextColor = reactionButton2.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = reactionButton2.lastDrawnBackgroundColor;
                    reactionButton.animationType = 3;
                    int i5 = reactionButton.count;
                    int i6 = reactionButton2.count;
                    if (i5 != i6 && (counterDrawable = reactionButton.counterDrawable) != null) {
                        counterDrawable.setCount(i6, false);
                        reactionButton.counterDrawable.setCount(reactionButton.count, true);
                    }
                    AvatarsDrawable avatarsDrawable2 = reactionButton.avatarsDrawable;
                    if (avatarsDrawable2 != null || reactionButton2.avatarsDrawable != null) {
                        if (avatarsDrawable2 == null) {
                            reactionButton.setUsers(new ArrayList<>());
                        }
                        if (reactionButton2.avatarsDrawable == null) {
                            reactionButton2.setUsers(new ArrayList<>());
                        }
                        if (!equalsUsersList(reactionButton2.users, reactionButton.users) && (avatarsDrawable = reactionButton.avatarsDrawable) != null) {
                            avatarsDrawable.animateFromState(reactionButton2.avatarsDrawable, this.currentAccount, false);
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
            if (f != this.x || this.lastDrawnY != this.y) {
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

    private boolean equalsUsersList(ArrayList<TLObject> arrayList, ArrayList<TLObject> arrayList2) {
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLObject tLObject = arrayList.get(i);
            TLObject tLObject2 = arrayList2.get(i);
            if (tLObject == null || tLObject2 == null || getPeerId(tLObject) != getPeerId(tLObject2)) {
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

    public class ReactionLayoutButton extends ReactionButton {
        public ReactionLayoutButton(ReactionButton reactionButton, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
            super(reactionButton, ReactionsLayoutInBubble.this.currentAccount, ReactionsLayoutInBubble.this.parentView, tLRPC$ReactionCount, z, ReactionsLayoutInBubble.this.resourcesProvider);
        }

        @Override
        protected boolean isPlaying() {
            return ReactionsEffectOverlay.isPlaying(ReactionsLayoutInBubble.this.messageObject.getId(), ReactionsLayoutInBubble.this.messageObject.getGroupId(), this.visibleReaction);
        }

        @Override
        protected boolean isOutOwner() {
            return ReactionsLayoutInBubble.this.messageObject.isOutOwner();
        }

        @Override
        protected float getDrawServiceShaderBackground() {
            return ReactionsLayoutInBubble.this.drawServiceShaderBackground;
        }

        @Override
        protected ImageReceiver getImageReceiver() {
            return ReactionsLayoutInBubble.this.animatedReactions.get(this.visibleReaction);
        }

        @Override
        protected void removeImageReceiver() {
            ReactionsLayoutInBubble.this.animatedReactions.remove(this.visibleReaction);
        }
    }

    public static class ReactionButton {
        public int animateFromWidth;
        public int animateFromX;
        public int animateFromY;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        int animatedEmojiDrawableColor;
        public int animationType;
        public boolean attached;
        AvatarsDrawable avatarsDrawable;
        int backgroundColor;
        public boolean choosen;
        public int choosenOrder;
        public int count;
        public String countText;
        public CounterView.CounterDrawable counterDrawable;
        private final int currentAccount;
        public boolean drawImage = true;
        Rect drawingImageRect = new Rect();
        public int fromBackgroundColor;
        public int fromTextColor;
        public int height;
        ImageReceiver imageReceiver;
        boolean isSelected;
        private final boolean isSmall;
        public String key;
        public int lastDrawnBackgroundColor;
        public int lastDrawnTextColor;
        public boolean lastImageDrawn;
        private final View parentView;
        TLRPC$Reaction reaction;
        private final TLRPC$ReactionCount reactionCount;
        public int realCount;
        private final Theme.ResourcesProvider resourcesProvider;
        int serviceBackgroundColor;
        int serviceTextColor;
        int textColor;
        ArrayList<TLObject> users;
        VisibleReaction visibleReaction;
        public int width;
        public int x;
        public int y;

        protected int getCacheType() {
            return 3;
        }

        protected float getDrawServiceShaderBackground() {
            return 0.0f;
        }

        protected ImageReceiver getImageReceiver() {
            return null;
        }

        protected boolean isOutOwner() {
            return false;
        }

        protected boolean isPlaying() {
            return false;
        }

        protected void removeImageReceiver() {
        }

        public ReactionButton(ReactionButton reactionButton, int i, View view, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z, Theme.ResourcesProvider resourcesProvider) {
            this.currentAccount = i;
            this.parentView = view;
            this.resourcesProvider = resourcesProvider;
            if (reactionButton != null) {
                this.counterDrawable = reactionButton.counterDrawable;
            }
            if (this.imageReceiver == null) {
                this.imageReceiver = new ImageReceiver();
            }
            if (this.counterDrawable == null) {
                this.counterDrawable = new CounterView.CounterDrawable(view, false, null);
            }
            this.reactionCount = tLRPC$ReactionCount;
            TLRPC$Reaction tLRPC$Reaction = tLRPC$ReactionCount.reaction;
            this.reaction = tLRPC$Reaction;
            this.visibleReaction = VisibleReaction.fromTLReaction(tLRPC$Reaction);
            int i2 = tLRPC$ReactionCount.count;
            this.count = i2;
            this.choosen = tLRPC$ReactionCount.chosen;
            this.realCount = i2;
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
            this.imageReceiver.setParentView(view);
            this.isSelected = tLRPC$ReactionCount.chosen;
            CounterView.CounterDrawable counterDrawable = this.counterDrawable;
            counterDrawable.updateVisibility = false;
            counterDrawable.shortFormat = true;
            if (this.reaction != null) {
                VisibleReaction visibleReaction = this.visibleReaction;
                if (visibleReaction.emojicon != null) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(this.visibleReaction.emojicon);
                    if (tLRPC$TL_availableReaction != null) {
                        this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f), "webp", tLRPC$TL_availableReaction, 1);
                    }
                } else if (visibleReaction.documentId != 0) {
                    this.animatedEmojiDrawable = new AnimatedEmojiDrawable(getCacheType(), i, this.visibleReaction.documentId);
                }
            }
            this.counterDrawable.setSize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
            this.counterDrawable.textPaint = ReactionsLayoutInBubble.textPaint;
            this.counterDrawable.setCount(this.count, false);
            this.counterDrawable.setType(2);
            this.counterDrawable.gravity = 3;
        }

        protected boolean drawCounter() {
            int i = this.count;
            return ((i == 0 || i == 1) && this.counterDrawable.countChangeProgress == 1.0f) ? false : true;
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, boolean z) {
            int dp;
            int i;
            Theme.MessageDrawable currentBackgroundDrawable;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
            if (this.isSmall && imageReceiver != null) {
                imageReceiver.setAlpha(f4);
                this.drawingImageRect.set((int) f, (int) f2, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                imageReceiver.setImageCoords(this.drawingImageRect);
                imageReceiver.setRoundRadius(0);
                drawImage(canvas, f4);
                return;
            }
            if (this.choosen) {
                this.backgroundColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, this.resourcesProvider);
                this.textColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonTextSelected : Theme.key_chat_inReactionButtonTextSelected, this.resourcesProvider);
                this.serviceTextColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, this.resourcesProvider);
                this.serviceBackgroundColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
            } else {
                this.textColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonText : Theme.key_chat_inReactionButtonText, this.resourcesProvider);
                int color = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, this.resourcesProvider);
                this.backgroundColor = color;
                this.backgroundColor = ColorUtils.setAlphaComponent(color, (int) (Color.alpha(color) * 0.156f));
                this.serviceTextColor = Theme.getColor(Theme.key_chat_serviceText, this.resourcesProvider);
                this.serviceBackgroundColor = 0;
            }
            updateColors(f3);
            ReactionsLayoutInBubble.textPaint.setColor(this.lastDrawnTextColor);
            ReactionsLayoutInBubble.paint.setColor(this.lastDrawnBackgroundColor);
            if (f4 != 1.0f) {
                ReactionsLayoutInBubble.textPaint.setAlpha((int) (ReactionsLayoutInBubble.textPaint.getAlpha() * f4));
                ReactionsLayoutInBubble.paint.setAlpha((int) (ReactionsLayoutInBubble.paint.getAlpha() * f4));
            }
            if (imageReceiver != null) {
                imageReceiver.setAlpha(f4);
            }
            int i2 = this.width;
            if (f3 != 1.0f && this.animationType == 3) {
                i2 = (int) ((i2 * f3) + (this.animateFromWidth * (1.0f - f3)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f, f2, i2 + f, this.height + f2);
            float f5 = this.height / 2.0f;
            if (getDrawServiceShaderBackground() > 0.0f) {
                Paint themePaint = Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider);
                Paint themePaint2 = Theme.getThemePaint("paintChatActionBackgroundDarken", this.resourcesProvider);
                int alpha = themePaint.getAlpha();
                int alpha2 = themePaint2.getAlpha();
                themePaint.setAlpha((int) (alpha * f4 * getDrawServiceShaderBackground()));
                themePaint2.setAlpha((int) (alpha2 * f4 * getDrawServiceShaderBackground()));
                canvas.drawRoundRect(rectF, f5, f5, themePaint);
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                if (resourcesProvider == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService()) {
                    canvas.drawRoundRect(rectF, f5, f5, themePaint2);
                }
                themePaint.setAlpha(alpha);
                themePaint2.setAlpha(alpha2);
            }
            if (z && getDrawServiceShaderBackground() < 1.0f) {
                View view = this.parentView;
                if ((view instanceof ChatMessageCell) && (currentBackgroundDrawable = ((ChatMessageCell) view).getCurrentBackgroundDrawable(false)) != null) {
                    canvas.drawRoundRect(rectF, f5, f5, currentBackgroundDrawable.getPaint());
                }
            }
            canvas.drawRoundRect(rectF, f5, f5, ReactionsLayoutInBubble.paint);
            if (imageReceiver != null) {
                if (this.animatedEmojiDrawable != null) {
                    i = AndroidUtilities.dp(24.0f);
                    dp = AndroidUtilities.dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                } else {
                    int dp2 = AndroidUtilities.dp(20.0f);
                    dp = AndroidUtilities.dp(8.0f);
                    imageReceiver.setRoundRadius(0);
                    i = dp2;
                }
                int i3 = ((int) f) + dp;
                int i4 = ((int) f2) + ((int) ((this.height - i) / 2.0f));
                this.drawingImageRect.set(i3, i4, i3 + i, i + i4);
                imageReceiver.setImageCoords(this.drawingImageRect);
                drawImage(canvas, f4);
            }
            if (this.counterDrawable != null && drawCounter()) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(8.0f) + f + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f), f2);
                this.counterDrawable.draw(canvas);
                canvas.restore();
            }
            if (this.avatarsDrawable != null) {
                canvas.save();
                canvas.translate(f + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f), f2);
                this.avatarsDrawable.setAlpha(f4);
                this.avatarsDrawable.setTransitionProgress(f3);
                this.avatarsDrawable.onDraw(canvas);
                canvas.restore();
            }
        }

        protected void updateColors(float f) {
            this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, ColorUtils.blendARGB(this.textColor, this.serviceTextColor, getDrawServiceShaderBackground()), f);
            this.lastDrawnBackgroundColor = ColorUtils.blendARGB(this.fromBackgroundColor, ColorUtils.blendARGB(this.backgroundColor, this.serviceBackgroundColor, getDrawServiceShaderBackground()), f);
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
            if (this.drawImage && (this.realCount > 1 || !isPlaying() || !this.isSelected)) {
                ImageReceiver imageReceiver2 = getImageReceiver();
                if (imageReceiver2 != null) {
                    z = (imageReceiver2.getLottieAnimation() == null || !imageReceiver2.getLottieAnimation().hasBitmap()) ? true : true;
                    if (f != 1.0f) {
                        imageReceiver2.setAlpha(f);
                        if (f <= 0.0f) {
                            imageReceiver2.onDetachedFromWindow();
                            removeImageReceiver();
                        }
                    } else if (imageReceiver2.getLottieAnimation() != null && !imageReceiver2.getLottieAnimation().isRunning()) {
                        float alpha = imageReceiver2.getAlpha() - 0.08f;
                        if (alpha <= 0.0f) {
                            imageReceiver2.onDetachedFromWindow();
                            removeImageReceiver();
                        } else {
                            imageReceiver2.setAlpha(alpha);
                        }
                        this.parentView.invalidate();
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

        public void setUsers(ArrayList<TLObject> arrayList) {
            this.users = arrayList;
            if (arrayList != null) {
                Collections.sort(arrayList, ReactionsLayoutInBubble.usersComparator);
                if (this.avatarsDrawable == null) {
                    AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this.parentView, false);
                    this.avatarsDrawable = avatarsDrawable;
                    avatarsDrawable.transitionDuration = 250L;
                    Interpolator interpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
                    avatarsDrawable.setSize(AndroidUtilities.dp(20.0f));
                    this.avatarsDrawable.width = AndroidUtilities.dp(100.0f);
                    AvatarsDrawable avatarsDrawable2 = this.avatarsDrawable;
                    avatarsDrawable2.height = this.height;
                    avatarsDrawable2.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
                }
                if (this.attached) {
                    this.avatarsDrawable.onAttachedToWindow();
                }
                for (int i = 0; i < arrayList.size() && i != 3; i++) {
                    this.avatarsDrawable.setObject(i, this.currentAccount, arrayList.get(i));
                }
                this.avatarsDrawable.commitTransition(false);
            }
        }

        public void attach() {
            this.attached = true;
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
                animatedEmojiDrawable.addView(this.parentView);
            }
        }

        public void detach() {
            this.attached = false;
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
                animatedEmojiDrawable.removeView(this.parentView);
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
        float x = motionEvent.getX() - this.x;
        float y = motionEvent.getY() - this.y;
        if (motionEvent.getAction() == 0) {
            int size = this.reactionButtons.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (x <= this.reactionButtons.get(i).x || x >= this.reactionButtons.get(i).x + this.reactionButtons.get(i).width || y <= this.reactionButtons.get(i).y || y >= this.reactionButtons.get(i).y + this.reactionButtons.get(i).height) {
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

    private static class ButtonsComparator implements Comparator<ReactionButton> {
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
        public long hash;

        public static VisibleReaction fromTLReaction(TLRPC$Reaction tLRPC$Reaction) {
            VisibleReaction visibleReaction = new VisibleReaction();
            if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                String str = ((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon;
                visibleReaction.emojicon = str;
                visibleReaction.hash = str.hashCode();
            } else if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
                long j = ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
                visibleReaction.documentId = j;
                visibleReaction.hash = j;
            }
            return visibleReaction;
        }

        public TLRPC$Reaction toTLReaction() {
            if (this.emojicon != null) {
                TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                tLRPC$TL_reactionEmoji.emoticon = this.emojicon;
                return tLRPC$TL_reactionEmoji;
            }
            TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
            tLRPC$TL_reactionCustomEmoji.document_id = this.documentId;
            return tLRPC$TL_reactionCustomEmoji;
        }

        public static VisibleReaction fromEmojicon(TLRPC$TL_availableReaction tLRPC$TL_availableReaction) {
            VisibleReaction visibleReaction = new VisibleReaction();
            String str = tLRPC$TL_availableReaction.reaction;
            visibleReaction.emojicon = str;
            visibleReaction.hash = str.hashCode();
            return visibleReaction;
        }

        public static VisibleReaction fromEmojicon(String str) {
            if (str == null) {
                str = "";
            }
            VisibleReaction visibleReaction = new VisibleReaction();
            if (str.startsWith("animated_")) {
                try {
                    long parseLong = Long.parseLong(str.substring(9));
                    visibleReaction.documentId = parseLong;
                    visibleReaction.hash = parseLong;
                } catch (Exception unused) {
                    visibleReaction.emojicon = str;
                    visibleReaction.hash = str.hashCode();
                }
            } else {
                visibleReaction.emojicon = str;
                visibleReaction.hash = str.hashCode();
            }
            return visibleReaction;
        }

        public static VisibleReaction fromCustomEmoji(Long l) {
            VisibleReaction visibleReaction = new VisibleReaction();
            long longValue = l.longValue();
            visibleReaction.documentId = longValue;
            visibleReaction.hash = longValue;
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

        public boolean isSame(TLRPC$Reaction tLRPC$Reaction) {
            if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                return TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, this.emojicon);
            }
            return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == this.documentId;
        }
    }
}
