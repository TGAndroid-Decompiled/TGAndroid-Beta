package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vi;
public final class u5 extends AnimatorListenerAdapter {
    public final vi f33479a;
    public final c6 f33480b;
    public final v5 f33481c;

    public u5(v5 v5Var, vi viVar, c6 c6Var) {
        this.f33481c = v5Var;
        this.f33479a = viVar;
        this.f33480b = c6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f33481c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33481c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f33479a != null) {
            AndroidUtilities.hideKeyboard(this.f33480b);
        }
    }
}
