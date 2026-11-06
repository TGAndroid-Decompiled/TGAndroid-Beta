package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc0 extends AnimatorListenerAdapter {
    public final int f40234a;
    public final ad0 f40235b;

    public xc0(ad0 ad0Var, int i7) {
        this.f40234a = i7;
        this.f40235b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40234a) {
            case 0:
                this.f40235b.f31766t1 = null;
                return;
            default:
                this.f40235b.f31767u1 = null;
                return;
        }
    }
}
