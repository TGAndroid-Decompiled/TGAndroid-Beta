package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj;
public final class w5 extends AnimatorListenerAdapter {
    public final aj f35476a;
    public final e6 f35477b;
    public final x5 f35478c;

    public w5(x5 x5Var, aj ajVar, e6 e6Var) {
        this.f35478c = x5Var;
        this.f35476a = ajVar;
        this.f35477b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35478c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35478c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35476a != null) {
            AndroidUtilities.hideKeyboard(this.f35477b);
        }
    }
}
