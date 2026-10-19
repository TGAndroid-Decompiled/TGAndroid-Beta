package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f31613a;
    public final n2 f31614b;

    public m2(n2 n2Var, int i10) {
        this.f31613a = i10;
        this.f31614b = n2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31613a) {
            case 0:
                this.f31614b.f31635b.setVisibility(8);
                return;
            default:
                this.f31614b.f31636c.setVisibility(8);
                return;
        }
    }
}
