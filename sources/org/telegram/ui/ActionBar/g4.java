package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
public final class g4 extends AnimatorListenerAdapter {
    public final int f28984a;
    public final j4 f28985b;

    public g4(j4 j4Var, int i7) {
        this.f28984a = i7;
        this.f28985b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28984a) {
            case 0:
                ls.f(k10.f24968t0).d(new oi.c2(this, 13));
                return;
            default:
                ls.f(k10.f24968t0).d(new oi.c2(this, 14));
                return;
        }
    }
}
