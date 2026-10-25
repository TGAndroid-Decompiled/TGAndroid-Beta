package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class u9 extends AnimatorListenerAdapter {
    public final ti f37356a;
    public final l6 f37357b;
    public final v9 f37358c;

    public u9(v9 v9Var, ti tiVar, l6 l6Var) {
        this.f37358c = v9Var;
        this.f37356a = tiVar;
        this.f37357b = l6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f37358c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37358c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f37356a != null) {
            AndroidUtilities.hideKeyboard(this.f37357b);
        }
    }
}
