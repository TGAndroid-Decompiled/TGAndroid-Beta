package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d91 extends AnimatorListenerAdapter {
    public final int f25603a;
    public final p91 f25604b;

    public d91(p91 p91Var, int i10) {
        this.f25603a = i10;
        this.f25604b = p91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25603a) {
            case 0:
                p91 p91Var = this.f25604b;
                View[] viewArr = p91Var.f29734e;
                View[] viewArr2 = p91Var.f29734e;
                if (viewArr[1] != null) {
                    p91Var.F();
                    p91Var.h.put(p91Var.f29735f[1], viewArr2[1]);
                    p91Var.removeView(viewArr2[1]);
                    p91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                p91Var.Q = null;
                p91Var.w(true);
                e91 e91Var = p91Var.M;
                if (e91Var != null) {
                    e91Var.v.invalidate();
                    p91Var.M.v.f1();
                    p91Var.M.invalidate();
                }
                p91Var.u();
                p91Var.J.unlock();
                return;
            case 1:
                p91 p91Var2 = this.f25604b;
                p91Var2.f29739w = null;
                View[] viewArr3 = p91Var2.f29734e;
                if (viewArr3[1] != null) {
                    if (!p91Var2.F) {
                        p91Var2.F();
                    }
                    p91Var2.h.put(p91Var2.f29735f[1], viewArr3[1]);
                    p91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                p91Var2.f29740x = false;
                p91Var2.I = false;
                e91 e91Var2 = p91Var2.M;
                if (e91Var2 != null) {
                    e91Var2.setEnabled(true);
                }
                p91Var2.w(false);
                p91Var2.u();
                p91Var2.J.unlock();
                return;
            case 2:
                p91 p91Var3 = this.f25604b;
                p91Var3.f29739w = null;
                View[] viewArr4 = p91Var3.f29734e;
                View view = viewArr4[1];
                if (view != null) {
                    p91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                p91Var3.f29740x = false;
                e91 e91Var3 = p91Var3.M;
                if (e91Var3 != null) {
                    e91Var3.setEnabled(true);
                    e91 e91Var4 = p91Var3.M;
                    e91Var4.J = false;
                    e91Var4.f29400a = 1.0f;
                    e91Var4.v.f1();
                    p91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                p91 p91Var4 = this.f25604b;
                p91Var4.f29739w = null;
                View[] viewArr5 = p91Var4.f29734e;
                if (viewArr5[1] != null) {
                    if (!p91Var4.F) {
                        p91Var4.F();
                    }
                    p91Var4.h.put(p91Var4.f29735f[1], viewArr5[1]);
                    p91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                p91Var4.f29740x = false;
                p91Var4.I = false;
                e91 e91Var5 = p91Var4.M;
                if (e91Var5 != null) {
                    e91Var5.setEnabled(true);
                }
                p91Var4.w(false);
                p91Var4.u();
                p91Var4.J.unlock();
                return;
        }
    }
}
