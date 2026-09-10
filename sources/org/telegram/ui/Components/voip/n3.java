package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n3 extends AnimatorListenerAdapter {
    public final o3 f28292a;

    public n3(o3 o3Var) {
        this.f28292a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        o3 o3Var = this.f28292a;
        o3Var.e = o3Var.f28314c;
        o3Var.f28315f = o3Var.d;
        o3Var.f28314c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        o3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = o3Var.f28313b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
