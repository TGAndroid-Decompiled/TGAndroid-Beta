package org.telegram.ui;

import android.animation.ValueAnimator;

public final class DialogsActivity$$ExternalSyntheticLambda76 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;
    public final float f$1;

    public DialogsActivity$$ExternalSyntheticLambda76(DialogsActivity dialogsActivity, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
        this.f$1 = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hideActionMode$104(this.f$1, valueAnimator);
                break;
            default:
                this.f$0.lambda$showOrUpdateActionMode$116(this.f$1, valueAnimator);
                break;
        }
    }
}
