package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
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
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog;
import org.telegram.ui.GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda126;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
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
    public final StickersActivity$$ExternalSyntheticLambda18 longPressRunnable;
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
                    GroupCallActivity$CallEncryptionCell$EncryptionCallDialog groupCallActivity$CallEncryptionCell$EncryptionCallDialog = (GroupCallActivity$CallEncryptionCell$EncryptionCallDialog) obj;
                    groupCallActivity$CallEncryptionCell$EncryptionCallDialog.progress = f;
                    groupCallActivity$CallEncryptionCell$EncryptionCallDialog.windowView.invalidate();
                    GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2 groupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2 = (GroupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2) runnable;
                    if (groupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2 != null) {
                        groupCallActivity$CallEncryptionCell$EncryptionCallDialog$$ExternalSyntheticLambda2.run();
                    }
                    break;
                case 2:
                    PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = (PaidReactionButton.PaidReactionButtonEffectsView) obj;
                    paidReactionButtonEffectsView.focus = f;
                    paidReactionButtonEffectsView.invalidate();
                    if (animator == paidReactionButtonEffectsView.focusAnimator && (paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 = (PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0) runnable) != null) {
                        paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0.run();
                        break;
                    }
                    break;
                case 3:
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
        super(chatActivity.getParentActivity());
        this.pos = new int[2];
        this.pos2 = new int[2];
        this.reactionBounds = new RectF();
        this.clickBounds = new RectF();
        this.shadowPaint = new Paint();
        new Paint();
        this.counterAlpha = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.counter = animatedTextDrawable;
        new Matrix();
        this.effects = new ArrayList();
        this.effectAssets = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.chatActivity = chatActivity;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setHacks(false, true);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(40.0f));
        Typeface typeface = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typeface);
        animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.gravity = 17;
        this.hideCounterRunnable = new StarReactionsOverlay$$ExternalSyntheticLambda2(this, 0);
        this.longPressRunnable = new StickersActivity$$ExternalSyntheticLambda18(8, this, chatActivity);
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
            if (!starsController.balanceLoaded || starsController.getBalance(false, false, null).amount >= pendingPaidReactions) {
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
            new StarsIntroActivity.StarsNeededSheet(chatActivity.getParentActivity(), chatActivity.getResourceProvider(), pendingPaidReactions, 5, forcedFirstName, new PhotoViewer$$ExternalSyntheticLambda126(this, starsController, messageObject, pendingPaidReactions, 5), 0L).show();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        char c;
        char c2;
        Integer numValueOf;
        RectF rectF;
        float f2;
        int iDp;
        int i;
        ArrayList arrayList;
        float f3;
        float fDp;
        float f4;
        RLottieDrawable rLottieDrawable;
        BaseCell baseCell = this.cell;
        if (baseCell instanceof ChatMessageCell) {
            if (!((ChatMessageCell) baseCell).attachedToWindow) {
                return;
            }
        } else if ((baseCell instanceof ChatActionCell) && !((ChatActionCell) baseCell).attachedToWindow) {
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
        float y = chatActivity.chatListView.getY() + (((chatActivity.fragmentTransition == null || (chatActivity.fromPullingDownTransition && !chatActivity.toPullingDownTransition)) && !chatActivity.isInsideContainer) ? (chatActivity.chatListViewPaddingTop - chatActivity.chatListViewPaddingVisibleOffset) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (chatActivity.fragmentView.getBottom() - chatActivity.chatListView.getBottom()) + (((chatActivity.fragmentTransition == null || (chatActivity.fromPullingDownTransition && !chatActivity.toPullingDownTransition)) && !chatActivity.isInsideContainer) ? chatActivity.blurredViewBottomOffset : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.focus) * y, getWidth(), BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.focus, bottom, getHeight()));
        int[] iArr = this.pos2;
        getLocationInWindow(iArr);
        BaseCell baseCell2 = this.cell;
        int[] iArr2 = this.pos;
        baseCell2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) chatActivity.drawingChatListViewYoffset);
        canvas.save();
        ReactionsLayoutInBubble.ReactionButton reactionButton = reactionsLayoutInBubble.getReactionButton("stars");
        RectF rectF2 = this.reactionBounds;
        if (reactionButton != null) {
            f = 4.0f;
            int i2 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.x + reactionButton.x;
            int i3 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.y + reactionButton.y;
            float f5 = i2;
            float f6 = i3;
            c = 1;
            rectF2.set(f5, f6, i2 + reactionButton.width, i3 + reactionButton.height);
            AndroidUtilities.scaleRect(rectF2, fLerp, (reactionButton.width * 0.1f) + f5, (reactionButton.height / 2.0f) + f6);
            Paint paint = this.shadowPaint;
            paint.setColor(0);
            c2 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(this.focus, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(fLerp, fLerp, (reactionButton.width * 0.1f) + f5, (reactionButton.height / 2.0f) + f6);
            numValueOf = Integer.valueOf(reactionButton.reaction.hashCode());
        } else {
            f = 4.0f;
            c = 1;
            c2 = 0;
            numValueOf = null;
        }
        canvas.translate(iArr2[c2] - iArr[c2], this.cell.getPaddingTop() + (iArr2[c] - iArr[c]));
        BaseCell baseCell3 = this.cell;
        if (!(baseCell3 instanceof ChatMessageCell)) {
            if (baseCell3 instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) baseCell3;
                chatActionCell.setScrimReaction(null);
                chatActionCell.drawReactionsLayout(canvas, true, numValueOf);
                float alpha = chatActionCell.getAlpha();
                Theme.ResourcesProvider resourcesProvider = chatActionCell.themeDelegate;
                if (resourcesProvider != null) {
                    resourcesProvider.applyServiceShaderMatrix(chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(f), chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight);
                } else {
                    Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, chatActionCell.getMeasuredWidth(), chatActionCell.backgroundHeight, chatActionCell.viewTranslationX, chatActionCell.viewTop + AndroidUtilities.dp(f));
                }
                MessageObject messageObject2 = chatActionCell.currentMessageObject;
                if (messageObject2 == null || !messageObject2.shouldDrawReactions()) {
                    rectF = rectF2;
                    f2 = 255.0f;
                } else {
                    ReactionsLayoutInBubble reactionsLayoutInBubble2 = chatActionCell.reactionsLayoutInBubble;
                    boolean z = reactionsLayoutInBubble2.isSmall;
                    ChatActionCell.TransitionParams transitionParams = chatActionCell.transitionParams;
                    if (!z || (transitionParams.animateChange && reactionsLayoutInBubble2.animateHeight)) {
                        reactionsLayoutInBubble2.drawServiceShaderBackground = 1.0f;
                        if (alpha < 1.0f) {
                            rectF = rectF2;
                            f2 = 255.0f;
                            canvas.saveLayerAlpha(0.0f, 0.0f, chatActionCell.getWidth(), chatActionCell.getHeight(), (int) (alpha * 255.0f), 31);
                        } else {
                            rectF = rectF2;
                            f2 = 255.0f;
                        }
                        reactionsLayoutInBubble2.drawOverlay(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
                        if (alpha < 1.0f) {
                            canvas.restore();
                        }
                    } else {
                        rectF = rectF2;
                        f2 = 255.0f;
                    }
                }
                chatActionCell.setScrimReaction(numValueOf);
            }
            canvas.restore();
            canvas.restore();
            if (reactionButton != null) {
                RectF rectF3 = this.clickBounds;
                rectF3.set(rectF);
                rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
                i = 0;
                while (true) {
                    arrayList = this.effects;
                    if (i < arrayList.size()) {
                        break;
                    }
                    rLottieDrawable = (RLottieDrawable) arrayList.get(i);
                    if (rLottieDrawable.currentFrame >= rLottieDrawable.metaData[c2]) {
                        arrayList.remove(i);
                        i--;
                    } else {
                        float f7 = iDp / 2.0f;
                        rLottieDrawable.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f7), (int) (rectF.centerY() - f7), (int) OKLCH.m(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f7), (int) (rectF.centerY() + f7));
                        rLottieDrawable.setAlpha((int) (this.focus * f2));
                        rLottieDrawable.draw(canvas);
                    }
                    i++;
                }
                float fCenterX = rectF.centerX();
                float fDp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float f8 = this.counterAlpha.set(this.counterShown);
                if (this.counterShown) {
                    fDp = AndroidUtilities.dp(60.0f);
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                    fDp = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f3 - f8) * fDp);
                if (this.counterShown) {
                    f4 = 1.8f;
                } else {
                    f4 = 1.3f;
                }
                float fLerp2 = AndroidUtilities.lerp(f4, f3, f8);
                canvas.scale(fLerp2, fLerp2, fCenterX, fDp2);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
                animatedTextDrawable.alpha = (int) (f8 * f2);
                animatedTextDrawable.setShadowLayer(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), Theme.multAlpha(f8, -1442840576));
                animatedTextDrawable.setBounds(fCenterX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), fCenterX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            }
            if (!this.counterShown) {
                checkBalance();
            }
            invalidate();
        }
        ChatMessageCell chatMessageCell = (ChatMessageCell) baseCell3;
        chatMessageCell.setScrimReaction(null);
        chatMessageCell.drawReactionsLayout(canvas, 1.0f, numValueOf);
        chatMessageCell.drawReactionsLayoutOverlay(canvas);
        chatMessageCell.setScrimReaction(numValueOf);
        rectF = rectF2;
        f2 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (reactionButton != null) {
            RectF rectF4 = this.clickBounds;
            rectF4.set(rectF);
            rectF4.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
            iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
            i = 0;
            while (true) {
                arrayList = this.effects;
                if (i < arrayList.size()) {
                    break;
                    break;
                }
                rLottieDrawable = (RLottieDrawable) arrayList.get(i);
                if (rLottieDrawable.currentFrame >= rLottieDrawable.metaData[c2]) {
                    arrayList.remove(i);
                    i--;
                } else {
                    float f9 = iDp / 2.0f;
                    rLottieDrawable.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f9), (int) (rectF.centerY() - f9), (int) OKLCH.m(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f9), (int) (rectF.centerY() + f9));
                    rLottieDrawable.setAlpha((int) (this.focus * f2));
                    rLottieDrawable.draw(canvas);
                }
                i++;
            }
            float fCenterX2 = rectF.centerX();
            float fDp3 = rectF.top - AndroidUtilities.dp(36.0f);
            canvas.save();
            float f10 = this.counterAlpha.set(this.counterShown);
            if (this.counterShown) {
                fDp = AndroidUtilities.dp(60.0f);
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
                fDp = -AndroidUtilities.dp(30.0f);
            }
            canvas.translate(0.0f, (f3 - f10) * fDp);
            if (this.counterShown) {
                f4 = 1.8f;
            } else {
                f4 = 1.3f;
            }
            float fLerp3 = AndroidUtilities.lerp(f4, f3, f10);
            canvas.scale(fLerp3, fLerp3, fCenterX2, fDp3);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.counter;
            animatedTextDrawable2.alpha = (int) (f10 * f2);
            animatedTextDrawable2.setShadowLayer(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), Theme.multAlpha(f10, -1442840576));
            animatedTextDrawable2.setBounds(fCenterX2 - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), fCenterX2 + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
            animatedTextDrawable2.draw(canvas);
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
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 15));
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
        this.counter.setText("", true, true);
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
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = this.longPressRunnable;
        if (action == 0) {
            if (this.clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.pressed = true;
                ReactionsLayoutInBubble.ReactionButton reactionButton = reactionsLayoutInBubble.getReactionButton("stars");
                if (reactionButton != null) {
                    reactionButton.bounce.setPressed(true);
                }
                AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
                AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda18, ViewConfiguration.getLongPressTimeout());
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
            AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
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
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), true, null);
        rLottieDrawable.masterParent = this;
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
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
        animatedTextDrawable.setText(sb.toString(), true, true);
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
