package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f30630a;
    public final ze0 f30631b;

    public xe0(ze0 ze0Var, int i10) {
        this.f30630a = i10;
        this.f30631b = ze0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30630a) {
            case 0:
                this.f30631b.f31377s = null;
                return;
            default:
                this.f30631b.v = null;
                return;
        }
    }
}
