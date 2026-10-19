package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class d6 extends AnimatorListenerAdapter {
    public final ti f34105a;
    public final m6 f34106b;
    public final e6 f34107c;

    public d6(e6 e6Var, ti tiVar, m6 m6Var) {
        this.f34107c = e6Var;
        this.f34105a = tiVar;
        this.f34106b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34107c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34107c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34105a != null) {
            AndroidUtilities.hideKeyboard(this.f34106b);
        }
    }
}
