package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f30371a;
    public final bf0 f30372b;

    public xe0(bf0 bf0Var, int i10) {
        this.f30371a = i10;
        this.f30372b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30371a) {
            case 0:
                this.f30372b.f22994x = null;
                return;
            default:
                this.f30372b.f22995y = null;
                return;
        }
    }
}
