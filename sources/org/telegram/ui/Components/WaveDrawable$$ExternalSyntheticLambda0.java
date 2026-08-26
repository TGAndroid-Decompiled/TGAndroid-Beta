package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class WaveDrawable$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final float f$2;
    public final float f$3;
    public final float f$4;
    public final float f$5;
    public final float f$6;

    public WaveDrawable$$ExternalSyntheticLambda0(Object obj, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
        this.f$4 = f4;
        this.f$5 = f5;
        this.f$6 = f6;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((WaveDrawable) this.f$0).lambda$setValue$1(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, valueAnimator);
                break;
            default:
                ((ChatActivityEnterView) this.f$0).lambda$animateSendButton$77(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, valueAnimator);
                break;
        }
    }
}
