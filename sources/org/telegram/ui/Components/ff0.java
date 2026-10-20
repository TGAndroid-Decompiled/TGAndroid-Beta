package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f26216a;
    public final jf0 f26217b;

    public ff0(jf0 jf0Var, int i10) {
        this.f26216a = i10;
        this.f26217b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26216a) {
            case 0:
                this.f26217b.f27522x = null;
                return;
            default:
                this.f26217b.f27523y = null;
                return;
        }
    }
}
