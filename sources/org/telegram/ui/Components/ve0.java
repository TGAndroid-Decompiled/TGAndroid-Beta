package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f29104a;
    public final ze0 f29105b;

    public ve0(ze0 ze0Var, int i10) {
        this.f29104a = i10;
        this.f29105b = ze0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29104a) {
            case 0:
                this.f29105b.f30911x = null;
                return;
            default:
                this.f29105b.f30912y = null;
                return;
        }
    }
}
