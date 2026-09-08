package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f21436a;
    public final Object f21437b;

    public v2(Object obj, int i10) {
        this.f21436a = i10;
        this.f21437b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21436a) {
            case 0:
                f3 f3Var = (f3) this.f21437b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21437b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f21437b;
                ValueAnimator valueAnimator = p1Var.f21313m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f21313m.start();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f21437b;
                v4Var.k();
                v4Var.j();
                v4Var.f21442f.setAlpha(1.0f);
                return;
        }
    }
}
