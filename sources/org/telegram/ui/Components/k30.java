package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class k30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27737a;
    public final int f27738b;
    public final int f27739c;
    public final int d;
    public final int f27740e;
    public final View f27741f;

    public k30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27737a = i14;
        this.f27741f = view;
        this.f27738b = i10;
        this.f27739c = i11;
        this.d = i12;
        this.f27740e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27737a;
        int i11 = this.f27740e;
        int i12 = this.d;
        int i13 = this.f27739c;
        int i14 = this.f27738b;
        View view = this.f27741f;
        switch (i10) {
            case 0:
                l30 l30Var = (l30) view;
                l30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                l30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                l30Var.F.setColorFilter(new PorterDuffColorFilter(l30Var.L, PorterDuff.Mode.MULTIPLY));
                l30Var.E.setColor(l30Var.L);
                l30Var.f28016r.setColor(l30Var.M);
                l30Var.J.d(i0.a.k(l30Var.M, 38));
                l30Var.invalidate();
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
                yh.e8 e8Var = (yh.e8) view;
                e8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.f52687r = i0.a.d(floatValue2, i14, i13);
                e8Var.f52688s = i0.a.d(floatValue2, i12, i11);
                e8Var.f52691y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52687r, e8Var.f52688s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
