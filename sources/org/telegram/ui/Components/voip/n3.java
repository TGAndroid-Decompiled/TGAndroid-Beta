package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n3 extends AnimatorListenerAdapter {
    public final o3 f29809a;

    public n3(o3 o3Var) {
        this.f29809a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z4) {
        o3 o3Var = this.f29809a;
        o3Var.e = o3Var.f29831c;
        o3Var.f29832f = o3Var.d;
        o3Var.f29831c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        o3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = o3Var.f29830b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
