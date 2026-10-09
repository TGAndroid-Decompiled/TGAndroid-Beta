package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x00 extends AnimatorListenerAdapter {
    public final int f32702a;
    public final int f32703b;
    public final float f32704c;
    public final View d;

    public x00(View view, int i10, float f7, int i11) {
        this.f32702a = i11;
        this.d = view;
        this.f32703b = i10;
        this.f32704c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f32702a) {
            case 0:
                y00 y00Var = (y00) this.d;
                int i10 = this.f32703b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f32704c;
                }
                y00Var.b(f7, i10 + 1);
                y00Var.f33087y = 0.0f;
                y00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.u1) this.d).c(this.f32703b, this.f32704c, false);
                return;
            default:
                yh.e8 e8Var = (yh.e8) this.d;
                e8Var.f52462c0 = this.f32704c;
                if (e8Var.getValue() != this.f32703b) {
                    e8Var.e(e8Var.getValue());
                }
                e8Var.invalidate();
                return;
        }
    }

    public x00(yh.e8 e8Var, float f7, int i10) {
        this.f32702a = 2;
        this.d = e8Var;
        this.f32704c = f7;
        this.f32703b = i10;
    }
}
