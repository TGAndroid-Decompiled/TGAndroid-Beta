package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
public final class h4 extends AnimatorListenerAdapter {
    public final int f28998a;
    public final k4 f28999b;

    public h4(k4 k4Var, int i7) {
        this.f28998a = i7;
        this.f28999b = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28998a) {
            case 0:
                ks.f(j10.f24770t0).d(new oi.a2(this, 13));
                return;
            default:
                ks.f(j10.f24770t0).d(new oi.a2(this, 14));
                return;
        }
    }
}
