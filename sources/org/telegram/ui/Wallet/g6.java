package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class g6 extends AnimatorListenerAdapter {
    public final ti f34230a;
    public final p6 f34231b;
    public final h6 f34232c;

    public g6(h6 h6Var, ti tiVar, p6 p6Var) {
        this.f34232c = h6Var;
        this.f34230a = tiVar;
        this.f34231b = p6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34232c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34232c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34230a != null) {
            AndroidUtilities.hideKeyboard(this.f34231b);
        }
    }
}
