package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class z61 extends AnimatorListenerAdapter {
    public final int f42724a;
    public final k71 f42725b;

    public z61(k71 k71Var, int i7) {
        this.f42724a = i7;
        this.f42725b = k71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42724a) {
            case 0:
                k71 k71Var = this.f42725b;
                View[] viewArr = k71Var.f36665e;
                View[] viewArr2 = k71Var.f36665e;
                if (viewArr[1] != null) {
                    k71Var.E();
                    k71Var.h.put(k71Var.f36666f[1], viewArr2[1]);
                    k71Var.removeView(viewArr2[1]);
                    k71Var.D(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                k71Var.T = null;
                k71Var.u(true);
                a71 a71Var = k71Var.N;
                if (a71Var != null) {
                    a71Var.f36348w.invalidate();
                    k71Var.N.f36348w.g1();
                    k71Var.N.invalidate();
                }
                k71Var.r();
                k71Var.K.e();
                return;
            case 1:
                k71 k71Var2 = this.f42725b;
                k71Var2.f36671x = null;
                View[] viewArr3 = k71Var2.f36665e;
                if (viewArr3[1] != null) {
                    if (!k71Var2.G) {
                        k71Var2.E();
                    }
                    k71Var2.h.put(k71Var2.f36666f[1], viewArr3[1]);
                    k71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                k71Var2.f36672y = false;
                k71Var2.J = false;
                a71 a71Var2 = k71Var2.N;
                if (a71Var2 != null) {
                    a71Var2.setEnabled(true);
                }
                k71Var2.u(false);
                k71Var2.r();
                k71Var2.K.e();
                return;
            case 2:
                k71 k71Var3 = this.f42725b;
                k71Var3.f36671x = null;
                View[] viewArr4 = k71Var3.f36665e;
                View view = viewArr4[1];
                if (view != null) {
                    k71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                k71Var3.f36672y = false;
                a71 a71Var3 = k71Var3.N;
                if (a71Var3 != null) {
                    a71Var3.setEnabled(true);
                    a71 a71Var4 = k71Var3.N;
                    a71Var4.K = false;
                    a71Var4.f36322a = 1.0f;
                    a71Var4.f36348w.g1();
                    k71Var3.N.invalidate();
                    return;
                }
                return;
            default:
                k71 k71Var4 = this.f42725b;
                k71Var4.f36671x = null;
                View[] viewArr5 = k71Var4.f36665e;
                if (viewArr5[1] != null) {
                    if (!k71Var4.G) {
                        k71Var4.E();
                    }
                    k71Var4.h.put(k71Var4.f36666f[1], viewArr5[1]);
                    k71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                k71Var4.f36672y = false;
                k71Var4.J = false;
                a71 a71Var5 = k71Var4.N;
                if (a71Var5 != null) {
                    a71Var5.setEnabled(true);
                }
                k71Var4.u(false);
                k71Var4.r();
                k71Var4.K.e();
                return;
        }
    }
}
