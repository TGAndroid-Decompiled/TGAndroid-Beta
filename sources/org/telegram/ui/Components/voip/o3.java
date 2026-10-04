package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o3 extends AnimatorListenerAdapter {
    public final p3 f32044a;

    public o3(p3 p3Var) {
        this.f32044a = p3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        p3 p3Var = this.f32044a;
        p3Var.f32076e = p3Var.f32075c;
        p3Var.f32077f = p3Var.d;
        p3Var.f32075c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        p3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = p3Var.f32074b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
