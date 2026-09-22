package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36722a;
    public final Runnable f36723b;

    public q0(int i10, Runnable runnable) {
        this.f36722a = i10;
        this.f36723b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36722a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36723b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36723b.run();
                return;
        }
    }
}
