package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class VoIpGradientLayout$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final VoIpGradientLayout f$0;

    public VoIpGradientLayout$$ExternalSyntheticLambda0(VoIpGradientLayout voIpGradientLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = voIpGradientLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoIpGradientLayout voIpGradientLayout = this.f$0;
                voIpGradientLayout.getClass();
                voIpGradientLayout.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpGradientLayout.invalidate();
                voIpGradientLayout.backgroundProvider.invalidateViews();
                break;
            case 1:
                VoIpGradientLayout voIpGradientLayout2 = this.f$0;
                voIpGradientLayout2.getClass();
                voIpGradientLayout2.clipRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIpGradientLayout2.invalidate();
                voIpGradientLayout2.backgroundProvider.invalidateViews();
                break;
            case 2:
                VoIpGradientLayout voIpGradientLayout3 = this.f$0;
                voIpGradientLayout3.getClass();
                voIpGradientLayout3.alphaOrangeRed = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpGradientLayout3.invalidate();
                voIpGradientLayout3.backgroundProvider.invalidateViews();
                break;
            case 3:
                VoIpGradientLayout voIpGradientLayout4 = this.f$0;
                voIpGradientLayout4.getClass();
                voIpGradientLayout4.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpGradientLayout4.invalidate();
                break;
            case 4:
                VoIpGradientLayout voIpGradientLayout5 = this.f$0;
                voIpGradientLayout5.getClass();
                voIpGradientLayout5.alphaBlueGreen = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpGradientLayout5.invalidate();
                break;
            default:
                VoIpGradientLayout voIpGradientLayout6 = this.f$0;
                voIpGradientLayout6.getClass();
                voIpGradientLayout6.alphaBlueViolet = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpGradientLayout6.invalidate();
                break;
        }
    }
}
