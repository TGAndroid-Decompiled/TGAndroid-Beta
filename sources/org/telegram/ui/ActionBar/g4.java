package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
public final class g4 extends AnimatorListenerAdapter {
    public final int f28950a;
    public final j4 f28951b;

    public g4(j4 j4Var, int i7) {
        this.f28950a = i7;
        this.f28951b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28950a) {
            case 0:
                ls.f(k10.f24932t0).d(new org.telegram.tgnet.m(this, 12));
                return;
            default:
                ls.f(k10.f24932t0).d(new org.telegram.tgnet.m(this, 13));
                return;
        }
    }
}
