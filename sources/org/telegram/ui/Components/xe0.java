package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f30372a;
    public final bf0 f30373b;

    public xe0(bf0 bf0Var, int i10) {
        this.f30372a = i10;
        this.f30373b = bf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30372a) {
            case 0:
                this.f30373b.f22995x = null;
                return;
            default:
                this.f30373b.f22996y = null;
                return;
        }
    }
}
