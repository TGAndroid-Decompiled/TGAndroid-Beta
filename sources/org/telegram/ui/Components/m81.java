package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m81 extends AnimatorListenerAdapter {
    public final int f26236a;
    public final y81 f26237b;

    public m81(y81 y81Var, int i10) {
        this.f26236a = i10;
        this.f26237b = y81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26236a) {
            case 0:
                y81 y81Var = this.f26237b;
                View[] viewArr = y81Var.e;
                View[] viewArr2 = y81Var.e;
                if (viewArr[1] != null) {
                    y81Var.F();
                    y81Var.h.put(y81Var.f30672f[1], viewArr2[1]);
                    y81Var.removeView(viewArr2[1]);
                    y81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                y81Var.Q = null;
                y81Var.w(true);
                n81 n81Var = y81Var.M;
                if (n81Var != null) {
                    n81Var.v.invalidate();
                    y81Var.M.v.h1();
                    y81Var.M.invalidate();
                }
                y81Var.u();
                y81Var.J.unlock();
                return;
            case 1:
                y81 y81Var2 = this.f26237b;
                y81Var2.f30676w = null;
                View[] viewArr3 = y81Var2.e;
                if (viewArr3[1] != null) {
                    if (!y81Var2.F) {
                        y81Var2.F();
                    }
                    y81Var2.h.put(y81Var2.f30672f[1], viewArr3[1]);
                    y81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                y81Var2.f30677x = false;
                y81Var2.I = false;
                n81 n81Var2 = y81Var2.M;
                if (n81Var2 != null) {
                    n81Var2.setEnabled(true);
                }
                y81Var2.w(false);
                y81Var2.u();
                y81Var2.J.unlock();
                return;
            case 2:
                y81 y81Var3 = this.f26237b;
                y81Var3.f30676w = null;
                View[] viewArr4 = y81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    y81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                y81Var3.f30677x = false;
                n81 n81Var3 = y81Var3.M;
                if (n81Var3 != null) {
                    n81Var3.setEnabled(true);
                    n81 n81Var4 = y81Var3.M;
                    n81Var4.J = false;
                    n81Var4.f30179a = 1.0f;
                    n81Var4.v.h1();
                    y81Var3.M.invalidate();
                    return;
                }
                return;
            default:
                y81 y81Var4 = this.f26237b;
                y81Var4.f30676w = null;
                View[] viewArr5 = y81Var4.e;
                if (viewArr5[1] != null) {
                    if (!y81Var4.F) {
                        y81Var4.F();
                    }
                    y81Var4.h.put(y81Var4.f30672f[1], viewArr5[1]);
                    y81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                y81Var4.f30677x = false;
                y81Var4.I = false;
                n81 n81Var5 = y81Var4.M;
                if (n81Var5 != null) {
                    n81Var5.setEnabled(true);
                }
                y81Var4.w(false);
                y81Var4.u();
                y81Var4.J.unlock();
                return;
        }
    }
}
