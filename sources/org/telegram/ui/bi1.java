package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bi1 extends AnimatorListenerAdapter {
    public final ki1 f32373a;

    public bi1(ki1 ki1Var) {
        this.f32373a = ki1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ki1 ki1Var = this.f32373a;
        ki1Var.E.setText(LocaleController.getString(R.string.VoipCallEnded));
        ki1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
    }
}
