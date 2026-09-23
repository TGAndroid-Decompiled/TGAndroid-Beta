package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f19591a;
    public final Object f19592b;

    public v2(Object obj, int i10) {
        this.f19591a = i10;
        this.f19592b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19591a) {
            case 0:
                f3 f3Var = (f3) this.f19592b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f19592b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f19592b;
                ValueAnimator valueAnimator = p1Var.f19451m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f19451m.start();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f19592b;
                u4Var.k();
                u4Var.j();
                u4Var.f19534f.setAlpha(1.0f);
                return;
        }
    }
}
