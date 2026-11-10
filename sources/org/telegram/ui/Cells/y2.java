package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f30935a;
    public final z2 f30936b;

    public y2(z2 z2Var, int i7) {
        this.f30935a = i7;
        this.f30936b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30935a) {
            case 0:
                z2 z2Var = this.f30936b;
                Runnable runnable = z2Var.f30972b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f30974e) {
                    z2Var.f30974e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30936b;
                Runnable runnable2 = z2Var2.f30972b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f30974e) {
                    z2Var2.f30974e = null;
                    return;
                }
                return;
        }
    }
}
