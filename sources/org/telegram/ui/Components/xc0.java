package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc0 extends AnimatorListenerAdapter {
    public final int f40287a;
    public final ad0 f40288b;

    public xc0(ad0 ad0Var, int i7) {
        this.f40287a = i7;
        this.f40288b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40287a) {
            case 0:
                this.f40288b.f31835w1 = null;
                return;
            default:
                this.f40288b.f31836x1 = null;
                return;
        }
    }
}
