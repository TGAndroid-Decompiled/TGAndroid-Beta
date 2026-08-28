package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m3 extends AnimatorListenerAdapter {
    public final n3 f33672a;

    public m3(n3 n3Var) {
        this.f33672a = n3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator, boolean z10) {
        n3 n3Var = this.f33672a;
        n3Var.f33702e = n3Var.f33701c;
        n3Var.f33703f = n3Var.d;
        n3Var.f33701c = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        n3Var.d = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        ValueAnimator valueAnimator = n3Var.f33700b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
