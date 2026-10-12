package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f27954a;
    public final pg0 f27955b;

    public og0(pg0 pg0Var, int i10) {
        this.f27954a = i10;
        this.f27955b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27954a) {
            case 0:
                this.f27955b.f28309a.f28595n.setVisibility(8);
                return;
            default:
                this.f27955b.f28309a.h.setVisibility(8);
                return;
        }
    }
}
