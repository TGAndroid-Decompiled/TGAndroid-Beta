package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f39687a;
    public final Runnable f39688b;

    public q0(int i10, Runnable runnable) {
        this.f39687a = i10;
        this.f39688b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39687a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f39688b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f39688b.run();
                return;
        }
    }
}
