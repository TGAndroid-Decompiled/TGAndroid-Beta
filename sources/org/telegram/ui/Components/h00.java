package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h00 extends AnimatorListenerAdapter {
    public final int f24485a;
    public final int f24486b;
    public final float f24487c;
    public final View d;

    public h00(View view, int i10, float f7, int i11) {
        this.f24485a = i11;
        this.d = view;
        this.f24486b = i10;
        this.f24487c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24485a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.f24486b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24487c;
                }
                i00Var.b(f7, i10 + 1);
                i00Var.f24857y = 0.0f;
                i00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f24486b, this.f24487c, false);
                return;
            default:
                yh.m8 m8Var = (yh.m8) this.d;
                m8Var.f47430c0 = this.f24487c;
                if (m8Var.getValue() != this.f24486b) {
                    m8Var.e(m8Var.getValue());
                }
                m8Var.invalidate();
                return;
        }
    }

    public h00(yh.m8 m8Var, float f7, int i10) {
        this.f24485a = 2;
        this.d = m8Var;
        this.f24487c = f7;
        this.f24486b = i10;
    }
}
