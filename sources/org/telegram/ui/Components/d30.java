package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final int f24281a;
    public final int f24282b;
    public final int f24283c;
    public final int d;
    public final int e;
    public final View f24284f;

    public d30(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f24281a = i14;
        this.f24284f = view;
        this.f24282b = i10;
        this.f24283c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f24281a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f24283c;
        int i14 = this.f24282b;
        View view = this.f24284f;
        switch (i10) {
            case 0:
                e30 e30Var = (e30) view;
                e30Var.L = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                e30Var.M = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                e30Var.F.setColorFilter(new PorterDuffColorFilter(e30Var.L, PorterDuff.Mode.MULTIPLY));
                e30Var.E.setColor(e30Var.L);
                e30Var.f24578r.setColor(e30Var.M);
                e30Var.J.d(i0.a.k(e30Var.M, 38));
                e30Var.invalidate();
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
                zh.e8 e8Var = (zh.e8) view;
                e8Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.f50474r = i0.a.d(floatValue2, i14, i13);
                e8Var.f50475s = i0.a.d(floatValue2, i12, i11);
                e8Var.f50478y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{e8Var.f50474r, e8Var.f50475s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e8Var.invalidate();
                return;
        }
    }
}
