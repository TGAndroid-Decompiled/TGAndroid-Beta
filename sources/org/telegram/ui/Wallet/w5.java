package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class w5 extends AnimatorListenerAdapter {
    public final yi f35700a;
    public final e6 f35701b;
    public final x5 f35702c;

    public w5(x5 x5Var, yi yiVar, e6 e6Var) {
        this.f35702c = x5Var;
        this.f35700a = yiVar;
        this.f35701b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35702c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35702c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35700a != null) {
            AndroidUtilities.hideKeyboard(this.f35701b);
        }
    }
}
