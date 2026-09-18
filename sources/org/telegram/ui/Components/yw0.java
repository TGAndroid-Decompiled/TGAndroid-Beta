package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yw0 extends AnimatorListenerAdapter {
    public final int f30352a;
    public final zw0 f30353b;

    public yw0(zw0 zw0Var, int i10) {
        this.f30352a = i10;
        this.f30353b = zw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30352a) {
            case 0:
                this.f30353b.f30681s.setVisibility(8);
                return;
            case 1:
                this.f30353b.f30681s.setVisibility(8);
                return;
            default:
                this.f30353b.f30681s.setVisibility(8);
                return;
        }
    }
}
