package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f35009a;
    public final m6 f35010b;
    public final v9 f35011c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f35011c = v9Var;
        this.f35009a = tiVar;
        this.f35010b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35011c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35011c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35009a != null) {
            AndroidUtilities.hideKeyboard(this.f35010b);
        }
    }
}
