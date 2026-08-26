package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class FolderBottomSheet$Button$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FolderBottomSheet.Button f$0;

    public FolderBottomSheet$Button$$ExternalSyntheticLambda0(FolderBottomSheet.Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = button;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setLoading$0(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$setEnabled$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateCount$1(valueAnimator);
                break;
        }
    }
}
