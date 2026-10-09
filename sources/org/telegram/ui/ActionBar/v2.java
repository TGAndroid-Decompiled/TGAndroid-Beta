package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f21610a;
    public final Object f21611b;

    public v2(Object obj, int i10) {
        this.f21610a = i10;
        this.f21611b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21610a) {
            case 0:
                f3 f3Var = (f3) this.f21611b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21611b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f21611b;
                ValueAnimator valueAnimator = p1Var.f21466m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f21466m.start();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f21611b;
                u4Var.k();
                u4Var.j();
                u4Var.f21554f.setAlpha(1.0f);
                return;
        }
    }
}
