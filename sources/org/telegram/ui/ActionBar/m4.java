package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
public final class m4 extends AnimatorListenerAdapter {
    public final int f20586a;
    public final q4 f20587b;

    public m4(q4 q4Var, int i10) {
        this.f20586a = i10;
        this.f20587b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20586a) {
            case 0:
                at.f(e20.f15506s0).d(new lg.s(this, 26));
                return;
            default:
                at.f(e20.f15506s0).d(new lg.s(this, 27));
                return;
        }
    }
}
