package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r71 extends AnimatorListenerAdapter {
    public final int f39060a;
    public final s71 f39061b;

    public r71(s71 s71Var, int i7) {
        this.f39060a = i7;
        this.f39061b = s71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39060a) {
            case 0:
                this.f39061b.E = null;
                return;
            default:
                this.f39061b.E = null;
                return;
        }
    }
}
