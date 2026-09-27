package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class w2 implements Runnable {
    public final int f19868a;
    public final Object f19869b;

    public w2(Object obj, int i10) {
        this.f19868a = i10;
        this.f19869b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19868a) {
            case 0:
                g3 g3Var = (g3) this.f19869b;
                if (g3Var.startAnimationRunnable == this && !g3.access$000(g3Var)) {
                    g3Var.startAnimationRunnable = null;
                    g3.access$2400(g3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f19869b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f19869b;
                ValueAnimator valueAnimator = q1Var.f19728m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    q1Var.f19728m.start();
                    return;
                }
                return;
            default:
                v4 v4Var = (v4) this.f19869b;
                v4Var.k();
                v4Var.j();
                v4Var.f19811f.setAlpha(1.0f);
                return;
        }
    }
}
