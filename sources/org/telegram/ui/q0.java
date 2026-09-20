package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final int f36729a;
    public final Runnable f36730b;

    public q0(int i10, Runnable runnable) {
        this.f36729a = i10;
        this.f36730b = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36729a) {
            case 0:
                super.onAnimationEnd(animator);
                Runnable runnable = this.f36730b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36730b.run();
                return;
        }
    }
}
