package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class di1 extends AnimatorListenerAdapter {
    public final mi1 f33130a;

    public di1(mi1 mi1Var) {
        this.f33130a = mi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mi1 mi1Var = this.f33130a;
        mi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        mi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
