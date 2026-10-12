package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj;
public final class w5 extends AnimatorListenerAdapter {
    public final aj f35478a;
    public final e6 f35479b;
    public final x5 f35480c;

    public w5(x5 x5Var, aj ajVar, e6 e6Var) {
        this.f35480c = x5Var;
        this.f35478a = ajVar;
        this.f35479b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35480c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35480c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35478a != null) {
            AndroidUtilities.hideKeyboard(this.f35479b);
        }
    }
}
