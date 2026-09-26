package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class s20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28119a;
    public final int f28120b;
    public final int f28121c;
    public final int d;
    public final int e;
    public final View f28122f;

    public s20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f28119a = i14;
        this.f28122f = view;
        this.f28120b = i10;
        this.f28121c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28119a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f28121c;
        int i14 = this.f28120b;
        View view = this.f28122f;
        switch (i10) {
            case 0:
                t20 t20Var = (t20) view;
                t20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                t20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                t20Var.F.setColorFilter(new PorterDuffColorFilter(t20Var.L, PorterDuff.Mode.MULTIPLY));
                t20Var.E.setColor(t20Var.L);
                t20Var.f28421r.setColor(t20Var.M);
                t20Var.J.d(i0.a.k(t20Var.M, 38));
                t20Var.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.D0 = i0.a.d(floatValue, i14, i13);
                int d = i0.a.d(floatValue, i12, i11);
                uVar.F0 = d;
                uVar.T.setColor(d);
                if (uVar.S > 0.0f) {
                    uVar.invalidate();
                    return;
                }
                return;
            default:
                yh.l8 l8Var = (yh.l8) view;
                l8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.f47690r = i0.a.d(floatValue2, i14, i13);
                l8Var.f47691s = i0.a.d(floatValue2, i12, i11);
                l8Var.f47694y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47690r, l8Var.f47691s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.invalidate();
                return;
        }
    }
}
