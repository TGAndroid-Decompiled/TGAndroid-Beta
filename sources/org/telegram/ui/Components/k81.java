package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k81 extends AnimatorListenerAdapter {
    public final int f24671a;
    public final v81 f24672b;

    public k81(v81 v81Var, int i10) {
        this.f24671a = i10;
        this.f24672b = v81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24671a) {
            case 0:
                v81 v81Var = this.f24672b;
                View[] viewArr = v81Var.e;
                View[] viewArr2 = v81Var.e;
                if (viewArr[1] != null) {
                    v81Var.F();
                    v81Var.h.put(v81Var.f27888f[1], viewArr2[1]);
                    v81Var.removeView(viewArr2[1]);
                    v81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                v81Var.Q = null;
                v81Var.w(true);
                l81 l81Var = v81Var.M;
                if (l81Var != null) {
                    l81Var.v.invalidate();
                    v81Var.M.v.e1();
                    v81Var.M.invalidate();
                }
                v81Var.u();
                v81Var.J.unlock();
                return;
            case 1:
                v81 v81Var2 = this.f24672b;
                v81Var2.f27892w = null;
                View[] viewArr3 = v81Var2.e;
                if (viewArr3[1] != null) {
                    if (!v81Var2.F) {
                        v81Var2.F();
                    }
                    v81Var2.h.put(v81Var2.f27888f[1], viewArr3[1]);
                    v81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                v81Var2.f27893x = false;
                v81Var2.I = false;
                l81 l81Var2 = v81Var2.M;
                if (l81Var2 != null) {
                    l81Var2.setEnabled(true);
                }
                v81Var2.w(false);
                v81Var2.u();
                v81Var2.J.unlock();
                return;
            case 2:
                v81 v81Var3 = this.f24672b;
                v81Var3.f27892w = null;
                View[] viewArr4 = v81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    v81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                v81Var3.f27893x = false;
                l81 l81Var3 = v81Var3.M;
                if (l81Var3 != null) {
                    l81Var3.setEnabled(true);
                    l81 l81Var4 = v81Var3.M;
                    l81Var4.J = false;
                    l81Var4.f27614a = 1.0f;
                    l81Var4.v.e1();
                    v81Var3.M.invalidate();
                    return;
                }
                return;
            default:
                v81 v81Var4 = this.f24672b;
                v81Var4.f27892w = null;
                View[] viewArr5 = v81Var4.e;
                if (viewArr5[1] != null) {
                    if (!v81Var4.F) {
                        v81Var4.F();
                    }
                    v81Var4.h.put(v81Var4.f27888f[1], viewArr5[1]);
                    v81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                v81Var4.f27893x = false;
                v81Var4.I = false;
                l81 l81Var5 = v81Var4.M;
                if (l81Var5 != null) {
                    l81Var5.setEnabled(true);
                }
                v81Var4.w(false);
                v81Var4.u();
                v81Var4.J.unlock();
                return;
        }
    }
}
