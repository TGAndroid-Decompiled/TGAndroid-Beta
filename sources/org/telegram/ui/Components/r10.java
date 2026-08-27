package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

public final class r10 extends AnimatorListenerAdapter {

    public final int f32035a;

    public final s10 f32036b;

    public r10(s10 s10Var, int i10) {
        this.f32035a = i10;
        this.f32036b = s10Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32035a) {
            case 0:
                s10 s10Var = this.f32036b;
                NotificationCenter.getInstance(s10Var.f32298r.f32616a).onAnimationFinish(s10Var.f32296f);
                s10Var.requestLayout();
                break;
            default:
                s10 s10Var2 = this.f32036b;
                s10Var2.d = null;
                s10Var2.f32292a = null;
                s10Var2.f32293b = false;
                break;
        }
    }
}
