package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class r20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27821a;
    public final int f27822b;
    public final int f27823c;
    public final int d;
    public final int e;
    public final View f27824f;

    public r20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27821a = i14;
        this.f27824f = view;
        this.f27822b = i10;
        this.f27823c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27821a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f27823c;
        int i14 = this.f27822b;
        View view = this.f27824f;
        switch (i10) {
            case 0:
                s20 s20Var = (s20) view;
                s20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                s20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                s20Var.F.setColorFilter(new PorterDuffColorFilter(s20Var.L, PorterDuff.Mode.MULTIPLY));
                s20Var.E.setColor(s20Var.L);
                s20Var.f28105r.setColor(s20Var.M);
                s20Var.J.d(i0.a.k(s20Var.M, 38));
                s20Var.invalidate();
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
                l8Var.f47680r = i0.a.d(floatValue2, i14, i13);
                l8Var.f47681s = i0.a.d(floatValue2, i12, i11);
                l8Var.f47684y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47680r, l8Var.f47681s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.invalidate();
                return;
        }
    }
}
