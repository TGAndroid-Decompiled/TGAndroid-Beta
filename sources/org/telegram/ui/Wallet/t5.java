package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yi;
public final class t5 extends AnimatorListenerAdapter {
    public final yi f35481a;
    public final b6 f35482b;
    public final u5 f35483c;

    public t5(u5 u5Var, yi yiVar, b6 b6Var) {
        this.f35483c = u5Var;
        this.f35481a = yiVar;
        this.f35482b = b6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35483c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35483c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35481a != null) {
            AndroidUtilities.hideKeyboard(this.f35482b);
        }
    }
}
