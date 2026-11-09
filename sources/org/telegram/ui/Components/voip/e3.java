package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class e3 extends AnimatorListenerAdapter {
    public final f3 f39271a;

    public e3(f3 f3Var) {
        this.f39271a = f3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z9) {
        f3 f3Var = this.f39271a;
        f3Var.f39290e = f3Var.f39289c;
        f3Var.f39291f = f3Var.d;
        SecureRandom secureRandom = Utilities.f21334b;
        f3Var.f39289c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        f3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = f3Var.f39288b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
