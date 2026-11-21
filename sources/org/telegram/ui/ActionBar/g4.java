package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
public final class g4 extends AnimatorListenerAdapter {
    public final int f28981a;
    public final j4 f28982b;

    public g4(j4 j4Var, int i7) {
        this.f28981a = i7;
        this.f28982b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28981a) {
            case 0:
                ks.f(j10.f24798t0).d(new oi.c2(this, 13));
                return;
            default:
                ks.f(j10.f24798t0).d(new oi.c2(this, 14));
                return;
        }
    }
}
