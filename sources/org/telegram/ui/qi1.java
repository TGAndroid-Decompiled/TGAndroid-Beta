package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qi1 extends AnimatorListenerAdapter {
    public final zi1 f36072a;

    public qi1(zi1 zi1Var) {
        this.f36072a = zi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zi1 zi1Var = this.f36072a;
        zi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        zi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
