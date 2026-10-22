package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r91 extends AnimatorListenerAdapter {
    public final int f29909a;
    public final s91 f29910b;

    public r91(s91 s91Var, int i10) {
        this.f29909a = i10;
        this.f29910b = s91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29909a) {
            case 0:
                this.f29910b.f30235y = null;
                return;
            default:
                this.f29910b.f30235y = null;
                return;
        }
    }
}
