package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f30914a;
    public final z2 f30915b;

    public y2(z2 z2Var, int i7) {
        this.f30914a = i7;
        this.f30915b = z2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30914a) {
            case 0:
                z2 z2Var = this.f30915b;
                Runnable runnable = z2Var.f30951b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.f30953e) {
                    z2Var.f30953e = null;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f30915b;
                Runnable runnable2 = z2Var2.f30951b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.f30953e) {
                    z2Var2.f30953e = null;
                    return;
                }
                return;
        }
    }
}
