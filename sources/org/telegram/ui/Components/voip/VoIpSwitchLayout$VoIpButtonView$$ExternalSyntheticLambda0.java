package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final VoIpSwitchLayout.VoIpButtonView f$0;

    public VoIpSwitchLayout$VoIpButtonView$$ExternalSyntheticLambda0(VoIpSwitchLayout.VoIpButtonView voIpButtonView, int i) {
        this.$r8$classId = i;
        this.f$0 = voIpButtonView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoIpSwitchLayout.VoIpButtonView voIpButtonView = this.f$0;
                voIpButtonView.getClass();
                voIpButtonView.pressedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIpButtonView.invalidate();
                break;
            case 1:
                VoIpSwitchLayout.VoIpButtonView voIpButtonView2 = this.f$0;
                voIpButtonView2.getClass();
                voIpButtonView2.singleIconBackgroundAlphaPercent = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpButtonView2.invalidate();
                break;
            case 2:
                VoIpSwitchLayout.VoIpButtonView voIpButtonView3 = this.f$0;
                voIpButtonView3.getClass();
                voIpButtonView3.selectedRadius = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpButtonView3.invalidate();
                break;
            default:
                VoIpSwitchLayout.VoIpButtonView voIpButtonView4 = this.f$0;
                voIpButtonView4.getClass();
                voIpButtonView4.unselectedRadius = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpButtonView4.invalidate();
                break;
        }
    }
}
