package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f21601a;
    public final Object f21602b;

    public v2(Object obj, int i10) {
        this.f21601a = i10;
        this.f21602b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21601a) {
            case 0:
                f3 f3Var = (f3) this.f21602b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21602b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f21602b;
                ValueAnimator valueAnimator = p1Var.f21454m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f21454m.start();
                    return;
                }
                return;
            default:
                u4 u4Var = (u4) this.f21602b;
                u4Var.k();
                u4Var.j();
                u4Var.f21541f.setAlpha(1.0f);
                return;
        }
    }
}
