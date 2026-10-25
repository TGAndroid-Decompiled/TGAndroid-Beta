package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class c6 extends AnimatorListenerAdapter {
    public final ti f36426a;
    public final l6 f36427b;
    public final d6 f36428c;

    public c6(d6 d6Var, ti tiVar, l6 l6Var) {
        this.f36428c = d6Var;
        this.f36426a = tiVar;
        this.f36427b = l6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f36428c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36428c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f36426a != null) {
            AndroidUtilities.hideKeyboard(this.f36427b);
        }
    }
}
