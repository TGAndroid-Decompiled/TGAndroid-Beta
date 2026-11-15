package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class i3 extends AnimatorListenerAdapter {
    public final j3 f40665a;

    public i3(j3 j3Var) {
        this.f40665a = j3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        j3 j3Var = this.f40665a;
        j3Var.f40684e = j3Var.f40683c;
        j3Var.f40685f = j3Var.d;
        SecureRandom secureRandom = Utilities.f22414b;
        j3Var.f40683c = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        j3Var.d = org.telegram.messenger.g0.L(12.0f) + secureRandom.nextInt(org.telegram.messenger.g0.L(16.0f));
        ValueAnimator valueAnimator = j3Var.f40682b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
