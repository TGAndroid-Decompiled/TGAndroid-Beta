package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j91 extends AnimatorListenerAdapter {
    public final int f25363a;
    public final k91 f25364b;

    public j91(k91 k91Var, int i10) {
        this.f25363a = i10;
        this.f25364b = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25363a) {
            case 0:
                this.f25364b.f25726y = null;
                return;
            default:
                this.f25364b.f25726y = null;
                return;
        }
    }
}
