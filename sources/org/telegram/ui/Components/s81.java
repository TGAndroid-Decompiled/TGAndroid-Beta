package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class s81 extends AnimatorListenerAdapter {
    public final int f30210a;
    public final d91 f30211b;

    public s81(d91 d91Var, int i10) {
        this.f30210a = i10;
        this.f30211b = d91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30210a) {
            case 0:
                d91 d91Var = this.f30211b;
                View[] viewArr = d91Var.e;
                View[] viewArr2 = d91Var.e;
                if (viewArr[1] != null) {
                    d91Var.F();
                    d91Var.h.put(d91Var.f25501f[1], viewArr2[1]);
                    d91Var.removeView(viewArr2[1]);
                    d91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                d91Var.Q = null;
                d91Var.w(true);
                t81 t81Var = d91Var.M;
                if (t81Var != null) {
                    t81Var.v.invalidate();
                    d91Var.M.v.f1();
                    d91Var.M.invalidate();
                }
                d91Var.u();
                d91Var.J.unlock();
                return;
            case 1:
                d91 d91Var2 = this.f30211b;
                d91Var2.f25505w = null;
                View[] viewArr3 = d91Var2.e;
                if (viewArr3[1] != null) {
                    if (!d91Var2.F) {
                        d91Var2.F();
                    }
                    d91Var2.h.put(d91Var2.f25501f[1], viewArr3[1]);
                    d91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                d91Var2.f25506x = false;
                d91Var2.I = false;
                t81 t81Var2 = d91Var2.M;
                if (t81Var2 != null) {
                    t81Var2.setEnabled(true);
                }
                d91Var2.w(false);
                d91Var2.u();
                d91Var2.J.unlock();
                return;
            case 2:
                d91 d91Var3 = this.f30211b;
                d91Var3.f25505w = null;
                View[] viewArr4 = d91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    d91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                d91Var3.f25506x = false;
                t81 t81Var3 = d91Var3.M;
                if (t81Var3 != null) {
                    t81Var3.setEnabled(true);
                    t81 t81Var4 = d91Var3.M;
                    t81Var4.J = false;
                    t81Var4.f25125a = 1.0f;
                    t81Var4.v.f1();
                    d91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                d91 d91Var4 = this.f30211b;
                d91Var4.f25505w = null;
                View[] viewArr5 = d91Var4.e;
                if (viewArr5[1] != null) {
                    if (!d91Var4.F) {
                        d91Var4.F();
                    }
                    d91Var4.h.put(d91Var4.f25501f[1], viewArr5[1]);
                    d91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                d91Var4.f25506x = false;
                d91Var4.I = false;
                t81 t81Var5 = d91Var4.M;
                if (t81Var5 != null) {
                    t81Var5.setEnabled(true);
                }
                d91Var4.w(false);
                d91Var4.u();
                d91Var4.J.unlock();
                return;
        }
    }
}
