package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vi;
public final class t5 extends AnimatorListenerAdapter {
    public final vi f33705a;
    public final b6 f33706b;
    public final u5 f33707c;

    public t5(u5 u5Var, vi viVar, b6 b6Var) {
        this.f33707c = u5Var;
        this.f33705a = viVar;
        this.f33706b = b6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f33707c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33707c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f33705a != null) {
            AndroidUtilities.hideKeyboard(this.f33706b);
        }
    }
}
