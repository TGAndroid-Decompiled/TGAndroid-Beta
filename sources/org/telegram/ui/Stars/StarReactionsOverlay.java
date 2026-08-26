package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PaidReactionButton;
import org.telegram.ui.Stories.PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.FlashViews;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class StarReactionsOverlay extends View {
    public float accumulatedRippleIntensity;
    public BaseCell cell;
    public final ChatActivity chatActivity;
    public final RectF clickBounds;
    public final AnimatedTextView.AnimatedTextDrawable counter;
    public final AnimatedFloat counterAlpha;
    public boolean counterShown;
    public final int[] effectAssets;
    public final ArrayList effects;
    public float focus;
    public ValueAnimator focusAnimator;
    public boolean hidden;
    public final StarReactionsOverlay$$ExternalSyntheticLambda2 hideCounterRunnable;
    public long lastRippleTime;
    public final LivePlayer$$ExternalSyntheticLambda17 longPressRunnable;
    public int messageId;
    public final int[] pos;
    public final int[] pos2;
    public boolean pressed;
    public final RectF reactionBounds;
    public final Paint shadowPaint;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final float val$dst;
        public final Runnable val$whenDone;

        public AnonymousClass1(Object obj, float f, Runnable runnable, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$dst = f;
            this.val$whenDone = runnable;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            StarReactionsOverlay$$ExternalSyntheticLambda2 starReactionsOverlay$$ExternalSyntheticLambda2;
            PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0;
            Runnable runnable = this.val$whenDone;
            float f = this.val$dst;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    StarReactionsOverlay starReactionsOverlay = (StarReactionsOverlay) obj;
                    starReactionsOverlay.focus = f;
                    starReactionsOverlay.invalidate();
                    if (animator == starReactionsOverlay.focusAnimator && (starReactionsOverlay$$ExternalSyntheticLambda2 = (StarReactionsOverlay$$ExternalSyntheticLambda2) runnable) != null) {
                        starReactionsOverlay$$ExternalSyntheticLambda2.run();
                        break;
                    }
                    break;
                case 1:
                    PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = (PaidReactionButton.PaidReactionButtonEffectsView) obj;
                    paidReactionButtonEffectsView.focus = f;
                    paidReactionButtonEffectsView.invalidate();
                    if (animator == paidReactionButtonEffectsView.focusAnimator && (paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 = (PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0) runnable) != null) {
                        paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0.run();
                        break;
                    }
                    break;
                case 2:
                    FlashViews flashViews = (FlashViews) obj;
                    flashViews.invert = f;
                    flashViews.update();
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
                default:
                    StoryRecorder storyRecorder = (StoryRecorder) obj;
                    storyRecorder.frozenDismissProgress = null;
                    storyRecorder.openProgress = f;
                    storyRecorder.applyOpenProgress();
                    storyRecorder.containerView.invalidate();
                    storyRecorder.windowView.invalidate();
                    if (runnable != null) {
                        runnable.run();
                    }
                    StoryRecorder.SourceView sourceView = storyRecorder.fromSourceView;
                    storyRecorder.notificationsLocker.unlock();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    NotificationCenter.getGlobalInstance().runDelayedNotifications();
                    storyRecorder.checkBackgroundVisibility();
                    Runnable runnable2 = storyRecorder.onFullyOpenListener;
                    if (runnable2 != null) {
                        runnable2.run();
                        storyRecorder.onFullyOpenListener = null;
                    }
                    storyRecorder.containerView.invalidate();
                    storyRecorder.previewContainer.invalidate();
                    break;
            }
        }
    }

    public StarReactionsOverlay(ChatActivity chatActivity) {
        super(chatActivity.getContext());
        this.pos = new int[2];
        this.pos2 = new int[2];
        this.reactionBounds = new RectF();
        this.clickBounds = new RectF();
        this.shadowPaint = new Paint();
        new Paint();
        this.counterAlpha = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.counter = animatedTextDrawable;
        new GradientClip();
        this.effects = new ArrayList();
        this.effectAssets = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.chatActivity = chatActivity;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setHacks(false, true, true);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(40.0f));
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.5f), 0);
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setGravity(17);
        this.hideCounterRunnable = new StarReactionsOverlay$$ExternalSyntheticLambda2(this, 0);
        this.longPressRunnable = new LivePlayer$$ExternalSyntheticLambda17(10, this, chatActivity);
    }

    private MessageObject getMessageObject() {
        BaseCell baseCell = this.cell;
        if (baseCell instanceof ChatMessageCell) {
            return ((ChatMessageCell) baseCell).getPrimaryMessageObject();
        }
        if (baseCell instanceof ChatActionCell) {
            return ((ChatActionCell) baseCell).getMessageObject();
        }
        return null;
    }

    public final void checkBalance() {
        long pendingPaidReactions;
        String forcedFirstName;
        TLRPC.Message message;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            ChatActivity chatActivity = this.chatActivity;
            StarsController starsController = StarsController.getInstance(chatActivity.getCurrentAccount(), false);
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                pendingPaidReactions = 0;
            } else {
                pendingPaidReactions = ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) ? starsController.getPendingPaidReactions(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId()) : starsController.getPendingPaidReactions(messageObject.getId(), messageObject.getDialogId());
            }
            if (!starsController.balanceLoaded || starsController.getBalance(null, false, false).amount >= pendingPaidReactions) {
                return;
            }
            StarsController.PendingPaidReactions pendingPaidReactions2 = StarsController.getInstance(chatActivity.getCurrentAccount(), false).currentPendingReactions;
            if (pendingPaidReactions2 != null) {
                pendingPaidReactions2.cancel();
            }
            long dialogId = chatActivity.getDialogId();
            if (dialogId >= 0) {
                forcedFirstName = UserObject.getForcedFirstName(chatActivity.getMessagesController().getUser(Long.valueOf(dialogId)));
            } else {
                TLRPC.Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                forcedFirstName = chat == null ? "" : chat.title;
            }
            new StarsIntroActivity.StarsNeededSheet(chatActivity.getContext(), chatActivity.getResourceProvider(), pendingPaidReactions, 5, forcedFirstName, new StarGiftSheet$$ExternalSyntheticLambda139(this, starsController, messageObject, pendingPaidReactions, 26), 0L).show();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        char c;
        char c2;
        Integer numValueOf;
        float f3;
        float fDp;
        BaseCell baseCell = this.cell;
        if (baseCell instanceof ChatMessageCell) {
            if (!((ChatMessageCell) baseCell).isCellAttachedToWindow()) {
                return;
            }
        } else if ((baseCell instanceof ChatActionCell) && !((ChatActionCell) baseCell).isCellAttachedToWindow()) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.messageId) {
            setMessageCell(null);
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float fLerp = AndroidUtilities.lerp(1.0f, 1.8f, this.focus);
        ChatActivity chatActivity = this.chatActivity;
        float clipTop = chatActivity.getClipTop();
        float clipBottom = chatActivity.getClipBottom();
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.focus) * clipTop, getWidth(), BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.focus, clipBottom, getHeight()));
        int[] iArr = this.pos2;
        getLocationInWindow(iArr);
        BaseCell baseCell2 = this.cell;
        int[] iArr2 = this.pos;
        baseCell2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) chatActivity.drawingChatListViewYoffset);
        canvas.save();
        ReactionsLayoutInBubble.ReactionButton reactionButton = reactionsLayoutInBubble.getReactionButton("stars");
        RectF rectF = this.reactionBounds;
        if (reactionButton != null) {
            int i = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.x + reactionButton.x;
            int i2 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.y + reactionButton.y;
            f = 12.0f;
            float f4 = i;
            f2 = 2.0f;
            float f5 = i2;
            c = 1;
            rectF.set(f4, f5, i + reactionButton.width, i2 + reactionButton.height);
            AndroidUtilities.scaleRect(rectF, fLerp, (reactionButton.width * 0.1f) + f4, (reactionButton.height / 2.0f) + f5);
            Paint paint = this.shadowPaint;
            paint.setColor(0);
            c2 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(this.focus, 1426063360));
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
            canvas.scale(fLerp, fLerp, (reactionButton.width * 0.1f) + f4, (reactionButton.height / 2.0f) + f5);
            numValueOf = Integer.valueOf(reactionButton.reaction.hashCode());
        } else {
            f = 12.0f;
            f2 = 2.0f;
            c = 1;
            c2 = 0;
            numValueOf = null;
        }
        canvas.translate(iArr2[c2] - iArr[c2], this.cell.getPaddingTop() + (iArr2[c] - iArr[c]));
        BaseCell baseCell3 = this.cell;
        if (baseCell3 instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) baseCell3;
            chatMessageCell.setScrimReaction(null);
            chatMessageCell.drawReactionsLayout(canvas, 1.0f, numValueOf);
            chatMessageCell.drawReactionsLayoutOverlay(canvas, 1.0f);
            chatMessageCell.setScrimReaction(numValueOf);
        } else if (baseCell3 instanceof ChatActionCell) {
            ChatActionCell chatActionCell = (ChatActionCell) baseCell3;
            chatActionCell.setScrimReaction(null);
            chatActionCell.drawReactionsLayout(canvas, true, numValueOf);
            chatActionCell.drawReactionsLayoutOverlay(canvas, true);
            chatActionCell.setScrimReaction(numValueOf);
        }
        canvas.restore();
        canvas.restore();
        if (reactionButton != null) {
            RectF rectF2 = this.clickBounds;
            rectF2.set(rectF);
            rectF2.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
            int iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.effects;
                if (i3 >= arrayList.size()) {
                    break;
                }
                RLottieDrawable rLottieDrawable = (RLottieDrawable) arrayList.get(i3);
                if (rLottieDrawable.getCurrentFrame() >= rLottieDrawable.getFramesCount()) {
                    arrayList.remove(i3);
                    i3--;
                } else {
                    float f6 = iDp / f2;
                    rLottieDrawable.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f6), (int) (rectF.centerY() - f6), (int) OKLCH.m(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f6), (int) (rectF.centerY() + f6));
                    rLottieDrawable.setAlpha((int) (this.focus * 255.0f));
                    rLottieDrawable.draw(canvas);
                }
                i3++;
            }
            float fCenterX = rectF.centerX();
            float fDp2 = rectF.top - AndroidUtilities.dp(36.0f);
            canvas.save();
            float f7 = this.counterAlpha.set(this.counterShown);
            if (this.counterShown) {
                fDp = AndroidUtilities.dp(60.0f);
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
                fDp = -AndroidUtilities.dp(30.0f);
            }
            canvas.translate(0.0f, (f3 - f7) * fDp);
            float fLerp2 = AndroidUtilities.lerp(this.counterShown ? 1.8f : 1.3f, f3, f7);
            canvas.scale(fLerp2, fLerp2, fCenterX, fDp2);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
            animatedTextDrawable.setAlpha((int) (255.0f * f7));
            animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(f), 0.0f, AndroidUtilities.dp(3.5f), Theme.multAlpha(f7, -1442840576));
            animatedTextDrawable.setBounds(fCenterX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), fCenterX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
            animatedTextDrawable.draw(canvas);
            canvas.restore();
        }
        if (!this.counterShown) {
            checkBalance();
        }
        invalidate();
    }

    public final void focusTo(float f, StarReactionsOverlay$$ExternalSyntheticLambda2 starReactionsOverlay$$ExternalSyntheticLambda2) {
        int i = 0;
        ValueAnimator valueAnimator = this.focusAnimator;
        if (valueAnimator != null) {
            this.focusAnimator = null;
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.focus, f);
        this.focusAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 28));
        this.focusAnimator.addListener(new AnonymousClass1(this, f, starReactionsOverlay$$ExternalSyntheticLambda2, i));
        this.focusAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.focusAnimator.setDuration(320L);
        this.focusAnimator.start();
    }

    public ReactionsLayoutInBubble getReactionsLayoutInBubble() {
        BaseCell baseCell = this.cell;
        if (baseCell instanceof ChatMessageCell) {
            return ((ChatMessageCell) baseCell).reactionsLayoutInBubble;
        }
        if (baseCell instanceof ChatActionCell) {
            return ((ChatActionCell) baseCell).reactionsLayoutInBubble;
        }
        return null;
    }

    public final void hide() {
        this.hidden = true;
        AndroidUtilities.cancelRunOnUIThread(this.hideCounterRunnable);
        this.counter.setText("");
        this.counterShown = false;
        invalidate();
        focusTo(0.0f, new StarReactionsOverlay$$ExternalSyntheticLambda2(this, 2));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        if (this.cell == null || this.hidden || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        LivePlayer$$ExternalSyntheticLambda17 livePlayer$$ExternalSyntheticLambda17 = this.longPressRunnable;
        if (action == 0) {
            if (this.clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.pressed = true;
                ReactionsLayoutInBubble.ReactionButton reactionButton = reactionsLayoutInBubble.getReactionButton("stars");
                if (reactionButton != null) {
                    reactionButton.bounce.setPressed(true);
                }
                AndroidUtilities.cancelRunOnUIThread(livePlayer$$ExternalSyntheticLambda17);
                AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda17, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ReactionsLayoutInBubble.ReactionButton reactionButton2 = reactionsLayoutInBubble.getReactionButton("stars");
            if (motionEvent.getAction() == 1) {
                tap(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (reactionButton2 != null) {
                reactionButton2.bounce.setPressed(false);
            }
            this.pressed = false;
            AndroidUtilities.cancelRunOnUIThread(livePlayer$$ExternalSyntheticLambda17);
        }
        return this.pressed;
    }

    public void setMessageCell(BaseCell baseCell) {
        BaseCell baseCell2 = this.cell;
        if (baseCell2 == baseCell) {
            return;
        }
        if (baseCell2 instanceof ChatMessageCell) {
            ((ChatMessageCell) baseCell2).setScrimReaction(null);
            ((ChatMessageCell) this.cell).setInvalidateListener(null);
            this.cell.invalidate();
        } else if (baseCell2 instanceof ChatActionCell) {
            ((ChatActionCell) baseCell2).setScrimReaction(null);
            ((ChatActionCell) this.cell).setInvalidateListener(null);
            this.cell.invalidate();
        }
        this.cell = baseCell;
        this.messageId = getMessageObject() == null ? 0 : getMessageObject().getId();
        BaseCell baseCell3 = this.cell;
        if (baseCell3 instanceof ChatMessageCell) {
            baseCell3.invalidate();
            ((ChatMessageCell) this.cell).setInvalidateListener(new StarReactionsOverlay$$ExternalSyntheticLambda2(this, 1));
        } else if (baseCell3 instanceof ChatActionCell) {
            baseCell3.invalidate();
            ((ChatActionCell) this.cell).setInvalidateListener(new StarReactionsOverlay$$ExternalSyntheticLambda2(this, 1));
        }
        invalidate();
    }

    public final void tap(float f, float f2, boolean z) {
        ArrayList arrayList;
        long pendingPaidReactions;
        if (this.cell == null || this.hidden) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        ReactionsLayoutInBubble reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        ChatActivity chatActivity = this.chatActivity;
        StarsController starsController = StarsController.getInstance(chatActivity.getCurrentAccount(), false);
        while (true) {
            arrayList = this.effects;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((RLottieDrawable) arrayList.remove(0)).recycle(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.effectAssets;
        int i = iArr[random.nextInt(iArr.length)];
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        rLottieDrawable.setMasterParent(this);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.setAutoRepeat(0);
        rLottieDrawable.start();
        arrayList.add(rLottieDrawable);
        invalidate();
        ReactionsLayoutInBubble.ReactionButton reactionButton = reactionsLayoutInBubble.getReactionButton("stars");
        if (reactionButton != null) {
            reactionButton.startAnimation();
        }
        if (z) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            StarsController.getInstance(chatActivity.getCurrentAccount(), false).sendPaidReaction(messageObject, this.chatActivity, 1L, true, false, null);
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
        animatedTextDrawable.cancelAnimation();
        StringBuilder sb = new StringBuilder("+");
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            pendingPaidReactions = 0;
        } else if ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) {
            pendingPaidReactions = starsController.getPendingPaidReactions(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId());
        } else {
            pendingPaidReactions = starsController.getPendingPaidReactions(messageObject.getId(), messageObject.getDialogId());
        }
        sb.append(pendingPaidReactions);
        animatedTextDrawable.setText(sb.toString());
        this.counterShown = true;
        StarReactionsOverlay$$ExternalSyntheticLambda2 starReactionsOverlay$$ExternalSyntheticLambda2 = this.hideCounterRunnable;
        AndroidUtilities.cancelRunOnUIThread(starReactionsOverlay$$ExternalSyntheticLambda2);
        AndroidUtilities.runOnUIThread(starReactionsOverlay$$ExternalSyntheticLambda2, 1500L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastRippleTime;
        if (j < 100) {
            this.accumulatedRippleIntensity += 0.5f;
            return;
        }
        this.accumulatedRippleIntensity = Utilities.clamp(1.0f - ((j - 100) / 200.0f), 1.0f, 0.0f) * this.accumulatedRippleIntensity;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.pos2;
        if (measuredWidth != 0 || chatActivity.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            chatActivity.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.makeRipple(iArr2[0] + f, iArr2[1] + f2, Utilities.clamp(this.accumulatedRippleIntensity, 0.9f, 0.3f));
        this.accumulatedRippleIntensity = 0.0f;
        this.lastRippleTime = jCurrentTimeMillis;
    }
}
