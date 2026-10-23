package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fh1 extends AnimatorListenerAdapter {
    public final oh1 f37337a;

    public fh1(oh1 oh1Var) {
        this.f37337a = oh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oh1 oh1Var = this.f37337a;
        oh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        oh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
