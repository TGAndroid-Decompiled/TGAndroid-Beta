package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f35008a;
    public final m6 f35009b;
    public final v9 f35010c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f35010c = v9Var;
        this.f35008a = tiVar;
        this.f35009b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35010c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35010c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35008a != null) {
            AndroidUtilities.hideKeyboard(this.f35009b);
        }
    }
}
