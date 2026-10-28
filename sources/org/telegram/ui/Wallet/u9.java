package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f37383a;
    public final m6 f37384b;
    public final v9 f37385c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f37385c = v9Var;
        this.f37383a = tiVar;
        this.f37384b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f37385c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37385c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f37383a != null) {
            AndroidUtilities.hideKeyboard(this.f37384b);
        }
    }
}
