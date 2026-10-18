package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ah1 extends AnimatorListenerAdapter {
    public final jh1 f35457a;

    public ah1(jh1 jh1Var) {
        this.f35457a = jh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jh1 jh1Var = this.f35457a;
        jh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        jh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
