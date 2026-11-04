package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class t2 extends AnimatorListenerAdapter {
    public final u2 f39616a;

    public t2(u2 u2Var) {
        this.f39616a = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        u2 u2Var = this.f39616a;
        u2Var.f39635e = u2Var.f39634c;
        u2Var.f39636f = u2Var.d;
        SecureRandom secureRandom = Utilities.f21385b;
        u2Var.f39634c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        u2Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = u2Var.f39633b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
