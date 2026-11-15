package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
public final class d4 extends AnimatorListenerAdapter {
    public final int f28505a;
    public final g4 f28506b;

    public d4(g4 g4Var, int i7) {
        this.f28505a = i7;
        this.f28506b = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28505a) {
            case 0:
                ns.f(m10.f24934t0).d(new r0(this, 9));
                return;
            default:
                ns.f(m10.f24934t0).d(new r0(this, 10));
                return;
        }
    }
}
