package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p3 extends AnimatorListenerAdapter {
    public final q3 f33928a;

    public p3(q3 q3Var) {
        this.f33928a = q3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        q3 q3Var = this.f33928a;
        q3Var.f33947e = q3Var.f33946c;
        q3Var.f33948f = q3Var.d;
        q3Var.f33946c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        q3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = q3Var.f33945b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
