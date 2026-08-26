package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class BottomSheet$ContainerView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final BottomSheet.ContainerView f$0;

    public BottomSheet$ContainerView$$ExternalSyntheticLambda0(BottomSheet.ContainerView containerView, int i) {
        this.$r8$classId = i;
        this.f$0 = containerView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                BottomSheet.ContainerView containerView = this.f$0;
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bottomSheet.onContainerViewTranslation();
                bottomSheet.onSmoothContainerViewLayout(bottomSheet.containerView.getTranslationY());
                containerView.invalidate();
                break;
            case 1:
                BottomSheet.ContainerView containerView2 = this.f$0;
                containerView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                containerView2.swipeBackX = fFloatValue;
                BottomSheet bottomSheet2 = BottomSheet.this;
                bottomSheet2.containerView.setTranslationX(fFloatValue);
                bottomSheet2.container.invalidate();
                break;
            case 2:
                BottomSheet.ContainerView containerView3 = this.f$0;
                containerView3.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                containerView3.swipeBackX = fFloatValue2;
                BottomSheet bottomSheet3 = BottomSheet.this;
                bottomSheet3.containerView.setTranslationX(fFloatValue2);
                bottomSheet3.container.invalidate();
                break;
            case 3:
                BottomSheet.ContainerView containerView4 = this.f$0;
                containerView4.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BottomSheet bottomSheet4 = BottomSheet.this;
                BottomSheet.SheetBackDrawable sheetBackDrawable = bottomSheet4.backDrawable;
                sheetBackDrawable.bgPaint.setAlpha(bottomSheet4.dimBehind ? (int) (bottomSheet4.dimBehindAlpha * fFloatValue3) : 0);
                sheetBackDrawable.invalidateSelf();
                break;
            default:
                BottomSheet bottomSheet5 = BottomSheet.this;
                BottomSheet.ContainerView containerView5 = bottomSheet5.container;
                if (containerView5 != null) {
                    containerView5.invalidate();
                }
                bottomSheet5.onContainerViewTranslation();
                break;
        }
    }
}
