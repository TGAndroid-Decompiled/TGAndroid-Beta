package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class w5 extends AnimatorListenerAdapter {
    public final yi f35666a;
    public final e6 f35667b;
    public final x5 f35668c;

    public w5(x5 x5Var, yi yiVar, e6 e6Var) {
        this.f35668c = x5Var;
        this.f35666a = yiVar;
        this.f35667b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35668c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35668c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35666a != null) {
            AndroidUtilities.hideKeyboard(this.f35667b);
        }
    }
}
