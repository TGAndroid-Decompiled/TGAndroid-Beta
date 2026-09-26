package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class u2 implements Runnable {
    public final int f19818a;
    public final Object f19819b;

    public u2(Object obj, int i10) {
        this.f19818a = i10;
        this.f19819b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19818a) {
            case 0:
                e3 e3Var = (e3) this.f19819b;
                if (e3Var.startAnimationRunnable == this && !e3.access$000(e3Var)) {
                    e3Var.startAnimationRunnable = null;
                    e3.access$2400(e3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f19819b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                o1 o1Var = (o1) this.f19819b;
                ValueAnimator valueAnimator = o1Var.f19678m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    o1Var.f19678m.start();
                    return;
                }
                return;
            default:
                t4 t4Var = (t4) this.f19819b;
                t4Var.k();
                t4Var.j();
                t4Var.f19761f.setAlpha(1.0f);
                return;
        }
    }
}
