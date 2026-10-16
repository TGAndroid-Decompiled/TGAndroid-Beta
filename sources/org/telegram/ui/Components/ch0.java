package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch0 extends AnimatorListenerAdapter {
    public final int f23729a;
    public final fh0 f23730b;

    public ch0(fh0 fh0Var, int i10) {
        this.f23729a = i10;
        this.f23730b = fh0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23729a) {
            case 0:
                this.f23730b.F = null;
                return;
            default:
                this.f23730b.u();
                return;
        }
    }
}
