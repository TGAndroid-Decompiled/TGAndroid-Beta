package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ji1 extends AnimatorListenerAdapter {
    public final si1 f34891a;

    public ji1(si1 si1Var) {
        this.f34891a = si1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        si1 si1Var = this.f34891a;
        si1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        si1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
