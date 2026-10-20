package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f35004a;
    public final m6 f35005b;
    public final v9 f35006c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f35006c = v9Var;
        this.f35004a = tiVar;
        this.f35005b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35006c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35006c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35004a != null) {
            AndroidUtilities.hideKeyboard(this.f35005b);
        }
    }
}
