package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class u8 extends AnimatorListenerAdapter {
    public final yi f35530a;
    public final b6 f35531b;
    public final v8 f35532c;

    public u8(v8 v8Var, yi yiVar, b6 b6Var) {
        this.f35532c = v8Var;
        this.f35530a = yiVar;
        this.f35531b = b6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35532c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35532c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35530a != null) {
            AndroidUtilities.hideKeyboard(this.f35531b);
        }
    }
}
