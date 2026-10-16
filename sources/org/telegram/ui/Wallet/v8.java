package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vi;
public final class v8 extends AnimatorListenerAdapter {
    public final vi f33529a;
    public final c6 f33530b;
    public final w8 f33531c;

    public v8(w8 w8Var, vi viVar, c6 c6Var) {
        this.f33531c = w8Var;
        this.f33529a = viVar;
        this.f33530b = c6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f33531c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33531c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f33529a != null) {
            AndroidUtilities.hideKeyboard(this.f33530b);
        }
    }
}
