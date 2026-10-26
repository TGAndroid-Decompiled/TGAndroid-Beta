package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class z2 implements Runnable {
    public final int f23784a;
    public final Object f23785b;

    public z2(Object obj, int i10) {
        this.f23784a = i10;
        this.f23785b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23784a) {
            case 0:
                k3 k3Var = (k3) this.f23785b;
                if (k3Var.startAnimationRunnable == this && !k3.access$100(k3Var)) {
                    k3Var.startAnimationRunnable = null;
                    k3.access$2500(k3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23785b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.g0(false, true, false);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f23785b;
                ValueAnimator valueAnimator = q1Var.f22973m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    q1Var.f22973m.start();
                    return;
                }
                return;
            default:
                a5 a5Var = (a5) this.f23785b;
                a5Var.k();
                a5Var.j();
                a5Var.f22400f.setAlpha(1.0f);
                return;
        }
    }
}
