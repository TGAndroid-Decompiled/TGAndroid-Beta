package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o00 extends AnimatorListenerAdapter {
    public final int f25630a;
    public final int f25631b;
    public final float f25632c;
    public final View d;

    public o00(View view, int i10, float f7, int i11) {
        this.f25630a = i11;
        this.d = view;
        this.f25631b = i10;
        this.f25632c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25630a) {
            case 0:
                p00 p00Var = (p00) this.d;
                int i10 = this.f25631b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f25632c;
                }
                p00Var.b(f7, i10 + 1);
                p00Var.f25969y = 0.0f;
                p00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f25631b, this.f25632c, false);
                return;
            default:
                xh.o8 o8Var = (xh.o8) this.d;
                o8Var.f45824c0 = this.f25632c;
                if (o8Var.getValue() != this.f25631b) {
                    o8Var.e(o8Var.getValue());
                }
                o8Var.invalidate();
                return;
        }
    }

    public o00(xh.o8 o8Var, float f7, int i10) {
        this.f25630a = 2;
        this.d = o8Var;
        this.f25632c = f7;
        this.f25631b = i10;
    }
}
