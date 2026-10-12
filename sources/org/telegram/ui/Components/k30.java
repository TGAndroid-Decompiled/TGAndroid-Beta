package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class k30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27740a;
    public final int f27741b;
    public final int f27742c;
    public final int d;
    public final int f27743e;
    public final View f27744f;

    public k30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27740a = i14;
        this.f27744f = view;
        this.f27741b = i10;
        this.f27742c = i11;
        this.d = i12;
        this.f27743e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27740a;
        int i11 = this.f27743e;
        int i12 = this.d;
        int i13 = this.f27742c;
        int i14 = this.f27741b;
        View view = this.f27744f;
        switch (i10) {
            case 0:
                l30 l30Var = (l30) view;
                l30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                l30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                l30Var.F.setColorFilter(new PorterDuffColorFilter(l30Var.L, PorterDuff.Mode.MULTIPLY));
                l30Var.E.setColor(l30Var.L);
                l30Var.f28001r.setColor(l30Var.M);
                l30Var.J.d(i0.a.k(l30Var.M, 38));
                l30Var.invalidate();
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
                e8Var.f52699r = i0.a.d(floatValue2, i14, i13);
                e8Var.f52700s = i0.a.d(floatValue2, i12, i11);
                e8Var.f52703y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52699r, e8Var.f52700s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
