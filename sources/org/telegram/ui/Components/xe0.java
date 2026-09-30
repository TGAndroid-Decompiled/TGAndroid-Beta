package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f30364a;
    public final bf0 f30365b;

    public xe0(bf0 bf0Var, int i10) {
        this.f30364a = i10;
        this.f30365b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30364a) {
            case 0:
                this.f30365b.f22964x = null;
                return;
            default:
                this.f30365b.f22965y = null;
                return;
        }
    }
}
