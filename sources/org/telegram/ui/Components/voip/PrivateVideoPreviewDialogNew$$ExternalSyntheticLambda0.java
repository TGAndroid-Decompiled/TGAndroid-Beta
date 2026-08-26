package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PrivateVideoPreviewDialogNew f$0;

    public PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew, int i) {
        this.$r8$classId = i;
        this.f$0 = privateVideoPreviewDialogNew;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCurrentPage$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$new$3(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$dismiss$5(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$dismiss$6(valueAnimator);
                break;
            default:
                this.f$0.lambda$dismiss$7(valueAnimator);
                break;
        }
    }
}
