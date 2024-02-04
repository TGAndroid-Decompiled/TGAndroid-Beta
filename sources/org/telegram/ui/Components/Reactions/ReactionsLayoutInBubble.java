package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
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
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
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
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
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
    private Integer scrimViewReaction;
    public boolean tags;
    public int totalHeight;
    private float touchSlop;
    private boolean wasDrawn;
    public int width;
    public int x;
    public int y;
    private static Paint paint = new Paint(1);
    private static Paint tagPaint = new Paint(1);
    private static Paint cutTagPaint = new Paint(1);
    private static TextPaint textPaint = new TextPaint(1);
    private static final ButtonsComparator comparator = new ButtonsComparator();
    private static int pointer = 1;
    private static final Comparator<TLObject> usersComparator = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = ReactionsLayoutInBubble.lambda$static$0((TLObject) obj, (TLObject) obj2);
            return lambda$static$0;
        }
    };
    public ArrayList<ReactionButton> reactionButtons = new ArrayList<>();
    ArrayList<ReactionButton> outButtons = new ArrayList<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtons = new HashMap<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtonsTmp = new HashMap<>();
    HashMap<VisibleReaction, ImageReceiver> animatedReactions = new HashMap<>();
    int currentAccount = UserConfig.selectedAccount;

    public static void initPaints(Theme.ResourcesProvider resourcesProvider) {
        paint.setColor(Theme.getColor(Theme.key_chat_inLoader, resourcesProvider));
        textPaint.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        cutTagPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
        initPaints(this.resourcesProvider);
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean equalsTLReaction(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2) {
        if ((tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon);
        }
        return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id;
    }

    public void setMessage(org.telegram.messenger.MessageObject r19, boolean r20, boolean r21, org.telegram.ui.ActionBar.Theme.ResourcesProvider r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble.setMessage(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
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
            } else if (reactionButton.isTag) {
                reactionButton.width = AndroidUtilities.dp(42.0f);
                reactionButton.height = AndroidUtilities.dp(26.0f);
                if (reactionButton.hasName) {
                    reactionButton.width = (int) (reactionButton.width + reactionButton.textDrawable.getAnimateToWidth() + AndroidUtilities.dp(8.0f));
                } else {
                    CounterView.CounterDrawable counterDrawable = reactionButton.counterDrawable;
                    if (counterDrawable != null && reactionButton.count > 1) {
                        reactionButton.width += counterDrawable.getCurrentWidth() + AndroidUtilities.dp(8.0f);
                    }
                }
            } else {
                reactionButton.width = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(4.0f);
                if (reactionButton.avatarsDrawable != null && reactionButton.users.size() > 0) {
                    reactionButton.users.size();
                    reactionButton.width = (int) (reactionButton.width + AndroidUtilities.dp(2.0f) + (AndroidUtilities.dp(20.0f) * 1) + ((reactionButton.users.size() > 1 ? reactionButton.users.size() - 1 : 0) * AndroidUtilities.dp(20.0f) * 0.8f) + AndroidUtilities.dp(1.0f));
                    reactionButton.avatarsDrawable.height = AndroidUtilities.dp(26.0f);
                } else if (reactionButton.hasName) {
                    reactionButton.width = (int) (reactionButton.width + reactionButton.textDrawable.getAnimateToWidth() + AndroidUtilities.dp(8.0f));
                } else {
                    reactionButton.width += reactionButton.counterDrawable.getCurrentWidth() + AndroidUtilities.dp(8.0f);
                }
                reactionButton.height = AndroidUtilities.dp(26.0f);
            }
            if (reactionButton.width + i4 > i) {
                i5 += reactionButton.height + AndroidUtilities.dp(4.0f);
                i4 = 0;
            }
            reactionButton.x = i4;
            reactionButton.y = i5;
            i4 += reactionButton.width + AndroidUtilities.dp(4.0f);
            if (i4 > i3) {
                i3 = i4;
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
        this.lastLineX = i4;
        if (i2 == 5) {
            this.width = i;
        } else {
            this.width = i3;
        }
        this.height = i5 + (this.reactionButtons.size() != 0 ? AndroidUtilities.dp(26.0f) : 0);
        this.drawServiceShaderBackground = 0.0f;
    }

    public void draw(Canvas canvas, float f, Integer num) {
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
            if (!Objects.equals(Integer.valueOf(reactionButton.reaction.hashCode()), this.scrimViewReaction) && (num == null || reactionButton.reaction.hashCode() == num.intValue())) {
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
                reactionButton.draw(canvas, f8 + f6, f7 + f9, reactionButton.animationType == 3 ? f : 1.0f, f2, num != null);
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
                    reactionButton.fromTagDotColor = reactionButton2.lastDrawnTagDotColor;
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

    public void setScrimReaction(Integer num) {
        this.scrimViewReaction = num;
    }

    public class ReactionLayoutButton extends ReactionButton {
        public ReactionLayoutButton(ReactionButton reactionButton, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z, boolean z2) {
            super(reactionButton, ReactionsLayoutInBubble.this.currentAccount, ReactionsLayoutInBubble.this.parentView, tLRPC$ReactionCount, z, z2, ReactionsLayoutInBubble.this.resourcesProvider);
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

    public boolean verifyDrawable(Drawable drawable) {
        return drawable instanceof AnimatedTextView.AnimatedTextDrawable;
    }

    public static class ReactionButton {
        public int animateFromWidth;
        public int animateFromX;
        public int animateFromY;
        public AnimatedEmojiDrawable animatedEmojiDrawable;
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
        public int fromBackgroundColor;
        public int fromTagDotColor;
        public int fromTextColor;
        public boolean hasName;
        public int height;
        public ImageReceiver imageReceiver;
        boolean isSelected;
        private final boolean isSmall;
        public boolean isTag;
        public String key;
        public int lastDrawnBackgroundColor;
        public int lastDrawnTagDotColor;
        public int lastDrawnTextColor;
        public boolean lastImageDrawn;
        public String name;
        private final View parentView;
        TLRPC$Reaction reaction;
        private final TLRPC$ReactionCount reactionCount;
        public int realCount;
        private final Theme.ResourcesProvider resourcesProvider;
        int serviceBackgroundColor;
        int serviceTextColor;
        int textColor;
        public AnimatedTextView.AnimatedTextDrawable textDrawable;
        ArrayList<TLObject> users;
        VisibleReaction visibleReaction;
        public int width;
        public int x;
        public int y;
        public boolean drawImage = true;
        Rect drawingImageRect = new Rect();
        private RectF bounds = new RectF();
        private RectF rect2 = new RectF();
        private final Path tagPath = new Path();

        protected boolean drawTagDot() {
            return true;
        }

        protected boolean drawTextWithCounter() {
            return false;
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

        protected int getCacheType() {
            return this.isTag ? 18 : 3;
        }

        public ReactionButton(ReactionButton reactionButton, int i, View view, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            this.currentAccount = i;
            this.parentView = view;
            this.resourcesProvider = resourcesProvider;
            this.isTag = z2;
            if (reactionButton != null) {
                this.counterDrawable = reactionButton.counterDrawable;
            }
            if (this.imageReceiver == null) {
                this.imageReceiver = new ImageReceiver();
            }
            if (this.counterDrawable == null) {
                this.counterDrawable = new CounterView.CounterDrawable(view, false, null);
            }
            if (this.textDrawable == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
                this.textDrawable = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.textDrawable.setTextSize(AndroidUtilities.dp(13.0f));
                this.textDrawable.setCallback(view);
                this.textDrawable.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.textDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
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
            if (z2) {
                String savedTagName = MessagesController.getInstance(i).getSavedTagName(this.reaction);
                this.name = savedTagName;
                this.hasName = !TextUtils.isEmpty(savedTagName);
            }
            if (this.hasName) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.textDrawable;
                animatedTextDrawable2.setText(Emoji.replaceEmoji(this.name, animatedTextDrawable2.getPaint().getFontMetricsInt(), false), !LocaleController.isRTL);
                if (drawTextWithCounter()) {
                    Integer.toString(tLRPC$ReactionCount.count);
                    this.counterDrawable.setCount(this.count, false);
                } else {
                    this.counterDrawable.setCount(0, false);
                }
            } else {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = this.textDrawable;
                if (animatedTextDrawable3 != null) {
                    animatedTextDrawable3.setText(BuildConfig.APP_CENTER_HASH, false);
                }
                Integer.toString(tLRPC$ReactionCount.count);
                this.counterDrawable.setCount(this.count, false);
            }
            this.counterDrawable.setType(2);
            this.counterDrawable.gravity = 3;
        }

        private void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            if (this.isTag) {
                RectF rectF2 = this.bounds;
                if (rectF2.left != rectF.left || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                    rectF2.set(rectF);
                    ReactionsLayoutInBubble.fillTagPath(this.bounds, this.rect2, this.tagPath);
                }
                canvas.drawPath(this.tagPath, paint);
                return;
            }
            canvas.drawRoundRect(rectF, f, f, paint);
        }

        protected boolean drawCounter() {
            int i = this.count;
            return ((i == 0 || (this.isTag && !this.hasName && i == 1)) && this.counterDrawable.countChangeProgress == 1.0f) ? false : true;
        }

        public void draw(android.graphics.Canvas r18, float r19, float r20, float r21, float r22, boolean r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble.ReactionButton.draw(android.graphics.Canvas, float, float, float, float, boolean):void");
        }

        protected void updateColors(float f) {
            this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, ColorUtils.blendARGB(this.textColor, this.serviceTextColor, getDrawServiceShaderBackground()), f);
            int blendARGB = ColorUtils.blendARGB(this.fromBackgroundColor, ColorUtils.blendARGB(this.backgroundColor, this.serviceBackgroundColor, getDrawServiceShaderBackground()), f);
            this.lastDrawnBackgroundColor = blendARGB;
            this.lastDrawnTagDotColor = ColorUtils.blendARGB(this.fromTagDotColor, AndroidUtilities.computePerceivedBrightness(blendARGB) > 0.8f ? 0 : 1526726655, f);
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

        public void startAnimation() {
            ImageReceiver imageReceiver;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                imageReceiver = this.animatedEmojiDrawable.getImageReceiver();
            } else {
                imageReceiver = this.imageReceiver;
            }
            if (imageReceiver != null) {
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.restart(true);
                    return;
                }
                AnimatedFileDrawable animation = imageReceiver.getAnimation();
                if (animation != null) {
                    animation.start();
                }
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
        } else if (this.tags && visibleReaction.documentId != 0) {
            for (int i2 = 0; i2 < this.reactionButtons.size(); i2++) {
                if (visibleReaction.isSame(this.reactionButtons.get(i2).reaction)) {
                    this.reactionButtons.get(i2).startAnimation();
                    return;
                }
            }
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
                str = BuildConfig.APP_CENTER_HASH;
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

        public String toString() {
            TLRPC$Document findDocument;
            if (!TextUtils.isEmpty(this.emojicon)) {
                return this.emojicon;
            }
            long j = this.documentId;
            if (j != 0 && (findDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j)) != null) {
                return MessageObject.findAnimatedEmojiEmoticon(findDocument, null);
            }
            return "VisibleReaction{" + this.documentId + ", " + this.emojicon + "}";
        }

        public CharSequence toCharSequence(Paint.FontMetricsInt fontMetricsInt) {
            if (!TextUtils.isEmpty(this.emojicon)) {
                return this.emojicon;
            }
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new AnimatedEmojiSpan(this.documentId, fontMetricsInt), 0, spannableString.length(), 17);
            return spannableString;
        }

        public CharSequence toCharSequence(int i) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(i));
            if (!TextUtils.isEmpty(this.emojicon)) {
                return Emoji.replaceEmoji(this.emojicon, textPaint.getFontMetricsInt(), false);
            }
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new AnimatedEmojiSpan(this.documentId, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    public static boolean reactionsEqual(TLRPC$Reaction tLRPC$Reaction, TLRPC$Reaction tLRPC$Reaction2) {
        if (!(tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji)) {
            return (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction2 instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction2).document_id;
        } else if (tLRPC$Reaction2 instanceof TLRPC$TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon, ((TLRPC$TL_reactionEmoji) tLRPC$Reaction2).emoticon);
        } else {
            return false;
        }
    }

    public static void fillTagPath(RectF rectF, Path path) {
        fillTagPath(rectF, AndroidUtilities.rectTmp, path);
    }

    public static void fillTagPath(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f = rectF.left;
        rectF2.set(f, rectF.top, AndroidUtilities.dp(12.0f) + f, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f2 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = dpf2 + AndroidUtilities.dpf2(1.22f);
        float dpf24 = dpf2 + AndroidUtilities.dpf2(3.07f);
        float dpf25 = dpf2 + AndroidUtilities.dpf2(2.406f);
        float dpf26 = dpf2 + AndroidUtilities.dpf2(8.27f + f2);
        float dpf27 = dpf2 + AndroidUtilities.dpf2(8.923f + f2);
        float dpf28 = rectF.top + AndroidUtilities.dpf2(1.753f);
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = rectF.top + AndroidUtilities.dpf2(0.663f);
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f3 = 10.263f + f2;
        float dpf212 = rectF.top + AndroidUtilities.dpf2(f3);
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f3);
        float f4 = f2 + 11.333f;
        float dpf214 = rectF.top + AndroidUtilities.dpf2(f4);
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f4);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f5 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f5, dpf22, f5);
        path.close();
    }
}
