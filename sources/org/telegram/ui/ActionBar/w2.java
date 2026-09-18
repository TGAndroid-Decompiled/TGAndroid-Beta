package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class w2 implements Runnable {
    public final int f19636a;
    public final Object f19637b;

    public w2(Object obj, int i10) {
        this.f19636a = i10;
        this.f19637b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19636a) {
            case 0:
                g3 g3Var = (g3) this.f19637b;
                if (g3Var.startAnimationRunnable == this && !g3.access$000(g3Var)) {
                    g3Var.startAnimationRunnable = null;
                    g3.access$2400(g3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f19637b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                q1 q1Var = (q1) this.f19637b;
                ValueAnimator valueAnimator = q1Var.f19518m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    q1Var.f19518m.start();
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f19637b;
                w4Var.k();
                w4Var.j();
                w4Var.f19641f.setAlpha(1.0f);
                return;
        }
    }
}
