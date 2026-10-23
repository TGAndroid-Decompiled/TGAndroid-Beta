package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class t81 extends AnimatorListenerAdapter {
    public final int f30481a;
    public final e91 f30482b;

    public t81(e91 e91Var, int i10) {
        this.f30481a = i10;
        this.f30482b = e91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30481a) {
            case 0:
                e91 e91Var = this.f30482b;
                View[] viewArr = e91Var.e;
                View[] viewArr2 = e91Var.e;
                if (viewArr[1] != null) {
                    e91Var.F();
                    e91Var.h.put(e91Var.f25868f[1], viewArr2[1]);
                    e91Var.removeView(viewArr2[1]);
                    e91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                e91Var.Q = null;
                e91Var.w(true);
                u81 u81Var = e91Var.M;
                if (u81Var != null) {
                    u81Var.v.invalidate();
                    e91Var.M.v.f1();
                    e91Var.M.invalidate();
                }
                e91Var.u();
                e91Var.J.unlock();
                return;
            case 1:
                e91 e91Var2 = this.f30482b;
                e91Var2.f25872w = null;
                View[] viewArr3 = e91Var2.e;
                if (viewArr3[1] != null) {
                    if (!e91Var2.F) {
                        e91Var2.F();
                    }
                    e91Var2.h.put(e91Var2.f25868f[1], viewArr3[1]);
                    e91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                e91Var2.f25873x = false;
                e91Var2.I = false;
                u81 u81Var2 = e91Var2.M;
                if (u81Var2 != null) {
                    u81Var2.setEnabled(true);
                }
                e91Var2.w(false);
                e91Var2.u();
                e91Var2.J.unlock();
                return;
            case 2:
                e91 e91Var3 = this.f30482b;
                e91Var3.f25872w = null;
                View[] viewArr4 = e91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    e91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                e91Var3.f25873x = false;
                u81 u81Var3 = e91Var3.M;
                if (u81Var3 != null) {
                    u81Var3.setEnabled(true);
                    u81 u81Var4 = e91Var3.M;
                    u81Var4.J = false;
                    u81Var4.f25395a = 1.0f;
                    u81Var4.v.f1();
                    e91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                e91 e91Var4 = this.f30482b;
                e91Var4.f25872w = null;
                View[] viewArr5 = e91Var4.e;
                if (viewArr5[1] != null) {
                    if (!e91Var4.F) {
                        e91Var4.F();
                    }
                    e91Var4.h.put(e91Var4.f25868f[1], viewArr5[1]);
                    e91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                e91Var4.f25873x = false;
                e91Var4.I = false;
                u81 u81Var5 = e91Var4.M;
                if (u81Var5 != null) {
                    u81Var5.setEnabled(true);
                }
                e91Var4.w(false);
                e91Var4.u();
                e91Var4.J.unlock();
                return;
        }
    }
}
