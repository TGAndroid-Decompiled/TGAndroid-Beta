package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class v9 extends AnimatorListenerAdapter {
    public final ti f35330a;
    public final m6 f35331b;
    public final w9 f35332c;

    public v9(w9 w9Var, ti tiVar, m6 m6Var) {
        this.f35332c = w9Var;
        this.f35330a = tiVar;
        this.f35331b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35332c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35332c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35330a != null) {
            AndroidUtilities.hideKeyboard(this.f35331b);
        }
    }
}
