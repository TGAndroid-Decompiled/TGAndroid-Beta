package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class l40 extends AnimatorListenerAdapter {

    public final int f39937a;

    public final s50 f39938b;

    public l40(s50 s50Var, int i10) {
        this.f39937a = i10;
        this.f39938b = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39937a) {
            case 0:
                s50 s50Var = this.f39938b;
                s50Var.R.setVisibility(4);
                s50Var.S.setVisibility(4);
                s50Var.Q.setVisibility(4);
                break;
            case 1:
                this.f39938b.f42422d0 = null;
                break;
            default:
                s50 s50Var2 = this.f39938b;
                s50Var2.f42423d1 = null;
                s50Var2.f42419c1.setColor(s50Var2.P1 == 3 ? -1163700 : -12761513);
                s50Var2.f42414b1.invalidate();
                break;
        }
    }
}
