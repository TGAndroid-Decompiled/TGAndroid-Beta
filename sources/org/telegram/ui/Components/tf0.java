package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tf0 extends AnimatorListenerAdapter {
    public final int f31174a;
    public final vf0 f31175b;

    public tf0(vf0 vf0Var, int i10) {
        this.f31174a = i10;
        this.f31175b = vf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31174a) {
            case 0:
                this.f31175b.f31774s = null;
                return;
            default:
                this.f31175b.v = null;
                return;
        }
    }
}
