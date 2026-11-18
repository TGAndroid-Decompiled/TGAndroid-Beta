package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
public final class h4 extends AnimatorListenerAdapter {
    public final int f29000a;
    public final k4 f29001b;

    public h4(k4 k4Var, int i7) {
        this.f29000a = i7;
        this.f29001b = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29000a) {
            case 0:
                ks.f(j10.f24773t0).d(new oi.a2(this, 13));
                return;
            default:
                ks.f(j10.f24773t0).d(new oi.a2(this, 14));
                return;
        }
    }
}
