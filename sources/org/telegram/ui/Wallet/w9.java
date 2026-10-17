package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class w9 extends AnimatorListenerAdapter {
    public final ti f35104a;
    public final p6 f35105b;
    public final x9 f35106c;

    public w9(x9 x9Var, ti tiVar, p6 p6Var) {
        this.f35106c = x9Var;
        this.f35104a = tiVar;
        this.f35105b = p6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35106c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35106c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35104a != null) {
            AndroidUtilities.hideKeyboard(this.f35105b);
        }
    }
}
