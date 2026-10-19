package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f34998a;
    public final m6 f34999b;
    public final v9 f35000c;

    public u9(v9 v9Var, ti tiVar, m6 m6Var) {
        this.f35000c = v9Var;
        this.f34998a = tiVar;
        this.f34999b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35000c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35000c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34998a != null) {
            AndroidUtilities.hideKeyboard(this.f34999b);
        }
    }
}
