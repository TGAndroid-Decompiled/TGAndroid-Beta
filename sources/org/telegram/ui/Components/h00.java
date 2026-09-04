package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h00 extends AnimatorListenerAdapter {
    public final int f26551a;
    public final int f26552b;
    public final float f26553c;
    public final View d;

    public h00(View view, int i10, float f7, int i11) {
        this.f26551a = i11;
        this.d = view;
        this.f26552b = i10;
        this.f26553c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f26551a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.f26552b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f26553c;
                }
                i00Var.b(f7, i10 + 1);
                i00Var.f26920y = 0.0f;
                i00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.w1) this.d).c(this.f26552b, this.f26553c, false);
                return;
            default:
                zh.k8 k8Var = (zh.k8) this.d;
                k8Var.f52155c0 = this.f26553c;
                if (k8Var.getValue() != this.f26552b) {
                    k8Var.e(k8Var.getValue());
                }
                k8Var.invalidate();
                return;
        }
    }

    public h00(zh.k8 k8Var, float f7, int i10) {
        this.f26551a = 2;
        this.d = k8Var;
        this.f26553c = f7;
        this.f26552b = i10;
    }
}
