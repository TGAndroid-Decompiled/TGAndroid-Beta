package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k00 extends AnimatorListenerAdapter {
    public final int f27923a;
    public final int f27924b;
    public final float f27925c;
    public final View d;

    public k00(View view, int i10, float f7, int i11) {
        this.f27923a = i11;
        this.d = view;
        this.f27924b = i10;
        this.f27925c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f27923a) {
            case 0:
                l00 l00Var = (l00) this.d;
                int i10 = this.f27924b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f27925c;
                }
                l00Var.b(f7, i10 + 1);
                l00Var.f28238y = 0.0f;
                l00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f27924b, this.f27925c, false);
                return;
            default:
                yh.m8 m8Var = (yh.m8) this.d;
                m8Var.f51648c0 = this.f27925c;
                if (m8Var.getValue() != this.f27924b) {
                    m8Var.e(m8Var.getValue());
                }
                m8Var.invalidate();
                return;
        }
    }

    public k00(yh.m8 m8Var, float f7, int i10) {
        this.f27923a = 2;
        this.d = m8Var;
        this.f27925c = f7;
        this.f27924b = i10;
    }
}
