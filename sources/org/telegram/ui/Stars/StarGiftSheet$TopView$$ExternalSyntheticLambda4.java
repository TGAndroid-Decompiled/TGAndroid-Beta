package org.telegram.ui.Stars;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public final class StarGiftSheet$TopView$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StarGiftSheet.TopView f$0;

    public StarGiftSheet$TopView$$ExternalSyntheticLambda4(StarGiftSheet.TopView topView, int i) {
        this.$r8$classId = i;
        this.f$0 = topView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet.TopView topView = this.f$0;
                topView.getClass();
                topView.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                topView.onSwitchPage(topView.currentPage);
                break;
            case 1:
                StarGiftSheet.TopView topView2 = this.f$0;
                topView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fM = SurfaceContainer$$ExternalSyntheticOutline0.m((float) Math.pow((fFloatValue * 2.0f) - 2.0f, 2.0d), 0.075f, fFloatValue, 1.0f);
                topView2.switchScale = fM;
                FrameLayout frameLayout = topView2.imageLayout;
                frameLayout.setScaleX(fM);
                frameLayout.setScaleY(topView2.switchScale);
                topView2.invalidate();
                break;
            default:
                StarGiftSheet.TopView topView3 = this.f$0;
                topView3.getClass();
                topView3.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                topView3.onSwitchPage(topView3.currentPage);
                break;
        }
    }
}
