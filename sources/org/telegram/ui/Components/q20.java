package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27482a;
    public final int f27483b;
    public final int f27484c;
    public final int d;
    public final int e;
    public final View f27485f;

    public q20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27482a = i14;
        this.f27485f = view;
        this.f27483b = i10;
        this.f27484c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27482a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f27484c;
        int i14 = this.f27483b;
        View view = this.f27485f;
        switch (i10) {
            case 0:
                r20 r20Var = (r20) view;
                r20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                r20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.f27768r.setColor(r20Var.M);
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
                yh.l8 l8Var = (yh.l8) view;
                l8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.f47743r = i0.a.d(floatValue2, i14, i13);
                l8Var.f47744s = i0.a.d(floatValue2, i12, i11);
                l8Var.f47747y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{l8Var.f47743r, l8Var.f47744s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                l8Var.invalidate();
                return;
        }
    }
}
