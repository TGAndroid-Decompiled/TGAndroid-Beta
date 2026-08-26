package org.telegram.ui;

import android.animation.ValueAnimator;

public final class DialogsActivity$$ExternalSyntheticLambda69 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda69(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getCustomSlideTransition$145(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$showSearch$90(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateContactsAlpha$127(valueAnimator);
                break;
        }
    }
}
