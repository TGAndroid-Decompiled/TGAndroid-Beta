package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class w10 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32046a;
    public final int f32047b;
    public final int f32048c;
    public final int d;
    public final int e;
    public final View f32049f;

    public w10(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f32046a = i14;
        this.f32049f = view;
        this.f32047b = i10;
        this.f32048c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f32046a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f32048c;
        int i14 = this.f32047b;
        View view = this.f32049f;
        switch (i10) {
            case 0:
                y10 y10Var = (y10) view;
                y10Var.L = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                y10Var.M = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                y10Var.F.setColorFilter(new PorterDuffColorFilter(y10Var.L, PorterDuff.Mode.MULTIPLY));
                y10Var.E.setColor(y10Var.L);
                y10Var.f32692r.setColor(y10Var.M);
                y10Var.J.d(i0.b.o(y10Var.M, 38));
                y10Var.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                rVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.D0 = i0.b.f(floatValue, i14, i13);
                int f7 = i0.b.f(floatValue, i12, i11);
                rVar.F0 = f7;
                rVar.T.setColor(f7);
                if (rVar.S > 0.0f) {
                    rVar.invalidate();
                    return;
                }
                return;
            default:
                rh.v8 v8Var = (rh.v8) view;
                v8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.f47627r = i0.b.f(floatValue2, i14, i13);
                v8Var.f47628s = i0.b.f(floatValue2, i12, i11);
                v8Var.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{v8Var.f47627r, v8Var.f47628s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                v8Var.invalidate();
                return;
        }
    }
}
