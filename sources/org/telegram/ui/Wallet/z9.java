package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class z9 extends AnimatorListenerAdapter {
    public final ti f35240a;
    public final s6 f35241b;
    public final aa f35242c;

    public z9(aa aaVar, ti tiVar, s6 s6Var) {
        this.f35242c = aaVar;
        this.f35240a = tiVar;
        this.f35241b = s6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35242c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35242c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35240a != null) {
            AndroidUtilities.hideKeyboard(this.f35241b);
        }
    }
}
