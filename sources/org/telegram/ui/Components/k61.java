package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k61 extends AnimatorListenerAdapter {
    public final int f36304a;
    public final w61 f36305b;

    public k61(w61 w61Var, int i7) {
        this.f36304a = i7;
        this.f36305b = w61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36304a) {
            case 0:
                w61 w61Var = this.f36305b;
                View[] viewArr = w61Var.f41300e;
                View[] viewArr2 = w61Var.f41300e;
                if (viewArr[1] != null) {
                    w61Var.E();
                    w61Var.h.put(w61Var.f41301f[1], viewArr2[1]);
                    w61Var.removeView(viewArr2[1]);
                    w61Var.D(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                w61Var.T = null;
                w61Var.u(true);
                l61 l61Var = w61Var.N;
                if (l61Var != null) {
                    l61Var.f40317w.invalidate();
                    w61Var.N.f40317w.g1();
                    w61Var.N.invalidate();
                }
                w61Var.r();
                w61Var.K.e();
                return;
            case 1:
                w61 w61Var2 = this.f36305b;
                w61Var2.f41306x = null;
                View[] viewArr3 = w61Var2.f41300e;
                if (viewArr3[1] != null) {
                    if (!w61Var2.G) {
                        w61Var2.E();
                    }
                    w61Var2.h.put(w61Var2.f41301f[1], viewArr3[1]);
                    w61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                w61Var2.f41307y = false;
                w61Var2.J = false;
                l61 l61Var2 = w61Var2.N;
                if (l61Var2 != null) {
                    l61Var2.setEnabled(true);
                }
                w61Var2.u(false);
                w61Var2.r();
                w61Var2.K.e();
                return;
            case 2:
                w61 w61Var3 = this.f36305b;
                w61Var3.f41306x = null;
                View[] viewArr4 = w61Var3.f41300e;
                View view = viewArr4[1];
                if (view != null) {
                    w61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                w61Var3.f41307y = false;
                l61 l61Var3 = w61Var3.N;
                if (l61Var3 != null) {
                    l61Var3.setEnabled(true);
                    l61 l61Var4 = w61Var3.N;
                    l61Var4.K = false;
                    l61Var4.f40291a = 1.0f;
                    l61Var4.f40317w.g1();
                    w61Var3.N.invalidate();
                    return;
                }
                return;
            default:
                w61 w61Var4 = this.f36305b;
                w61Var4.f41306x = null;
                View[] viewArr5 = w61Var4.f41300e;
                if (viewArr5[1] != null) {
                    if (!w61Var4.G) {
                        w61Var4.E();
                    }
                    w61Var4.h.put(w61Var4.f41301f[1], viewArr5[1]);
                    w61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                w61Var4.f41307y = false;
                w61Var4.J = false;
                l61 l61Var5 = w61Var4.N;
                if (l61Var5 != null) {
                    l61Var5.setEnabled(true);
                }
                w61Var4.u(false);
                w61Var4.r();
                w61Var4.K.e();
                return;
        }
    }
}
