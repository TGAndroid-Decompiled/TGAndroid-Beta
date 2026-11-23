package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class h3 extends AnimatorListenerAdapter {
    public final i3 f41011a;

    public h3(i3 i3Var) {
        this.f41011a = i3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        i3 i3Var = this.f41011a;
        i3Var.f41030e = i3Var.f41029c;
        i3Var.f41031f = i3Var.d;
        SecureRandom secureRandom = Utilities.f22772b;
        i3Var.f41029c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        i3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = i3Var.f41028b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
