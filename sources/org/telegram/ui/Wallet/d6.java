package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class d6 extends AnimatorListenerAdapter {
    public final ti f36488a;
    public final m6 f36489b;
    public final e6 f36490c;

    public d6(e6 e6Var, ti tiVar, m6 m6Var) {
        this.f36490c = e6Var;
        this.f36488a = tiVar;
        this.f36489b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f36490c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36490c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f36488a != null) {
            AndroidUtilities.hideKeyboard(this.f36489b);
        }
    }
}
