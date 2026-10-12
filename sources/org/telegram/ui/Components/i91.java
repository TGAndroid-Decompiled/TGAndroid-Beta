package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class i91 extends AnimatorListenerAdapter {
    public final int f27105a;
    public final u91 f27106b;

    public i91(u91 u91Var, int i10) {
        this.f27105a = i10;
        this.f27106b = u91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27105a) {
            case 0:
                u91 u91Var = this.f27106b;
                View[] viewArr = u91Var.f31114e;
                View[] viewArr2 = u91Var.f31114e;
                if (viewArr[1] != null) {
                    u91Var.F();
                    u91Var.h.put(u91Var.f31115f[1], viewArr2[1]);
                    u91Var.removeView(viewArr2[1]);
                    u91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                u91Var.Q = null;
                u91Var.w(true);
                j91 j91Var = u91Var.M;
                if (j91Var != null) {
                    j91Var.v.invalidate();
                    u91Var.M.v.f1();
                    u91Var.M.invalidate();
                }
                u91Var.u();
                u91Var.J.unlock();
                return;
            case 1:
                u91 u91Var2 = this.f27106b;
                u91Var2.f31119w = null;
                View[] viewArr3 = u91Var2.f31114e;
                if (viewArr3[1] != null) {
                    if (!u91Var2.F) {
                        u91Var2.F();
                    }
                    u91Var2.h.put(u91Var2.f31115f[1], viewArr3[1]);
                    u91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                u91Var2.f31120x = false;
                u91Var2.I = false;
                j91 j91Var2 = u91Var2.M;
                if (j91Var2 != null) {
                    j91Var2.setEnabled(true);
                }
                u91Var2.w(false);
                u91Var2.u();
                u91Var2.J.unlock();
                return;
            case 2:
                u91 u91Var3 = this.f27106b;
                u91Var3.f31119w = null;
                View[] viewArr4 = u91Var3.f31114e;
                View view = viewArr4[1];
                if (view != null) {
                    u91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                u91Var3.f31120x = false;
                j91 j91Var3 = u91Var3.M;
                if (j91Var3 != null) {
                    j91Var3.setEnabled(true);
                    j91 j91Var4 = u91Var3.M;
                    j91Var4.J = false;
                    j91Var4.f30800a = 1.0f;
                    j91Var4.v.f1();
                    u91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                u91 u91Var4 = this.f27106b;
                u91Var4.f31119w = null;
                View[] viewArr5 = u91Var4.f31114e;
                if (viewArr5[1] != null) {
                    if (!u91Var4.F) {
                        u91Var4.F();
                    }
                    u91Var4.h.put(u91Var4.f31115f[1], viewArr5[1]);
                    u91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                u91Var4.f31120x = false;
                u91Var4.I = false;
                j91 j91Var5 = u91Var4.M;
                if (j91Var5 != null) {
                    j91Var5.setEnabled(true);
                }
                u91Var4.w(false);
                u91Var4.u();
                u91Var4.J.unlock();
                return;
        }
    }
}
