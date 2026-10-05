package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class u20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31311a;
    public final int f31312b;
    public final int f31313c;
    public final int d;
    public final int f31314e;
    public final View f31315f;

    public u20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f31311a = i14;
        this.f31315f = view;
        this.f31312b = i10;
        this.f31313c = i11;
        this.d = i12;
        this.f31314e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31311a;
        int i11 = this.f31314e;
        int i12 = this.d;
        int i13 = this.f31313c;
        int i14 = this.f31312b;
        View view = this.f31315f;
        switch (i10) {
            case 0:
                v20 v20Var = (v20) view;
                v20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                v20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f31617r.setColor(v20Var.M);
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
                yh.o8 o8Var = (yh.o8) view;
                o8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f51761r = i0.a.d(floatValue2, i14, i13);
                o8Var.f51762s = i0.a.d(floatValue2, i12, i11);
                o8Var.f51765y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{o8Var.f51761r, o8Var.f51762s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                o8Var.invalidate();
                return;
        }
    }
}
