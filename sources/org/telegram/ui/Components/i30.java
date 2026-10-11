package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class i30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27150a;
    public final int f27151b;
    public final int f27152c;
    public final int d;
    public final int f27153e;
    public final View f27154f;

    public i30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27150a = i14;
        this.f27154f = view;
        this.f27151b = i10;
        this.f27152c = i11;
        this.d = i12;
        this.f27153e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27150a;
        int i11 = this.f27153e;
        int i12 = this.d;
        int i13 = this.f27152c;
        int i14 = this.f27151b;
        View view = this.f27154f;
        switch (i10) {
            case 0:
                j30 j30Var = (j30) view;
                j30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                j30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                j30Var.F.setColorFilter(new PorterDuffColorFilter(j30Var.L, PorterDuff.Mode.MULTIPLY));
                j30Var.E.setColor(j30Var.L);
                j30Var.f27536r.setColor(j30Var.M);
                j30Var.J.d(i0.a.k(j30Var.M, 38));
                j30Var.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.v vVar = (org.telegram.ui.Components.voip.v) view;
                vVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.D0 = i0.a.d(floatValue, i14, i13);
                int d = i0.a.d(floatValue, i12, i11);
                vVar.F0 = d;
                vVar.T.setColor(d);
                if (vVar.S > 0.0f) {
                    vVar.invalidate();
                    return;
                }
                return;
            default:
                yh.e8 e8Var = (yh.e8) view;
                e8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.f52550r = i0.a.d(floatValue2, i14, i13);
                e8Var.f52551s = i0.a.d(floatValue2, i12, i11);
                e8Var.f52554y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52550r, e8Var.f52551s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
