package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vi;
public final class v8 extends AnimatorListenerAdapter {
    public final vi f33785a;
    public final b6 f33786b;
    public final w8 f33787c;

    public v8(w8 w8Var, vi viVar, b6 b6Var) {
        this.f33787c = w8Var;
        this.f33785a = viVar;
        this.f33786b = b6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f33787c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f33787c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f33785a != null) {
            AndroidUtilities.hideKeyboard(this.f33786b);
        }
    }
}
