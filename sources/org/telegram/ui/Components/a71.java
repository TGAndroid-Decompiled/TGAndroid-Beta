package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a71 extends AnimatorListenerAdapter {
    public final int f31708a;
    public final b71 f31709b;

    public a71(b71 b71Var, int i7) {
        this.f31708a = i7;
        this.f31709b = b71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31708a) {
            case 0:
                this.f31709b.D = null;
                return;
            default:
                this.f31709b.D = null;
                return;
        }
    }
}
