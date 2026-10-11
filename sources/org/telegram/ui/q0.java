package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f41040a;
    public final Runnable f41041b;

    public q0(int i10, Runnable runnable) {
        this.f41040a = i10;
        this.f41041b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41040a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41041b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41041b.run();
                return;
        }
    }
}
