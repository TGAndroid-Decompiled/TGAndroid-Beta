package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class z20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29571a;
    public final int f29572b;
    public final int f29573c;
    public final int d;
    public final int e;
    public final View f29574f;

    public z20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f29571a = i14;
        this.f29574f = view;
        this.f29572b = i10;
        this.f29573c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29571a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f29573c;
        int i14 = this.f29572b;
        View view = this.f29574f;
        switch (i10) {
            case 0:
                a30 a30Var = (a30) view;
                a30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                a30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                a30Var.F.setColorFilter(new PorterDuffColorFilter(a30Var.L, PorterDuff.Mode.MULTIPLY));
                a30Var.E.setColor(a30Var.L);
                a30Var.f21371r.setColor(a30Var.M);
                a30Var.J.d(i0.a.k(a30Var.M, 38));
                a30Var.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.D0 = i0.a.d(floatValue, i14, i13);
                int d = i0.a.d(floatValue, i12, i11);
                tVar.F0 = d;
                tVar.T.setColor(d);
                if (tVar.S > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
            default:
                xh.o8 o8Var = (xh.o8) view;
                o8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f45836r = i0.a.d(floatValue2, i14, i13);
                o8Var.f45837s = i0.a.d(floatValue2, i12, i11);
                o8Var.f45840y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{o8Var.f45836r, o8Var.f45837s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                o8Var.invalidate();
                return;
        }
    }
}
