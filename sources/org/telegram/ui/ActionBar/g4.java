package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class g4 extends AnimatorListenerAdapter {
    public final int f27503a;
    public final j4 f27504b;

    public g4(j4 j4Var, int i7) {
        this.f27503a = i7;
        this.f27504b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27503a) {
            case 0:
                qs.f(p10.f24474s0).d(new l2.a0(this, 26));
                return;
            default:
                qs.f(p10.f24474s0).d(new l2.a0(this, 27));
                return;
        }
    }
}
