package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class d6 extends AnimatorListenerAdapter {
    public final ti f34113a;
    public final m6 f34114b;
    public final e6 f34115c;

    public d6(e6 e6Var, ti tiVar, m6 m6Var) {
        this.f34115c = e6Var;
        this.f34113a = tiVar;
        this.f34114b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34115c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34115c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34113a != null) {
            AndroidUtilities.hideKeyboard(this.f34114b);
        }
    }
}
