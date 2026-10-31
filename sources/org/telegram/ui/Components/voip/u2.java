package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class u2 extends AnimatorListenerAdapter {
    public final v2 f31683a;

    public u2(v2 v2Var) {
        this.f31683a = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        v2 v2Var = this.f31683a;
        v2Var.e = v2Var.f31697c;
        v2Var.f31698f = v2Var.d;
        SecureRandom secureRandom = Utilities.f14519b;
        v2Var.f31697c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        v2Var.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        ValueAnimator valueAnimator = v2Var.f31696b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
