package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o3 extends AnimatorListenerAdapter {
    public final p3 f32241a;

    public o3(p3 p3Var) {
        this.f32241a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z4) {
        p3 p3Var = this.f32241a;
        p3Var.f32265e = p3Var.f32264c;
        p3Var.f32266f = p3Var.d;
        p3Var.f32264c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        p3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = p3Var.f32263b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
