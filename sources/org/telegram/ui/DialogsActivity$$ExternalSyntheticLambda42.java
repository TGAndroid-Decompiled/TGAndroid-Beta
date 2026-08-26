package org.telegram.ui;

import android.animation.ValueAnimator;

public final class DialogsActivity$$ExternalSyntheticLambda42 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda42(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.getClass();
                dialogsActivity.setSlideTransitionProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                DialogsActivity dialogsActivity2 = this.f$0;
                dialogsActivity2.getClass();
                dialogsActivity2.setContactsAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                DialogsActivity dialogsActivity3 = this.f$0;
                dialogsActivity3.getClass();
                dialogsActivity3.setSearchAnimationProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
