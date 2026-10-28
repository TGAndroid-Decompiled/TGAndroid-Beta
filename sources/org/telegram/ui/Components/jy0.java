package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29782a;
    public final Object f29783b;
    public final Object f29784c;

    public jy0(int i10, Object obj, Object obj2) {
        this.f29782a = i10;
        this.f29784c = obj;
        this.f29783b = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29782a) {
            case 0:
                ky0 ky0Var = (ky0) this.f29784c;
                ky0Var.f30052b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.invalidate();
                ((qn0) this.f29783b).invalidate();
                return;
            case 1:
                ((v91) this.f29784c).F((View) this.f29783b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4.c cVar = (w4.c) this.f29784c;
                w4.b bVar = (w4.b) this.f29783b;
                w4.c.b(floatValue, bVar);
                cVar.a(floatValue, bVar, false);
                cVar.invalidateSelf();
                return;
        }
    }
}
