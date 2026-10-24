package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ri;
public final class d6 extends AnimatorListenerAdapter {
    public final ri f34408a;
    public final m6 f34409b;
    public final e6 f34410c;

    public d6(e6 e6Var, ri riVar, m6 m6Var) {
        this.f34410c = e6Var;
        this.f34408a = riVar;
        this.f34409b = m6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34410c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34410c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34408a != null) {
            AndroidUtilities.hideKeyboard(this.f34409b);
        }
    }
}
