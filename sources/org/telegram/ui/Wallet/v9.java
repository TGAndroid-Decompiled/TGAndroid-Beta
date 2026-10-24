package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ri;
public final class v9 extends AnimatorListenerAdapter {
    public final ri f35332a;
    public final m6 f35333b;
    public final w9 f35334c;

    public v9(w9 w9Var, ri riVar, m6 m6Var) {
        this.f35334c = w9Var;
        this.f35332a = riVar;
        this.f35333b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35334c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35334c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35332a != null) {
            AndroidUtilities.hideKeyboard(this.f35333b);
        }
    }
}
