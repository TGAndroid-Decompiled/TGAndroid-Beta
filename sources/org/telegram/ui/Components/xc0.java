package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc0 extends AnimatorListenerAdapter {
    public final int f40269a;
    public final ad0 f40270b;

    public xc0(ad0 ad0Var, int i7) {
        this.f40269a = i7;
        this.f40270b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40269a) {
            case 0:
                this.f40270b.f31774t1 = null;
                return;
            default:
                this.f40270b.f31775u1 = null;
                return;
        }
    }
}
