package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class li1 extends AnimatorListenerAdapter {
    public final ui1 f38375a;

    public li1(ui1 ui1Var) {
        this.f38375a = ui1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ui1 ui1Var = this.f38375a;
        ui1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ui1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
