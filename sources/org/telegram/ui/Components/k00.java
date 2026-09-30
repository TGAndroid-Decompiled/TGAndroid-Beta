package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k00 extends AnimatorListenerAdapter {
    public final int f25595a;
    public final int f25596b;
    public final float f25597c;
    public final View d;

    public k00(View view, int i10, float f7, int i11) {
        this.f25595a = i11;
        this.d = view;
        this.f25596b = i10;
        this.f25597c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25595a) {
            case 0:
                l00 l00Var = (l00) this.d;
                int i10 = this.f25596b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f25597c;
                }
                l00Var.b(f7, i10 + 1);
                l00Var.f25865y = 0.0f;
                l00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f25596b, this.f25597c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47787c0 = this.f25597c;
                if (l8Var.getValue() != this.f25596b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public k00(yh.l8 l8Var, float f7, int i10) {
        this.f25595a = 2;
        this.d = l8Var;
        this.f25597c = f7;
        this.f25596b = i10;
    }
}
