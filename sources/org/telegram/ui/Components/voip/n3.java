package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n3 extends AnimatorListenerAdapter {
    public final o3 f32179a;

    public n3(o3 o3Var) {
        this.f32179a = o3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        o3 o3Var = this.f32179a;
        o3Var.f32190e = o3Var.f32189c;
        o3Var.f32191f = o3Var.d;
        o3Var.f32189c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        o3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = o3Var.f32188b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
