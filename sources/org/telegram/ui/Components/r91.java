package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r91 extends AnimatorListenerAdapter {
    public final int f29905a;
    public final s91 f29906b;

    public r91(s91 s91Var, int i10) {
        this.f29905a = i10;
        this.f29906b = s91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29905a) {
            case 0:
                this.f29906b.f30231y = null;
                return;
            default:
                this.f29906b.f30231y = null;
                return;
        }
    }
}
