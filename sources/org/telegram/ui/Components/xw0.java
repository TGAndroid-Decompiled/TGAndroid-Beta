package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xw0 extends AnimatorListenerAdapter {
    public final int f30078a;
    public final yw0 f30079b;

    public xw0(yw0 yw0Var, int i10) {
        this.f30078a = i10;
        this.f30079b = yw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30078a) {
            case 0:
                this.f30079b.f30421s.setVisibility(8);
                return;
            case 1:
                this.f30079b.f30421s.setVisibility(8);
                return;
            default:
                this.f30079b.f30421s.setVisibility(8);
                return;
        }
    }
}
