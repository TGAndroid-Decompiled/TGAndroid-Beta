package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f26220a;
    public final jf0 f26221b;

    public ff0(jf0 jf0Var, int i10) {
        this.f26220a = i10;
        this.f26221b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26220a) {
            case 0:
                this.f26221b.f27526x = null;
                return;
            default:
                this.f26221b.f27527y = null;
                return;
        }
    }
}
