package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.d20;
import org.telegram.messenger.zs;
public final class m4 extends AnimatorListenerAdapter {
    public final int f20585a;
    public final q4 f20586b;

    public m4(q4 q4Var, int i10) {
        this.f20585a = i10;
        this.f20586b = q4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20585a) {
            case 0:
                zs.f(d20.f15147s0).d(new lg.s(this, 26));
                return;
            default:
                zs.f(d20.f15147s0).d(new lg.s(this, 27));
                return;
        }
    }
}
