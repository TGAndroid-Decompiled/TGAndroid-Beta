package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class AcceptDeclineView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final AcceptDeclineView f$0;

    public AcceptDeclineView$$ExternalSyntheticLambda0(AcceptDeclineView acceptDeclineView, int i) {
        this.$r8$classId = i;
        this.f$0 = acceptDeclineView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                AcceptDeclineView acceptDeclineView = this.f$0;
                acceptDeclineView.getClass();
                acceptDeclineView.leftOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                acceptDeclineView.invalidate();
                acceptDeclineView.leftAnimator = null;
                break;
            case 1:
                AcceptDeclineView acceptDeclineView2 = this.f$0;
                acceptDeclineView2.getClass();
                acceptDeclineView2.rigthOffsetX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                acceptDeclineView2.invalidate();
                acceptDeclineView2.rightAnimator = null;
                break;
            default:
                AcceptDeclineView acceptDeclineView3 = this.f$0;
                acceptDeclineView3.getClass();
                acceptDeclineView3.avatarWavesDrawable.setAmplitude(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
