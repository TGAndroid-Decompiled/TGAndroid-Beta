package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class v20 extends AnimatorListenerAdapter {
    public final int f31792a;
    public final w20 f31793b;

    public v20(w20 w20Var, int i10) {
        this.f31792a = i10;
        this.f31793b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31792a) {
            case 0:
                w20 w20Var = this.f31793b;
                NotificationCenter.getInstance(w20Var.f32612r.f32846a).onAnimationFinish(w20Var.f32610f);
                w20Var.requestLayout();
                return;
            default:
                w20 w20Var2 = this.f31793b;
                w20Var2.d = null;
                w20Var2.f32606a = null;
                w20Var2.f32607b = false;
                return;
        }
    }
}
