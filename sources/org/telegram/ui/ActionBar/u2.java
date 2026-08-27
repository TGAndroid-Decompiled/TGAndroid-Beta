package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class u2 implements Runnable {

    public final int f23825a;

    public final Object f23826b;

    public u2(Object obj, int i10) {
        this.f23825a = i10;
        this.f23826b = obj;
    }

    @Override
    public final void run() {
        switch (this.f23825a) {
            case 0:
                e3 e3Var = (e3) this.f23826b;
                if (e3Var.startAnimationRunnable == this && !e3Var.dismissed) {
                    e3Var.startAnimationRunnable = null;
                    e3.access$2400(e3Var);
                    break;
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23826b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    break;
                }
                break;
            case 2:
                p1 p1Var = (p1) this.f23826b;
                ValueAnimator valueAnimator = p1Var.f23717m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.f23717m.start();
                    break;
                }
                break;
            default:
                t4 t4Var = (t4) this.f23826b;
                t4Var.k();
                t4Var.j();
                t4Var.f23786f.setAlpha(1.0f);
                break;
        }
    }
}
