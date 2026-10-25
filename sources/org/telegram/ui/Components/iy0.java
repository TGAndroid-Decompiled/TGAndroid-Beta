package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class iy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29402a;
    public final Object f29403b;
    public final Object f29404c;

    public iy0(int i10, Object obj, Object obj2) {
        this.f29402a = i10;
        this.f29404c = obj;
        this.f29403b = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29402a) {
            case 0:
                jy0 jy0Var = (jy0) this.f29404c;
                jy0Var.f29735b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jy0Var.invalidate();
                ((pn0) this.f29403b).invalidate();
                return;
            case 1:
                ((u91) this.f29404c).F((View) this.f29403b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4.c cVar = (w4.c) this.f29404c;
                w4.b bVar = (w4.b) this.f29403b;
                w4.c.b(floatValue, bVar);
                cVar.a(floatValue, bVar, false);
                cVar.invalidateSelf();
                return;
        }
    }
}
