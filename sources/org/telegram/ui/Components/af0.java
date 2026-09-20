package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class af0 extends AnimatorListenerAdapter {
    public final int f22668a;
    public final cf0 f22669b;

    public af0(cf0 cf0Var, int i10) {
        this.f22668a = i10;
        this.f22669b = cf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22668a) {
            case 0:
                this.f22669b.f23283s = null;
                return;
            default:
                this.f22669b.v = null;
                return;
        }
    }
}
