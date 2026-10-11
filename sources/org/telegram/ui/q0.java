package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f41006a;
    public final Runnable f41007b;

    public q0(int i10, Runnable runnable) {
        this.f41006a = i10;
        this.f41007b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41006a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f41007b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f41007b.run();
                return;
        }
    }
}
