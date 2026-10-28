package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ih1 extends AnimatorListenerAdapter {
    public final rh1 f40187a;

    public ih1(rh1 rh1Var) {
        this.f40187a = rh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rh1 rh1Var = this.f40187a;
        rh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        rh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
