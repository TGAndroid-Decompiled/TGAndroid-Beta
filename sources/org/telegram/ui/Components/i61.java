package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class i61 extends AnimatorListenerAdapter {
    public final int f34511a;
    public final u61 f34512b;

    public i61(u61 u61Var, int i7) {
        this.f34511a = i7;
        this.f34512b = u61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34511a) {
            case 0:
                u61 u61Var = this.f34512b;
                View[] viewArr = u61Var.f38534e;
                View[] viewArr2 = u61Var.f38534e;
                if (viewArr[1] != null) {
                    u61Var.G();
                    u61Var.h.put(u61Var.f38535f[1], viewArr2[1]);
                    u61Var.removeView(viewArr2[1]);
                    u61Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                u61Var.S = null;
                u61Var.x(true);
                j61 j61Var = u61Var.M;
                if (j61Var != null) {
                    j61Var.f38267w.invalidate();
                    u61Var.M.f38267w.g1();
                    u61Var.M.invalidate();
                }
                u61Var.u();
                u61Var.J.e();
                return;
            case 1:
                u61 u61Var2 = this.f34512b;
                u61Var2.f38540x = null;
                View[] viewArr3 = u61Var2.f38534e;
                if (viewArr3[1] != null) {
                    if (!u61Var2.F) {
                        u61Var2.G();
                    }
                    u61Var2.h.put(u61Var2.f38535f[1], viewArr3[1]);
                    u61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                u61Var2.f38541y = false;
                u61Var2.I = false;
                j61 j61Var2 = u61Var2.M;
                if (j61Var2 != null) {
                    j61Var2.setEnabled(true);
                }
                u61Var2.x(false);
                u61Var2.u();
                u61Var2.J.e();
                return;
            case 2:
                u61 u61Var3 = this.f34512b;
                u61Var3.f38540x = null;
                View[] viewArr4 = u61Var3.f38534e;
                View view = viewArr4[1];
                if (view != null) {
                    u61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                u61Var3.f38541y = false;
                j61 j61Var3 = u61Var3.M;
                if (j61Var3 != null) {
                    j61Var3.setEnabled(true);
                    j61 j61Var4 = u61Var3.M;
                    j61Var4.J = false;
                    j61Var4.f38242a = 1.0f;
                    j61Var4.f38267w.g1();
                    u61Var3.M.invalidate();
                    return;
                }
                return;
            default:
                u61 u61Var4 = this.f34512b;
                u61Var4.f38540x = null;
                View[] viewArr5 = u61Var4.f38534e;
                if (viewArr5[1] != null) {
                    if (!u61Var4.F) {
                        u61Var4.G();
                    }
                    u61Var4.h.put(u61Var4.f38535f[1], viewArr5[1]);
                    u61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                u61Var4.f38541y = false;
                u61Var4.I = false;
                j61 j61Var5 = u61Var4.M;
                if (j61Var5 != null) {
                    j61Var5.setEnabled(true);
                }
                u61Var4.x(false);
                u61Var4.u();
                u61Var4.J.e();
                return;
        }
    }
}
