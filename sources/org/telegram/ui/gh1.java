package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gh1 extends AnimatorListenerAdapter {
    public final ph1 f39695a;

    public gh1(ph1 ph1Var) {
        this.f39695a = ph1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ph1 ph1Var = this.f39695a;
        ph1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ph1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
