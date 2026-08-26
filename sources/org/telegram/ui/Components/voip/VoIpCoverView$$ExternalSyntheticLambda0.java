package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class VoIpCoverView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final VoIpCoverView f$0;

    public VoIpCoverView$$ExternalSyntheticLambda0(VoIpCoverView voIpCoverView, int i) {
        this.$r8$classId = i;
        this.f$0 = voIpCoverView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoIpCoverView voIpCoverView = this.f$0;
                voIpCoverView.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voIpCoverView.diffX1 = iIntValue;
                voIpCoverView.diffX2 = iIntValue;
                voIpCoverView.diffX3 = iIntValue;
                voIpCoverView.diffX4 = iIntValue;
                voIpCoverView.diffX5 = iIntValue;
                voIpCoverView.invalidate();
                break;
            default:
                VoIpCoverView voIpCoverView2 = this.f$0;
                voIpCoverView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voIpCoverView2.diffX1 = AndroidUtilities.lerp(voIpCoverView2.connectedDiffX, AndroidUtilities.dp(56.0f), fFloatValue);
                voIpCoverView2.diffX2 = AndroidUtilities.lerp(voIpCoverView2.connectedDiffX, AndroidUtilities.dp(36.0f), fFloatValue);
                voIpCoverView2.diffX3 = AndroidUtilities.lerp(voIpCoverView2.connectedDiffX, AndroidUtilities.dp(60.0f), fFloatValue);
                voIpCoverView2.diffX4 = AndroidUtilities.lerp(voIpCoverView2.connectedDiffX, AndroidUtilities.dp(36.0f), fFloatValue);
                voIpCoverView2.diffX5 = AndroidUtilities.lerp(voIpCoverView2.connectedDiffX, AndroidUtilities.dp(64.0f), fFloatValue);
                voIpCoverView2.diffY1 = AndroidUtilities.lerp(0, AndroidUtilities.dp(50.0f), fFloatValue);
                voIpCoverView2.diffY2 = AndroidUtilities.lerp(0, AndroidUtilities.dp(20.0f), fFloatValue);
                voIpCoverView2.diffY3 = AndroidUtilities.lerp(0, 0, fFloatValue);
                voIpCoverView2.diffY4 = AndroidUtilities.lerp(0, AndroidUtilities.dp(-20.0f), fFloatValue);
                voIpCoverView2.diffY5 = AndroidUtilities.lerp(0, AndroidUtilities.dp(-40.0f), fFloatValue);
                voIpCoverView2.invalidate();
                break;
        }
    }
}
