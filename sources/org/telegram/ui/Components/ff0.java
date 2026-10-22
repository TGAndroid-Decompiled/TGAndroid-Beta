package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ff0 extends AnimatorListenerAdapter {
    public final int f26219a;
    public final jf0 f26220b;

    public ff0(jf0 jf0Var, int i10) {
        this.f26219a = i10;
        this.f26220b = jf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26219a) {
            case 0:
                this.f26220b.f27525x = null;
                return;
            default:
                this.f26220b.f27526y = null;
                return;
        }
    }
}
