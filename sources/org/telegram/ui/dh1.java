package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dh1 extends AnimatorListenerAdapter {
    public final mh1 f37542a;

    public dh1(mh1 mh1Var) {
        this.f37542a = mh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mh1 mh1Var = this.f37542a;
        mh1Var.A.setText(LocaleController.getString(R.string.VoipCallEnded));
        mh1Var.A.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
