package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg0 extends AnimatorListenerAdapter {
    public final int f25116a;
    public final lg0 f25117b;

    public gg0(lg0 lg0Var, int i10) {
        this.f25116a = i10;
        this.f25117b = lg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25116a) {
            case 0:
                this.f25117b.C = null;
                return;
            default:
                this.f25117b.u();
                return;
        }
    }
}
