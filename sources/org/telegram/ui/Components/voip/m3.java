package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m3 extends AnimatorListenerAdapter {
    public final n3 f30332a;

    public m3(n3 n3Var) {
        this.f30332a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        n3 n3Var = this.f30332a;
        n3Var.e = n3Var.f30341c;
        n3Var.f30342f = n3Var.d;
        n3Var.f30341c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        n3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = n3Var.f30340b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
