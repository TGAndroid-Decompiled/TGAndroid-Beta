package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class c6 extends AnimatorListenerAdapter {
    public final ti f36429a;
    public final l6 f36430b;
    public final d6 f36431c;

    public c6(d6 d6Var, ti tiVar, l6 l6Var) {
        this.f36431c = d6Var;
        this.f36429a = tiVar;
        this.f36430b = l6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f36431c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36431c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f36429a != null) {
            AndroidUtilities.hideKeyboard(this.f36430b);
        }
    }
}
