package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xw0 extends AnimatorListenerAdapter {
    public final int f30081a;
    public final yw0 f30082b;

    public xw0(yw0 yw0Var, int i10) {
        this.f30081a = i10;
        this.f30082b = yw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30081a) {
            case 0:
                this.f30082b.f30424s.setVisibility(8);
                return;
            case 1:
                this.f30082b.f30424s.setVisibility(8);
                return;
            default:
                this.f30082b.f30424s.setVisibility(8);
                return;
        }
    }
}
