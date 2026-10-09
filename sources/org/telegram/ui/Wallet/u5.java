package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class u5 extends AnimatorListenerAdapter {
    public final yi f35540a;
    public final c6 f35541b;
    public final v5 f35542c;

    public u5(v5 v5Var, yi yiVar, c6 c6Var) {
        this.f35542c = v5Var;
        this.f35540a = yiVar;
        this.f35541b = c6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35542c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35542c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35540a != null) {
            AndroidUtilities.hideKeyboard(this.f35541b);
        }
    }
}
