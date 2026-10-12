package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oi1 extends AnimatorListenerAdapter {
    public final xi1 f40731a;

    public oi1(xi1 xi1Var) {
        this.f40731a = xi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xi1 xi1Var = this.f40731a;
        xi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        xi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
