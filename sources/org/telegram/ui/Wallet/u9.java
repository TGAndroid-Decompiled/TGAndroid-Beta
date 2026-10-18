package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f34978a;
    public final m6 f34979b;
    public final v9 f34980c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f34980c = v9Var;
        this.f34978a = tiVar;
        this.f34979b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34980c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34980c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34978a != null) {
            AndroidUtilities.hideKeyboard(this.f34979b);
        }
    }
}
