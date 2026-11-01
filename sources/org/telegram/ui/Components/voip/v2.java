package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class v2 extends AnimatorListenerAdapter {
    public final w2 f31763a;

    public v2(w2 w2Var) {
        this.f31763a = w2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        w2 w2Var = this.f31763a;
        w2Var.e = w2Var.f31777c;
        w2Var.f31778f = w2Var.d;
        SecureRandom secureRandom = Utilities.f14520b;
        w2Var.f31777c = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        w2Var.d = org.telegram.messenger.i0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.i0.L(16.0f));
        ValueAnimator valueAnimator = w2Var.f31776b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
