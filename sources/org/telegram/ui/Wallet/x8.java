package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class x8 extends AnimatorListenerAdapter {
    public final yi f35756a;
    public final e6 f35757b;
    public final y8 f35758c;

    public x8(y8 y8Var, yi yiVar, e6 e6Var) {
        this.f35758c = y8Var;
        this.f35756a = yiVar;
        this.f35757b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35758c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35758c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35756a != null) {
            AndroidUtilities.hideKeyboard(this.f35757b);
        }
    }
}
