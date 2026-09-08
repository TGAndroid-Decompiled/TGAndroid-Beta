package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29578a;
    public final int f29579b;
    public final int f29580c;
    public final int d;
    public final int f29581e;
    public final View f29582f;

    public q20(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f29578a = i14;
        this.f29582f = view;
        this.f29579b = i10;
        this.f29580c = i11;
        this.d = i12;
        this.f29581e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29578a;
        int i11 = this.f29581e;
        int i12 = this.d;
        int i13 = this.f29580c;
        int i14 = this.f29579b;
        View view = this.f29582f;
        switch (i10) {
            case 0:
                r20 r20Var = (r20) view;
                r20Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                r20Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.f29919r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                r20Var.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.D0 = i0.a.d(floatValue, i14, i13);
                int d = i0.a.d(floatValue, i12, i11);
                tVar.F0 = d;
                tVar.T.setColor(d);
                if (tVar.S > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
            default:
                zh.k8 k8Var = (zh.k8) view;
                k8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.f52199r = i0.a.d(floatValue2, i14, i13);
                k8Var.f52200s = i0.a.d(floatValue2, i12, i11);
                k8Var.f52203y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.f52199r, k8Var.f52200s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                k8Var.invalidate();
                return;
        }
    }
}
