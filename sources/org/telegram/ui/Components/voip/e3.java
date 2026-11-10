package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class e3 extends AnimatorListenerAdapter {
    public final f3 f39191a;

    public e3(f3 f3Var) {
        this.f39191a = f3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z9) {
        f3 f3Var = this.f39191a;
        f3Var.f39210e = f3Var.f39209c;
        f3Var.f39211f = f3Var.d;
        SecureRandom secureRandom = Utilities.f21339b;
        f3Var.f39209c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        f3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = f3Var.f39208b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
