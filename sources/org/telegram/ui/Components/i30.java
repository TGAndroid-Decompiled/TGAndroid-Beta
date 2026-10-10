package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class i30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27218a;
    public final int f27219b;
    public final int f27220c;
    public final int d;
    public final int f27221e;
    public final View f27222f;

    public i30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f27218a = i14;
        this.f27222f = view;
        this.f27219b = i10;
        this.f27220c = i11;
        this.d = i12;
        this.f27221e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27218a;
        int i11 = this.f27221e;
        int i12 = this.d;
        int i13 = this.f27220c;
        int i14 = this.f27219b;
        View view = this.f27222f;
        switch (i10) {
            case 0:
                j30 j30Var = (j30) view;
                j30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                j30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                j30Var.F.setColorFilter(new PorterDuffColorFilter(j30Var.L, PorterDuff.Mode.MULTIPLY));
                j30Var.E.setColor(j30Var.L);
                j30Var.f27520r.setColor(j30Var.M);
                j30Var.J.d(i0.a.k(j30Var.M, 38));
                j30Var.invalidate();
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
                e8Var.f52519r = i0.a.d(floatValue2, i14, i13);
                e8Var.f52520s = i0.a.d(floatValue2, i12, i11);
                e8Var.f52523y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52519r, e8Var.f52520s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
