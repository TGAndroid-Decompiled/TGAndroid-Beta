package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j00 extends AnimatorListenerAdapter {
    public final int f25215a;
    public final int f25216b;
    public final float f25217c;
    public final View d;

    public j00(View view, int i10, float f7, int i11) {
        this.f25215a = i11;
        this.d = view;
        this.f25216b = i10;
        this.f25217c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25215a) {
            case 0:
                k00 k00Var = (k00) this.d;
                int i10 = this.f25216b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f25217c;
                }
                k00Var.b(f7, i10 + 1);
                k00Var.f25584y = 0.0f;
                k00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f25216b, this.f25217c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47678c0 = this.f25217c;
                if (l8Var.getValue() != this.f25216b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public j00(yh.l8 l8Var, float f7, int i10) {
        this.f25215a = 2;
        this.d = l8Var;
        this.f25217c = f7;
        this.f25216b = i10;
    }
}
