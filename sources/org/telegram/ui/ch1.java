package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ch1 extends AnimatorListenerAdapter {

    public final lh1 f37095a;

    public ch1(lh1 lh1Var) {
        this.f37095a = lh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        lh1 lh1Var = this.f37095a;
        lh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        lh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
