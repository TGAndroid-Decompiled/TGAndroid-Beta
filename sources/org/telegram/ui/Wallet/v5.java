package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class v5 extends AnimatorListenerAdapter {
    public final yi f35636a;
    public final d6 f35637b;
    public final w5 f35638c;

    public v5(w5 w5Var, yi yiVar, d6 d6Var) {
        this.f35638c = w5Var;
        this.f35636a = yiVar;
        this.f35637b = d6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35638c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35638c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35636a != null) {
            AndroidUtilities.hideKeyboard(this.f35637b);
        }
    }
}
