package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class t20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28424a;
    public final int f28425b;
    public final int f28426c;
    public final int d;
    public final int e;
    public final View f28427f;

    public t20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f28424a = i14;
        this.f28427f = view;
        this.f28425b = i10;
        this.f28426c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28424a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f28426c;
        int i14 = this.f28425b;
        View view = this.f28427f;
        switch (i10) {
            case 0:
                u20 u20Var = (u20) view;
                u20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                u20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                u20Var.F.setColorFilter(new PorterDuffColorFilter(u20Var.L, PorterDuff.Mode.MULTIPLY));
                u20Var.E.setColor(u20Var.L);
                u20Var.f28700r.setColor(u20Var.M);
                u20Var.J.d(i0.a.k(u20Var.M, 38));
                u20Var.invalidate();
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
                l8Var.f47691r = i0.a.d(floatValue2, i14, i13);
                l8Var.f47692s = i0.a.d(floatValue2, i12, i11);
                l8Var.f47695y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47691r, l8Var.f47692s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.invalidate();
                return;
        }
    }
}
