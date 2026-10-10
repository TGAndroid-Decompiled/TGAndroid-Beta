package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f31710a;
    public final w20 f31711b;

    public v20(w20 w20Var, int i10) {
        this.f31710a = i10;
        this.f31711b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31710a) {
            case 0:
                w20 w20Var = this.f31711b;
                NotificationCenter.getInstance(w20Var.f32575r.f32816a).onAnimationFinish(w20Var.f32573f);
                w20Var.requestLayout();
                return;
            default:
                w20 w20Var2 = this.f31711b;
                w20Var2.d = null;
                w20Var2.f32569a = null;
                w20Var2.f32570b = false;
                return;
        }
    }
}
