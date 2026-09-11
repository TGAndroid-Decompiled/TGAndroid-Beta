package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class v2 implements Runnable {
    public final int f21409a;
    public final Object f21410b;

    public v2(Object obj, int i10) {
        this.f21409a = i10;
        this.f21410b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21409a) {
            case 0:
                f3 f3Var = (f3) this.f21410b;
                if (f3Var.startAnimationRunnable == this && !f3.access$000(f3Var)) {
                    f3Var.startAnimationRunnable = null;
                    f3.access$2400(f3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f21410b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                p1 p1Var = (p1) this.f21410b;
                ValueAnimator valueAnimator = p1Var.f21286m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f21286m.start();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f21410b;
                v4Var.k();
                v4Var.j();
                v4Var.f21415f.setAlpha(1.0f);
                return;
        }
    }
}
