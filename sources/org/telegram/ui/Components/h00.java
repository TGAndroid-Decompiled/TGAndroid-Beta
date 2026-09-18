package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h00 extends AnimatorListenerAdapter {
    public final int f24518a;
    public final int f24519b;
    public final float f24520c;
    public final View d;

    public h00(View view, int i10, float f7, int i11) {
        this.f24518a = i11;
        this.d = view;
        this.f24519b = i10;
        this.f24520c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24518a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.f24519b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24520c;
                }
                i00Var.b(f7, i10 + 1);
                i00Var.f24807y = 0.0f;
                i00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.w1) this.d).c(this.f24519b, this.f24520c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47668c0 = this.f24520c;
                if (l8Var.getValue() != this.f24519b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public h00(yh.l8 l8Var, float f7, int i10) {
        this.f24518a = 2;
        this.d = l8Var;
        this.f24520c = f7;
        this.f24519b = i10;
    }
}
