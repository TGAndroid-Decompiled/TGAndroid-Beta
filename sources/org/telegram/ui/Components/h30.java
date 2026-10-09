package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class h30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26947a;
    public final int f26948b;
    public final int f26949c;
    public final int d;
    public final int f26950e;
    public final View f26951f;

    public h30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f26947a = i14;
        this.f26951f = view;
        this.f26948b = i10;
        this.f26949c = i11;
        this.d = i12;
        this.f26950e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f26947a;
        int i11 = this.f26950e;
        int i12 = this.d;
        int i13 = this.f26949c;
        int i14 = this.f26948b;
        View view = this.f26951f;
        switch (i10) {
            case 0:
                i30 i30Var = (i30) view;
                i30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                i30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                i30Var.F.setColorFilter(new PorterDuffColorFilter(i30Var.L, PorterDuff.Mode.MULTIPLY));
                i30Var.E.setColor(i30Var.L);
                i30Var.f27211r.setColor(i30Var.M);
                i30Var.J.d(i0.a.k(i30Var.M, 38));
                i30Var.invalidate();
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
                e8Var.f52473r = i0.a.d(floatValue2, i14, i13);
                e8Var.f52474s = i0.a.d(floatValue2, i12, i11);
                e8Var.f52477y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f52473r, e8Var.f52474s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
