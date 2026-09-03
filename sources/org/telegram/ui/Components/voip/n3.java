package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n3 extends AnimatorListenerAdapter {
    public final o3 f29781a;

    public n3(o3 o3Var) {
        this.f29781a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z4) {
        o3 o3Var = this.f29781a;
        o3Var.e = o3Var.f29803c;
        o3Var.f29804f = o3Var.d;
        o3Var.f29803c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        o3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = o3Var.f29802b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
