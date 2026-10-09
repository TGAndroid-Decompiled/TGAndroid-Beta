package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class v8 extends AnimatorListenerAdapter {
    public final yi f35598a;
    public final c6 f35599b;
    public final w8 f35600c;

    public v8(w8 w8Var, yi yiVar, c6 c6Var) {
        this.f35600c = w8Var;
        this.f35598a = yiVar;
        this.f35599b = c6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35600c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35600c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35598a != null) {
            AndroidUtilities.hideKeyboard(this.f35599b);
        }
    }
}
