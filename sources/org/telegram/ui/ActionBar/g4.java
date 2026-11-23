package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
public final class g4 extends AnimatorListenerAdapter {
    public final int f29043a;
    public final j4 f29044b;

    public g4(j4 j4Var, int i7) {
        this.f29043a = i7;
        this.f29044b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29043a) {
            case 0:
                ks.f(i10.f24637t0).d(new oi.c2(this, 13));
                return;
            default:
                ks.f(i10.f24637t0).d(new oi.c2(this, 14));
                return;
        }
    }
}
