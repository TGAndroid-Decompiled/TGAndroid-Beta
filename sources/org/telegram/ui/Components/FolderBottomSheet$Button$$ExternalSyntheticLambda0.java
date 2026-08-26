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
                FolderBottomSheet.Button button = this.f$0;
                button.getClass();
                button.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                button.invalidate();
                break;
            case 1:
                FolderBottomSheet.Button button2 = this.f$0;
                button2.getClass();
                button2.enabledT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                button2.invalidate();
                break;
            default:
                FolderBottomSheet.Button button3 = this.f$0;
                button3.getClass();
                button3.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                button3.invalidate();
                break;
        }
    }
}
