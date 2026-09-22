package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class h00 extends AnimatorListenerAdapter {
    public final int f24663a;
    public final int f24664b;
    public final float f24665c;
    public final View d;

    public h00(View view, int i10, float f7, int i11) {
        this.f24663a = i11;
        this.d = view;
        this.f24664b = i10;
        this.f24665c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24663a) {
            case 0:
                i00 i00Var = (i00) this.d;
                int i10 = this.f24664b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f24665c;
                }
                i00Var.b(f7, i10 + 1);
                i00Var.f24934y = 0.0f;
                i00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.w1) this.d).c(this.f24664b, this.f24665c, false);
                return;
            default:
                yh.l8 l8Var = (yh.l8) this.d;
                l8Var.f47731c0 = this.f24665c;
                if (l8Var.getValue() != this.f24664b) {
                    l8Var.e(l8Var.getValue());
                }
                l8Var.invalidate();
                return;
        }
    }

    public h00(yh.l8 l8Var, float f7, int i10) {
        this.f24663a = 2;
        this.d = l8Var;
        this.f24665c = f7;
        this.f24664b = i10;
    }
}
