package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l3 extends AnimatorListenerAdapter {
    public final m3 f31640a;

    public l3(m3 m3Var) {
        this.f31640a = m3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        m3 m3Var = this.f31640a;
        m3Var.f31653e = m3Var.f31652c;
        m3Var.f31654f = m3Var.d;
        m3Var.f31652c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        m3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = m3Var.f31651b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
