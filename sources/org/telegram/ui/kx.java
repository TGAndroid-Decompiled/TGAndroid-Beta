package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx implements ValueAnimator.AnimatorUpdateListener {
    public int f40928a;
    public final float f40929b;
    public final float f40930c;
    public final ey d;

    public kx(ey eyVar, float f7, boolean z10, float f10) {
        this.d = eyVar;
        this.f40929b = f7;
        this.f40930c = f10;
        this.f40928a = (int) f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((Float) valueAnimator.getAnimatedValue()).getClass();
        int lerp = (int) AndroidUtilities.lerp(this.f40929b, this.f40930c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        int i10 = lerp - this.f40928a;
        this.f40928a = lerp;
        ey eyVar = this.d;
        eyVar.f38998e0[0].f38702a.scrollBy(0, i10);
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
