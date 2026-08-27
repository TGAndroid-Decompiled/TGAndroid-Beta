package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class m3 extends AnimatorListenerAdapter {

    public final n3 f33722a;

    public m3(n3 n3Var) {
        this.f33722a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        n3 n3Var = this.f33722a;
        n3Var.f33752e = n3Var.f33751c;
        n3Var.f33753f = n3Var.d;
        n3Var.f33751c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        n3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = n3Var.f33750b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
