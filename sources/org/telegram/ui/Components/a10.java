package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a10 extends AnimatorListenerAdapter {
    public final int f24199a;
    public final int f24200b;
    public final float f24201c;
    public final View d;

    public a10(View view, int i10, float f7, int i11) {
        this.f24199a = i11;
        this.d = view;
        this.f24200b = i10;
        this.f24201c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24199a) {
            case 0:
                b10 b10Var = (b10) this.d;
                int i10 = this.f24200b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24201c;
                }
                b10Var.b(f7, i10 + 1);
                b10Var.f24535y = 0.0f;
                b10Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.u1) this.d).c(this.f24200b, this.f24201c, false);
                return;
            default:
                yh.e8 e8Var = (yh.e8) this.d;
                e8Var.f52686c0 = this.f24201c;
                if (e8Var.getValue() != this.f24200b) {
                    e8Var.e(e8Var.getValue());
                }
                e8Var.invalidate();
                return;
        }
    }

    public a10(yh.e8 e8Var, float f7, int i10) {
        this.f24199a = 2;
        this.d = e8Var;
        this.f24201c = f7;
        this.f24200b = i10;
    }
}
