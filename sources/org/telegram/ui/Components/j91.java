package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j91 extends AnimatorListenerAdapter {
    public final int f25364a;
    public final k91 f25365b;

    public j91(k91 k91Var, int i10) {
        this.f25364a = i10;
        this.f25365b = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25364a) {
            case 0:
                this.f25365b.f25727y = null;
                return;
            default:
                this.f25365b.f25727y = null;
                return;
        }
    }
}
