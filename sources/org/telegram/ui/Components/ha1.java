package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ha1 extends AnimatorListenerAdapter {
    public final int f28902a;
    public final ia1 f28903b;

    public ha1(ia1 ia1Var, int i10) {
        this.f28902a = i10;
        this.f28903b = ia1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28902a) {
            case 0:
                this.f28903b.f29254y = null;
                return;
            default:
                this.f28903b.f29254y = null;
                return;
        }
    }
}
