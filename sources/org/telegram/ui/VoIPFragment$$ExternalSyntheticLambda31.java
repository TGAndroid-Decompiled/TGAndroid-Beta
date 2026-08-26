package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.voip.GroupCallRenderersContainer;

public final class VoIPFragment$$ExternalSyntheticLambda31 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;
    public final float f$3;

    public VoIPFragment$$ExternalSyntheticLambda31(Object obj, float f, float f2, float f3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPFragment) this.f$0).lambda$finishZoom$17(this.f$1, this.f$2, this.f$3, valueAnimator);
                break;
            case 1:
                ((GLIconTextureView) this.f$0).lambda$startBackAnimation$0(this.f$1, this.f$2, this.f$3, valueAnimator);
                break;
            default:
                ((GroupCallRenderersContainer) this.f$0).lambda$finishZoom$8(this.f$1, this.f$2, this.f$3, valueAnimator);
                break;
        }
    }
}
