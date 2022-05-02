package org.telegram.p009ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ChatListItemAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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
import org.telegram.p009ui.Components.AvatarsDarawable;
import org.telegram.p009ui.Components.CounterView;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_messagePeerReaction;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$User;

public class ReactionsLayoutInBubble {
    private static int animationUniq;
    private int animateFromTotalHeight;
    private boolean animateHeight;
    private boolean animateMove;
    private boolean animateWidth;
    boolean attached;
    public boolean drawServiceShaderBackground;
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
    private boolean wasDrawn;
    public int width;
    public int f1074x;
    public int f1075y;
    private static Paint paint = new Paint(1);
    private static TextPaint textPaint = new TextPaint(1);
    private static final ButtonsComparator comparator = new ButtonsComparator();
    private static final Comparator<TLRPC$User> usersComparator = ReactionsLayoutInBubble$$ExternalSyntheticLambda1.INSTANCE;
    ArrayList<ReactionButton> reactionButtons = new ArrayList<>();
    ArrayList<ReactionButton> outButtons = new ArrayList<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtons = new HashMap<>();
    HashMap<String, ReactionButton> lastDrawingReactionButtonsTmp = new HashMap<>();
    HashMap<String, ImageReceiver> animatedReactions = new HashMap<>();
    int currentAccount = UserConfig.selectedAccount;
    private float touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();

    public static int lambda$static$0(TLRPC$User tLRPC$User, TLRPC$User tLRPC$User2) {
        return (int) (tLRPC$User.f985id - tLRPC$User2.f985id);
    }

    public ReactionsLayoutInBubble(ChatMessageCell chatMessageCell) {
        this.parentView = chatMessageCell;
        paint.setColor(Theme.getColor("chat_inLoader"));
        textPaint.setColor(Theme.getColor("featuredStickers_buttonText"));
        textPaint.setTextSize(AndroidUtilities.m34dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
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
                    TLRPC$TL_reactionCount tLRPC$TL_reactionCount = messageObject.messageOwner.reactions.results.get(i4);
                    ReactionButton reactionButton = new ReactionButton(tLRPC$TL_reactionCount);
                    this.reactionButtons.add(reactionButton);
                    if (!z && messageObject.messageOwner.reactions.recent_reactions != null) {
                        ArrayList<TLRPC$User> arrayList = null;
                        if (tLRPC$TL_reactionCount.count <= 3 && i2 <= 3) {
                            for (int i5 = 0; i5 < messageObject.messageOwner.reactions.recent_reactions.size(); i5++) {
                                TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i5);
                                if (tLRPC$TL_messagePeerReaction.reaction.equals(tLRPC$TL_reactionCount.reaction) && MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$TL_messagePeerReaction.peer_id))) != null) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$TL_messagePeerReaction.peer_id))));
                                }
                            }
                            reactionButton.setUsers(arrayList);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                reactionButton.count = 0;
                                reactionButton.counterDrawable.setCount(0, false);
                            }
                        }
                    }
                    if (z && tLRPC$TL_reactionCount.count > 1 && tLRPC$TL_reactionCount.chosen) {
                        this.reactionButtons.add(new ReactionButton(tLRPC$TL_reactionCount));
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
            if (!z) {
                ButtonsComparator buttonsComparator = comparator;
                buttonsComparator.currentAccount = this.currentAccount;
                Collections.sort(this.reactionButtons, buttonsComparator);
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
        if (!this.isEmpty) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.reactionButtons.size(); i6++) {
                ReactionButton reactionButton = this.reactionButtons.get(i6);
                if (this.isSmall) {
                    reactionButton.width = AndroidUtilities.m34dp(14.0f);
                    reactionButton.height = AndroidUtilities.m34dp(14.0f);
                } else {
                    reactionButton.width = AndroidUtilities.m34dp(8.0f) + AndroidUtilities.m34dp(20.0f) + AndroidUtilities.m34dp(4.0f);
                    if (reactionButton.avatarsDarawable == null || reactionButton.users.size() <= 0) {
                        reactionButton.width = (int) (reactionButton.width + reactionButton.counterDrawable.textPaint.measureText(reactionButton.countText) + AndroidUtilities.m34dp(8.0f));
                    } else {
                        reactionButton.users.size();
                        reactionButton.width = (int) (reactionButton.width + AndroidUtilities.m34dp(2.0f) + (AndroidUtilities.m34dp(20.0f) * 1) + ((reactionButton.users.size() > 1 ? reactionButton.users.size() - 1 : 0) * AndroidUtilities.m34dp(20.0f) * 0.8f) + AndroidUtilities.m34dp(1.0f));
                        reactionButton.avatarsDarawable.height = AndroidUtilities.m34dp(26.0f);
                    }
                    reactionButton.height = AndroidUtilities.m34dp(26.0f);
                }
                if (reactionButton.width + i3 > i) {
                    i4 += reactionButton.height + AndroidUtilities.m34dp(4.0f);
                    i3 = 0;
                }
                reactionButton.f1076x = i3;
                reactionButton.f1077y = i4;
                i3 += reactionButton.width + AndroidUtilities.m34dp(4.0f);
                if (i3 > i5) {
                    i5 = i3;
                }
            }
            if (i2 == 5 && !this.reactionButtons.isEmpty()) {
                int i7 = this.reactionButtons.get(0).f1077y;
                int i8 = 0;
                for (int i9 = 0; i9 < this.reactionButtons.size(); i9++) {
                    if (this.reactionButtons.get(i9).f1077y != i7) {
                        int i10 = i9 - 1;
                        int i11 = (i - this.reactionButtons.get(i10).f1076x) + this.reactionButtons.get(i10).width;
                        while (i8 < i9) {
                            this.reactionButtons.get(i8).f1076x += i11;
                            i8++;
                        }
                        i8 = i9;
                    }
                }
                int size = this.reactionButtons.size() - 1;
                if (i8 != size) {
                    int i12 = i - (this.reactionButtons.get(size).f1076x + this.reactionButtons.get(size).width);
                    while (i8 <= size) {
                        this.reactionButtons.get(i8).f1076x += i12;
                        i8++;
                    }
                }
            }
            this.lastLineX = i3;
            if (i2 == 5) {
                this.width = i;
            } else {
                this.width = i5;
            }
            this.height = i4 + (this.reactionButtons.size() == 0 ? 0 : AndroidUtilities.m34dp(26.0f));
            this.drawServiceShaderBackground = false;
        }
    }

    public void draw(Canvas canvas, float f, String str) {
        float f2;
        if (!this.isEmpty || !this.outButtons.isEmpty()) {
            float f3 = this.f1074x;
            float f4 = this.f1075y;
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
                    int i2 = reactionButton.f1076x;
                    float f6 = i2;
                    int i3 = reactionButton.f1077y;
                    float f7 = i3;
                    if (f != 1.0f && reactionButton.animationType == 3) {
                        float f8 = 1.0f - f;
                        f6 = (reactionButton.animateFromX * f8) + (i2 * f);
                        f7 = (i3 * f) + (reactionButton.animateFromY * f8);
                    }
                    canvas.translate(f6, f7);
                    boolean z = true;
                    if (f == 1.0f || reactionButton.animationType != 1) {
                        f2 = 1.0f;
                    } else {
                        float f9 = (f * 0.5f) + 0.5f;
                        canvas.scale(f9, f9, reactionButton.width / 2.0f, reactionButton.height / 2.0f);
                        f2 = f;
                    }
                    float f10 = reactionButton.animationType == 3 ? f : 1.0f;
                    if (str == null) {
                        z = false;
                    }
                    reactionButton.draw(canvas, f10, f2, z);
                    canvas.restore();
                }
            }
            for (int i4 = 0; i4 < this.outButtons.size(); i4++) {
                ReactionButton reactionButton2 = this.outButtons.get(i4);
                canvas.save();
                canvas.translate(reactionButton2.f1076x, reactionButton2.f1077y);
                float f11 = 1.0f - f;
                float f12 = (f11 * 0.5f) + 0.5f;
                canvas.scale(f12, f12, reactionButton2.width / 2.0f, reactionButton2.height / 2.0f);
                this.outButtons.get(i4).draw(canvas, 1.0f, f11, false);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public void recordDrawingState() {
        this.lastDrawingReactionButtons.clear();
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.lastDrawingReactionButtons.put(this.reactionButtons.get(i).key, this.reactionButtons.get(i));
        }
        this.wasDrawn = !this.isEmpty;
        this.lastDrawnX = this.f1074x;
        this.lastDrawnY = this.f1075y;
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
            ReactionButton remove = this.lastDrawingReactionButtonsTmp.remove(reactionButton.key);
            if (remove != null) {
                int i3 = reactionButton.f1076x;
                int i4 = remove.f1076x;
                if (i3 == i4 && reactionButton.f1077y == remove.f1077y && reactionButton.width == remove.width && reactionButton.count == remove.count && reactionButton.backgroundColor == remove.backgroundColor && reactionButton.avatarsDarawable == null && remove.avatarsDarawable == null) {
                    reactionButton.animationType = 0;
                } else {
                    reactionButton.animateFromX = i4;
                    reactionButton.animateFromY = remove.f1077y;
                    reactionButton.animateFromWidth = remove.width;
                    reactionButton.fromTextColor = remove.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = remove.lastDrawnBackgroundColor;
                    reactionButton.animationType = 3;
                    int i5 = reactionButton.count;
                    int i6 = remove.count;
                    if (i5 != i6) {
                        reactionButton.counterDrawable.setCount(i6, false);
                        reactionButton.counterDrawable.setCount(reactionButton.count, true);
                    }
                    AvatarsDarawable avatarsDarawable = reactionButton.avatarsDarawable;
                    if (!(avatarsDarawable == null && remove.avatarsDarawable == null)) {
                        if (avatarsDarawable == null) {
                            reactionButton.setUsers(new ArrayList<>());
                        }
                        if (remove.avatarsDarawable == null) {
                            remove.setUsers(new ArrayList<>());
                        }
                        reactionButton.avatarsDarawable.animateFromState(remove.avatarsDarawable, this.currentAccount, false);
                    }
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
            if (!(f == this.f1074x && this.lastDrawnY == this.f1075y)) {
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
        if (i9 == this.totalHeight) {
            return z;
        }
        this.animateHeight = true;
        this.animateFromTotalHeight = i9;
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

    public ReactionButton getReactionButton(String str) {
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
        public int animationType;
        AvatarsDarawable avatarsDarawable;
        int backgroundColor;
        int count;
        String countText;
        CounterView.CounterDrawable counterDrawable;
        public int fromBackgroundColor;
        public int fromTextColor;
        public int height;
        boolean isSelected;
        public String key;
        int lastDrawnBackgroundColor;
        int lastDrawnTextColor;
        public boolean lastImageDrawn;
        String reaction;
        private final TLRPC$TL_reactionCount reactionCount;
        public int realCount;
        int serviceBackgroundColor;
        int serviceTextColor;
        int textColor;
        ArrayList<TLRPC$User> users;
        public int width;
        public int f1076x;
        public int f1077y;
        public boolean drawImage = true;
        ImageReceiver imageReceiver = new ImageReceiver();

        public ReactionButton(TLRPC$TL_reactionCount tLRPC$TL_reactionCount) {
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
            this.counterDrawable = new CounterView.CounterDrawable(ReactionsLayoutInBubble.this.parentView, false, null);
            this.reactionCount = tLRPC$TL_reactionCount;
            String str = tLRPC$TL_reactionCount.reaction;
            this.reaction = str;
            int i = tLRPC$TL_reactionCount.count;
            this.count = i;
            this.realCount = i;
            this.key = str;
            this.countText = Integer.toString(i);
            this.imageReceiver.setParentView(ReactionsLayoutInBubble.this.parentView);
            boolean z = tLRPC$TL_reactionCount.chosen;
            this.isSelected = z;
            CounterView.CounterDrawable counterDrawable = this.counterDrawable;
            counterDrawable.updateVisibility = false;
            counterDrawable.shortFormat = true;
            String str2 = "chat_outReactionButtonBackground";
            if (z) {
                this.backgroundColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? str2 : "chat_inReactionButtonBackground", ReactionsLayoutInBubble.this.resourcesProvider);
                this.textColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonTextSelected" : "chat_inReactionButtonTextSelected", ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceTextColor = Theme.getColor(!ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_inReactionButtonBackground" : str2, ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceBackgroundColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outBubble" : "chat_inBubble");
            } else {
                this.textColor = Theme.getColor(ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_outReactionButtonText" : "chat_inReactionButtonText", ReactionsLayoutInBubble.this.resourcesProvider);
                int color = Theme.getColor(!ReactionsLayoutInBubble.this.messageObject.isOutOwner() ? "chat_inReactionButtonBackground" : str2, ReactionsLayoutInBubble.this.resourcesProvider);
                this.backgroundColor = color;
                this.backgroundColor = ColorUtils.setAlphaComponent(color, (int) (Color.alpha(color) * 0.156f));
                this.serviceTextColor = Theme.getColor("chat_serviceText", ReactionsLayoutInBubble.this.resourcesProvider);
                this.serviceBackgroundColor = 0;
            }
            if (!(this.reaction == null || (tLRPC$TL_availableReaction = MediaDataController.getInstance(ReactionsLayoutInBubble.this.currentAccount).getReactionsMap().get(this.reaction)) == null)) {
                this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_lastframe", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon, "windowBackgroundGray", 1.0f), "webp", tLRPC$TL_availableReaction, 1);
            }
            this.counterDrawable.setSize(AndroidUtilities.m34dp(26.0f), AndroidUtilities.m34dp(100.0f));
            this.counterDrawable.textPaint = ReactionsLayoutInBubble.textPaint;
            this.counterDrawable.setCount(this.count, false);
            this.counterDrawable.setType(2);
            this.counterDrawable.gravity = 3;
        }

        public void draw(Canvas canvas, float f, float f2, boolean z) {
            Theme.MessageDrawable currentBackgroundDrawable;
            if (ReactionsLayoutInBubble.this.isSmall) {
                this.imageReceiver.setAlpha(f2);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.m34dp(14.0f), AndroidUtilities.m34dp(14.0f));
                drawImage(canvas, f2);
                return;
            }
            updateColors(f);
            ReactionsLayoutInBubble.textPaint.setColor(this.lastDrawnTextColor);
            ReactionsLayoutInBubble.paint.setColor(this.lastDrawnBackgroundColor);
            if (f2 != 1.0f) {
                ReactionsLayoutInBubble.textPaint.setAlpha((int) (ReactionsLayoutInBubble.textPaint.getAlpha() * f2));
                ReactionsLayoutInBubble.paint.setAlpha((int) (ReactionsLayoutInBubble.paint.getAlpha() * f2));
            }
            this.imageReceiver.setAlpha(f2);
            int i = this.width;
            if (f != 1.0f && this.animationType == 3) {
                i = (int) ((i * f) + (this.animateFromWidth * (1.0f - f)));
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, i, this.height);
            float f3 = this.height / 2.0f;
            ReactionsLayoutInBubble reactionsLayoutInBubble = ReactionsLayoutInBubble.this;
            if (reactionsLayoutInBubble.drawServiceShaderBackground) {
                Paint themedPaint = reactionsLayoutInBubble.getThemedPaint("paintChatActionBackground");
                Paint paint = Theme.chat_actionBackgroundGradientDarkenPaint;
                int alpha = themedPaint.getAlpha();
                int alpha2 = paint.getAlpha();
                themedPaint.setAlpha((int) (alpha * f2));
                paint.setAlpha((int) (alpha2 * f2));
                canvas.drawRoundRect(rectF, f3, f3, themedPaint);
                if (ReactionsLayoutInBubble.this.hasGradientService()) {
                    canvas.drawRoundRect(rectF, f3, f3, paint);
                }
                themedPaint.setAlpha(alpha);
                paint.setAlpha(alpha2);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = ReactionsLayoutInBubble.this;
            if (!reactionsLayoutInBubble2.drawServiceShaderBackground && z && (currentBackgroundDrawable = reactionsLayoutInBubble2.parentView.getCurrentBackgroundDrawable(false)) != null) {
                canvas.drawRoundRect(rectF, f3, f3, currentBackgroundDrawable.getPaint());
            }
            canvas.drawRoundRect(rectF, f3, f3, ReactionsLayoutInBubble.paint);
            this.imageReceiver.setImageCoords(AndroidUtilities.m34dp(8.0f), (this.height - AndroidUtilities.m34dp(20.0f)) / 2.0f, AndroidUtilities.m34dp(20.0f), AndroidUtilities.m34dp(20.0f));
            drawImage(canvas, f2);
            if (!(this.count == 0 && this.counterDrawable.countChangeProgress == 1.0f)) {
                canvas.save();
                canvas.translate(AndroidUtilities.m34dp(8.0f) + AndroidUtilities.m34dp(20.0f) + AndroidUtilities.m34dp(2.0f), 0.0f);
                this.counterDrawable.draw(canvas);
                canvas.restore();
            }
            if (this.avatarsDarawable != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.m34dp(10.0f) + AndroidUtilities.m34dp(20.0f) + AndroidUtilities.m34dp(2.0f), 0.0f);
                this.avatarsDarawable.setAlpha(f2);
                this.avatarsDarawable.setTransitionProgress(f);
                this.avatarsDarawable.onDraw(canvas);
                canvas.restore();
            }
        }

        private void updateColors(float f) {
            if (ReactionsLayoutInBubble.this.drawServiceShaderBackground) {
                this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, this.serviceTextColor, f);
                this.lastDrawnBackgroundColor = ColorUtils.blendARGB(this.fromBackgroundColor, this.serviceBackgroundColor, f);
                return;
            }
            this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, this.textColor, f);
            this.lastDrawnBackgroundColor = ColorUtils.blendARGB(this.fromBackgroundColor, this.backgroundColor, f);
        }

        private void drawImage(Canvas canvas, float f) {
            boolean z = false;
            if (!this.drawImage || (this.realCount <= 1 && ReactionsEffectOverlay.isPlaying(ReactionsLayoutInBubble.this.messageObject.getId(), ReactionsLayoutInBubble.this.messageObject.getGroupId(), this.reaction) && this.isSelected)) {
                this.imageReceiver.setAlpha(0.0f);
                this.imageReceiver.draw(canvas);
                this.lastImageDrawn = false;
                return;
            }
            ImageReceiver imageReceiver = ReactionsLayoutInBubble.this.animatedReactions.get(this.reaction);
            if (imageReceiver != null) {
                if (imageReceiver.getLottieAnimation() == null || !imageReceiver.getLottieAnimation().hasBitmap()) {
                    z = true;
                }
                if (f != 1.0f) {
                    imageReceiver.setAlpha(f);
                    if (f <= 0.0f) {
                        imageReceiver.onDetachedFromWindow();
                        ReactionsLayoutInBubble.this.animatedReactions.remove(this.reaction);
                    }
                } else if (imageReceiver.getLottieAnimation() != null && !imageReceiver.getLottieAnimation().isRunning()) {
                    float alpha = imageReceiver.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        imageReceiver.onDetachedFromWindow();
                        ReactionsLayoutInBubble.this.animatedReactions.remove(this.reaction);
                    } else {
                        imageReceiver.setAlpha(alpha);
                    }
                    ReactionsLayoutInBubble.this.parentView.invalidate();
                    z = true;
                }
                imageReceiver.setImageCoords(this.imageReceiver.getImageX() - (this.imageReceiver.getImageWidth() / 2.0f), this.imageReceiver.getImageY() - (this.imageReceiver.getImageWidth() / 2.0f), this.imageReceiver.getImageWidth() * 2.0f, this.imageReceiver.getImageHeight() * 2.0f);
                imageReceiver.draw(canvas);
            } else {
                z = true;
            }
            if (z) {
                this.imageReceiver.draw(canvas);
            }
            this.lastImageDrawn = true;
        }

        public void setUsers(ArrayList<TLRPC$User> arrayList) {
            this.users = arrayList;
            if (arrayList != null) {
                Collections.sort(arrayList, ReactionsLayoutInBubble.usersComparator);
                if (this.avatarsDarawable == null) {
                    AvatarsDarawable avatarsDarawable = new AvatarsDarawable(ReactionsLayoutInBubble.this.parentView, false);
                    this.avatarsDarawable = avatarsDarawable;
                    avatarsDarawable.transitionDuration = 250L;
                    Interpolator interpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
                    avatarsDarawable.setSize(AndroidUtilities.m34dp(20.0f));
                    this.avatarsDarawable.width = AndroidUtilities.m34dp(100.0f);
                    AvatarsDarawable avatarsDarawable2 = this.avatarsDarawable;
                    avatarsDarawable2.height = this.height;
                    if (ReactionsLayoutInBubble.this.attached) {
                        avatarsDarawable2.onAttachedToWindow();
                    }
                }
                for (int i = 0; i < arrayList.size() && i != 3; i++) {
                    this.avatarsDarawable.setObject(i, ReactionsLayoutInBubble.this.currentAccount, arrayList.get(i));
                }
                this.avatarsDarawable.commitTransition(false);
            }
        }

        public void attach() {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
            AvatarsDarawable avatarsDarawable = this.avatarsDarawable;
            if (avatarsDarawable != null) {
                avatarsDarawable.onAttachedToWindow();
            }
        }

        public void detach() {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
            AvatarsDarawable avatarsDarawable = this.avatarsDarawable;
            if (avatarsDarawable != null) {
                avatarsDarawable.onDetachedFromWindow();
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
        float x = motionEvent.getX() - this.f1074x;
        float y = motionEvent.getY() - this.f1075y;
        if (motionEvent.getAction() == 0) {
            int size = this.reactionButtons.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (x <= this.reactionButtons.get(i).f1076x || x >= this.reactionButtons.get(i).f1076x + this.reactionButtons.get(i).width || y <= this.reactionButtons.get(i).f1077y || y >= this.reactionButtons.get(i).f1077y + this.reactionButtons.get(i).height) {
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
                    if (this.messageObject.messageOwner.reactions.can_see_list) {
                        Runnable reactionsLayoutInBubble$$ExternalSyntheticLambda0 = new Runnable() {
                            @Override
                            public final void run() {
                                ReactionsLayoutInBubble.this.lambda$chekTouchEvent$1(reactionButton);
                            }
                        };
                        this.longPressRunnable = reactionsLayoutInBubble$$ExternalSyntheticLambda0;
                        AndroidUtilities.runOnUIThread(reactionsLayoutInBubble$$ExternalSyntheticLambda0, ViewConfiguration.getLongPressTimeout());
                    }
                    this.pressed = true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if ((this.pressed && Math.abs(motionEvent.getX() - this.lastX) > this.touchSlop) || Math.abs(motionEvent.getY() - this.lastY) > this.touchSlop) {
                this.pressed = false;
                this.lastSelectedButton = null;
                Runnable runnable2 = this.longPressRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.longPressRunnable = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            Runnable runnable3 = this.longPressRunnable;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
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

        private ButtonsComparator() {
        }

        public int compare(ReactionButton reactionButton, ReactionButton reactionButton2) {
            int i = reactionButton.realCount;
            int i2 = reactionButton2.realCount;
            if (i != i2) {
                return i2 - i;
            }
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(reactionButton.reaction);
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction2 = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(reactionButton2.reaction);
            if (tLRPC$TL_availableReaction == null || tLRPC$TL_availableReaction2 == null) {
                return 0;
            }
            return tLRPC$TL_availableReaction.positionInList - tLRPC$TL_availableReaction2.positionInList;
        }
    }

    public void onAttachToWindow() {
        for (int i = 0; i < this.reactionButtons.size(); i++) {
            this.reactionButtons.get(i).attach();
        }
    }

    public void onDetachFromWindow() {
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

    public void animateReaction(String str) {
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
        if (this.animatedReactions.get(str) == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            imageReceiver.setParentView(this.parentView);
            int i = animationUniq;
            animationUniq = i + 1;
            imageReceiver.setUniqKeyPrefix(Integer.toString(i));
            if (!(str == null || (tLRPC$TL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(str)) == null)) {
                imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tLRPC$TL_availableReaction, 1);
            }
            imageReceiver.setAutoRepeat(0);
            imageReceiver.onAttachedToWindow();
            this.animatedReactions.put(str, imageReceiver);
        }
    }
}
