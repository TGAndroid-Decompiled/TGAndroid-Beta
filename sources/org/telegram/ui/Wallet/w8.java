package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class w8 extends AnimatorListenerAdapter {
    public final yi f35692a;
    public final d6 f35693b;
    public final x8 f35694c;

    public w8(x8 x8Var, yi yiVar, d6 d6Var) {
        this.f35694c = x8Var;
        this.f35692a = yiVar;
        this.f35693b = d6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35694c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35694c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35692a != null) {
            AndroidUtilities.hideKeyboard(this.f35693b);
        }
    }
}
