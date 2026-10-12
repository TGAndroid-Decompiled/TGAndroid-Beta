package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj;
public final class x8 extends AnimatorListenerAdapter {
    public final aj f35534a;
    public final e6 f35535b;
    public final y8 f35536c;

    public x8(y8 y8Var, aj ajVar, e6 e6Var) {
        this.f35536c = y8Var;
        this.f35534a = ajVar;
        this.f35535b = e6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35536c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35536c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35534a != null) {
            AndroidUtilities.hideKeyboard(this.f35535b);
        }
    }
}
