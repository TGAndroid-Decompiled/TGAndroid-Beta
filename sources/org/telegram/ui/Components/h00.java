package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h00 extends AnimatorListenerAdapter {
    public final int f24434a;
    public final int f24435b;
    public final float f24436c;
    public final View d;

    public h00(View view, int i10, float f7, int i11) {
        this.f24434a = i11;
        this.d = view;
        this.f24435b = i10;
        this.f24436c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24434a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.f24435b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24436c;
                }
                i00Var.b(f7, i10 + 1);
                i00Var.f24784y = 0.0f;
                i00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f24435b, this.f24436c, false);
                return;
            default:
                yh.n8 n8Var = (yh.n8) this.d;
                n8Var.f47545c0 = this.f24436c;
                if (n8Var.getValue() != this.f24435b) {
                    n8Var.e(n8Var.getValue());
                }
                n8Var.invalidate();
                return;
        }
    }

    public h00(yh.n8 n8Var, float f7, int i10) {
        this.f24434a = 2;
        this.d = n8Var;
        this.f24436c = f7;
        this.f24435b = i10;
    }
}
