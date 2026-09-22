package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we0 extends AnimatorListenerAdapter {
    public final int f30009a;
    public final af0 f30010b;

    public we0(af0 af0Var, int i10) {
        this.f30009a = i10;
        this.f30010b = af0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30009a) {
            case 0:
                this.f30010b.f22651x = null;
                return;
            default:
                this.f30010b.f22652y = null;
                return;
        }
    }
}
