package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ki1 extends AnimatorListenerAdapter {
    public final ti1 f35194a;

    public ki1(ti1 ti1Var) {
        this.f35194a = ti1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ti1 ti1Var = this.f35194a;
        ti1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ti1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
