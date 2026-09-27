package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class t20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28441a;
    public final int f28442b;
    public final int f28443c;
    public final int d;
    public final int e;
    public final View f28444f;

    public t20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f28441a = i14;
        this.f28444f = view;
        this.f28442b = i10;
        this.f28443c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28441a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f28443c;
        int i14 = this.f28442b;
        View view = this.f28444f;
        switch (i10) {
            case 0:
                u20 u20Var = (u20) view;
                u20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                u20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                u20Var.F.setColorFilter(new PorterDuffColorFilter(u20Var.L, PorterDuff.Mode.MULTIPLY));
                u20Var.E.setColor(u20Var.L);
                u20Var.f28761r.setColor(u20Var.M);
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
                yh.k8 k8Var = (yh.k8) view;
                k8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.f47702r = i0.a.d(floatValue2, i14, i13);
                k8Var.f47703s = i0.a.d(floatValue2, i12, i11);
                k8Var.f47706y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f47702r, k8Var.f47703s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                k8Var.invalidate();
                return;
        }
    }
}
