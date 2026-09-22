package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f22773a;
    public final eg0 f22774b;

    public bg0(eg0 eg0Var, int i10) {
        this.f22773a = i10;
        this.f22774b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22773a) {
            case 0:
                this.f22774b.F = null;
                return;
            default:
                this.f22774b.u();
                return;
        }
    }
}
