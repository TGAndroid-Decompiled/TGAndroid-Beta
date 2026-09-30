package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class u20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28719a;
    public final int f28720b;
    public final int f28721c;
    public final int d;
    public final int e;
    public final View f28722f;

    public u20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f28719a = i14;
        this.f28722f = view;
        this.f28720b = i10;
        this.f28721c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28719a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f28721c;
        int i14 = this.f28720b;
        View view = this.f28722f;
        switch (i10) {
            case 0:
                v20 v20Var = (v20) view;
                v20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                v20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f28999r.setColor(v20Var.M);
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
                yh.l8 l8Var = (yh.l8) view;
                l8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.f47799r = i0.a.d(floatValue2, i14, i13);
                l8Var.f47800s = i0.a.d(floatValue2, i12, i11);
                l8Var.f47803y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47799r, l8Var.f47800s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.invalidate();
                return;
        }
    }
}
