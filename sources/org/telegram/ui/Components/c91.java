package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c91 extends AnimatorListenerAdapter {
    public final int f25300a;
    public final o91 f25301b;

    public c91(o91 o91Var, int i10) {
        this.f25300a = i10;
        this.f25301b = o91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25300a) {
            case 0:
                o91 o91Var = this.f25301b;
                View[] viewArr = o91Var.f29429e;
                View[] viewArr2 = o91Var.f29429e;
                if (viewArr[1] != null) {
                    o91Var.F();
                    o91Var.h.put(o91Var.f29430f[1], viewArr2[1]);
                    o91Var.removeView(viewArr2[1]);
                    o91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                o91Var.Q = null;
                o91Var.w(true);
                d91 d91Var = o91Var.M;
                if (d91Var != null) {
                    d91Var.v.invalidate();
                    o91Var.M.v.f1();
                    o91Var.M.invalidate();
                }
                o91Var.u();
                o91Var.J.unlock();
                return;
            case 1:
                o91 o91Var2 = this.f25301b;
                o91Var2.f29434w = null;
                View[] viewArr3 = o91Var2.f29429e;
                if (viewArr3[1] != null) {
                    if (!o91Var2.F) {
                        o91Var2.F();
                    }
                    o91Var2.h.put(o91Var2.f29430f[1], viewArr3[1]);
                    o91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                o91Var2.f29435x = false;
                o91Var2.I = false;
                d91 d91Var2 = o91Var2.M;
                if (d91Var2 != null) {
                    d91Var2.setEnabled(true);
                }
                o91Var2.w(false);
                o91Var2.u();
                o91Var2.J.unlock();
                return;
            case 2:
                o91 o91Var3 = this.f25301b;
                o91Var3.f29434w = null;
                View[] viewArr4 = o91Var3.f29429e;
                View view = viewArr4[1];
                if (view != null) {
                    o91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                o91Var3.f29435x = false;
                d91 d91Var3 = o91Var3.M;
                if (d91Var3 != null) {
                    d91Var3.setEnabled(true);
                    d91 d91Var4 = o91Var3.M;
                    d91Var4.J = false;
                    d91Var4.f29095a = 1.0f;
                    d91Var4.v.f1();
                    o91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                o91 o91Var4 = this.f25301b;
                o91Var4.f29434w = null;
                View[] viewArr5 = o91Var4.f29429e;
                if (viewArr5[1] != null) {
                    if (!o91Var4.F) {
                        o91Var4.F();
                    }
                    o91Var4.h.put(o91Var4.f29430f[1], viewArr5[1]);
                    o91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                o91Var4.f29435x = false;
                o91Var4.I = false;
                d91 d91Var5 = o91Var4.M;
                if (d91Var5 != null) {
                    d91Var5.setEnabled(true);
                }
                o91Var4.w(false);
                o91Var4.u();
                o91Var4.J.unlock();
                return;
        }
    }
}
