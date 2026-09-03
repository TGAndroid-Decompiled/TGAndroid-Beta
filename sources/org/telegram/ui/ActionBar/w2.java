package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
public final class w2 implements Runnable {
    public final int f20652a;
    public final Object f20653b;

    public w2(Object obj, int i10) {
        this.f20652a = i10;
        this.f20653b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20652a) {
            case 0:
                g3 g3Var = (g3) this.f20653b;
                if (g3Var.startAnimationRunnable == this && !g3.access$000(g3Var)) {
                    g3Var.startAnimationRunnable = null;
                    g3.access$2400(g3Var);
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f20653b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    return;
                }
                return;
            case 2:
                r1 r1Var = (r1) this.f20653b;
                ValueAnimator valueAnimator = r1Var.f20528m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    r1Var.f20528m.start();
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f20653b;
                w4Var.k();
                w4Var.j();
                w4Var.f20674f.setAlpha(1.0f);
                return;
        }
    }
}
