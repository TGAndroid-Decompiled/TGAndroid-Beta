package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti;
public final class j6 extends AnimatorListenerAdapter {
    public final ti f34360a;
    public final s6 f34361b;
    public final k6 f34362c;

    public j6(k6 k6Var, ti tiVar, s6 s6Var) {
        this.f34362c = k6Var;
        this.f34360a = tiVar;
        this.f34361b = s6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34362c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34362c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34360a != null) {
            AndroidUtilities.hideKeyboard(this.f34361b);
        }
    }
}
