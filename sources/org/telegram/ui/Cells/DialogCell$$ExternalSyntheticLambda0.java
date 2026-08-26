package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

public final class DialogCell$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final DialogCell f$0;

    public DialogCell$$ExternalSyntheticLambda0(DialogCell dialogCell, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogCell;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createStatusDrawableAnimator$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$update$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$update$1(valueAnimator);
                break;
        }
    }
}
