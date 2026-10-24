package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eh1 extends AnimatorListenerAdapter {
    public final nh1 f36913a;

    public eh1(nh1 nh1Var) {
        this.f36913a = nh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nh1 nh1Var = this.f36913a;
        nh1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        nh1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
