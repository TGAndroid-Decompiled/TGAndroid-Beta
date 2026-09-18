package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27198a;
    public final int f27199b;
    public final int f27200c;
    public final int d;
    public final int e;
    public final View f27201f;

    public q20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27198a = i14;
        this.f27201f = view;
        this.f27199b = i10;
        this.f27200c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27198a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f27200c;
        int i14 = this.f27199b;
        View view = this.f27201f;
        switch (i10) {
            case 0:
                r20 r20Var = (r20) view;
                r20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                r20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.f27502r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                r20Var.invalidate();
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
                yh.n8 n8Var = (yh.n8) view;
                n8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.f47562r = i0.a.d(floatValue2, i14, i13);
                n8Var.f47563s = i0.a.d(floatValue2, i12, i11);
                n8Var.f47566y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{n8Var.f47562r, n8Var.f47563s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                n8Var.invalidate();
                return;
        }
    }
}
