package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f30979a;
    public final z2 f30980b;

    public y2(z2 z2Var, int i3) {
        this.f30979a = i3;
        this.f30980b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30979a) {
            case 0:
                z2 z2Var = this.f30980b;
                Runnable runnable = z2Var.f31030b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f31032e) {
                    z2Var.f31032e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30980b;
                Runnable runnable2 = z2Var2.f31030b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f31032e) {
                    z2Var2.f31032e = null;
                    return;
                }
                return;
        }
    }
}
