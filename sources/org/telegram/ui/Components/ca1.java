package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ca1 extends AnimatorListenerAdapter {
    public final int f25277a;
    public final da1 f25278b;

    public ca1(da1 da1Var, int i10) {
        this.f25277a = i10;
        this.f25278b = da1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25277a) {
            case 0:
                this.f25278b.f25731y = null;
                return;
            default:
                this.f25278b.f25731y = null;
                return;
        }
    }
}
