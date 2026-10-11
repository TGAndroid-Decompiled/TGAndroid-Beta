package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f31652a;
    public final w20 f31653b;

    public v20(w20 w20Var, int i10) {
        this.f31652a = i10;
        this.f31653b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31652a) {
            case 0:
                w20 w20Var = this.f31653b;
                NotificationCenter.getInstance(w20Var.f32559r.f32803a).onAnimationFinish(w20Var.f32557f);
                w20Var.requestLayout();
                return;
            default:
                w20 w20Var2 = this.f31653b;
                w20Var2.d = null;
                w20Var2.f32553a = null;
                w20Var2.f32554b = false;
                return;
        }
    }
}
