package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class by0 extends AnimatorListenerAdapter {
    public final int f25039a;
    public final cy0 f25040b;

    public by0(cy0 cy0Var, int i10) {
        this.f25039a = i10;
        this.f25040b = cy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25039a) {
            case 0:
                this.f25040b.f25355s.setVisibility(8);
                return;
            case 1:
                this.f25040b.f25355s.setVisibility(8);
                return;
            default:
                this.f25040b.f25355s.setVisibility(8);
                return;
        }
    }
}
