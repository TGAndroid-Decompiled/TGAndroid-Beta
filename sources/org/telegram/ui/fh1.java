package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fh1 extends AnimatorListenerAdapter {
    public final oh1 f38186a;

    public fh1(oh1 oh1Var) {
        this.f38186a = oh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oh1 oh1Var = this.f38186a;
        oh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        oh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
