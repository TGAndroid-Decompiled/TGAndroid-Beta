package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ni1 extends AnimatorListenerAdapter {
    public final wi1 f40222a;

    public ni1(wi1 wi1Var) {
        this.f40222a = wi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wi1 wi1Var = this.f40222a;
        wi1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        wi1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
