package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36723a;
    public final Runnable f36724b;

    public q0(int i10, Runnable runnable) {
        this.f36723a = i10;
        this.f36724b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36723a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36724b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36724b.run();
                return;
        }
    }
}
