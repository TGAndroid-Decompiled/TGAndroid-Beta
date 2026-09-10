package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fy implements ValueAnimator.AnimatorUpdateListener {
    public int f32930a;
    public final float f32931b;
    public final float f32932c;
    public final wy d;

    public fy(wy wyVar, float f7, boolean z10, float f10) {
        this.d = wyVar;
        this.f32931b = f7;
        this.f32932c = f10;
        this.f32930a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f32931b, this.f32932c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f32930a;
        this.f32930a = lerp;
        wy wyVar = this.d;
        wyVar.f38431e0[0].f37645a.scrollBy(0, i10);
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
