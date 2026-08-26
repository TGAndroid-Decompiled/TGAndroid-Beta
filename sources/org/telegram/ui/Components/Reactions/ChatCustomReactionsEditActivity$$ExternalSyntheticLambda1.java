package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;

public final class ChatCustomReactionsEditActivity$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChatCustomReactionsEditActivity f$0;

    public ChatCustomReactionsEditActivity$$ExternalSyntheticLambda1(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatCustomReactionsEditActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
                chatCustomReactionsEditActivity.actionButtonContainer.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * chatCustomReactionsEditActivity.bottomDialogLayout.getMeasuredHeight());
                break;
            default:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                chatCustomReactionsEditActivity2.actionButtonContainer.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * chatCustomReactionsEditActivity2.bottomDialogLayout.getMeasuredHeight());
                break;
        }
    }
}
