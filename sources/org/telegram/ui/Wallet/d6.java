package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class d6 extends AnimatorListenerAdapter {
    public final ti f34118a;
    public final m6 f34119b;
    public final e6 f34120c;

    public d6(e6 e6Var, ti tiVar, m6 m6Var) {
        this.f34120c = e6Var;
        this.f34118a = tiVar;
        this.f34119b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34120c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34120c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34118a != null) {
            AndroidUtilities.hideKeyboard(this.f34119b);
        }
    }
}
