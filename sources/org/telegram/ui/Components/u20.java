package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class u20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31256a;
    public final int f31257b;
    public final int f31258c;
    public final int d;
    public final int f31259e;
    public final View f31260f;

    public u20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f31256a = i14;
        this.f31260f = view;
        this.f31257b = i10;
        this.f31258c = i11;
        this.d = i12;
        this.f31259e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31256a;
        int i11 = this.f31259e;
        int i12 = this.d;
        int i13 = this.f31258c;
        int i14 = this.f31257b;
        View view = this.f31260f;
        switch (i10) {
            case 0:
                v20 v20Var = (v20) view;
                v20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                v20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f31515r.setColor(v20Var.M);
                v20Var.J.d(i0.a.k(v20Var.M, 38));
                v20Var.invalidate();
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
                yh.m8 m8Var = (yh.m8) view;
                m8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.f51662r = i0.a.d(floatValue2, i14, i13);
                m8Var.f51663s = i0.a.d(floatValue2, i12, i11);
                m8Var.f51666y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{m8Var.f51662r, m8Var.f51663s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                m8Var.invalidate();
                return;
        }
    }
}
