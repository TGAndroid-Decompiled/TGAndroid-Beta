package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j91 extends AnimatorListenerAdapter {
    public final int f24322a;
    public final k91 f24323b;

    public j91(k91 k91Var, int i10) {
        this.f24322a = i10;
        this.f24323b = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24322a) {
            case 0:
                this.f24323b.f24685y = null;
                return;
            default:
                this.f24323b.f24685y = null;
                return;
        }
    }
}
