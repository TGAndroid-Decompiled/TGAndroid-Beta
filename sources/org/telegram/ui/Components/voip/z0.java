package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class z0 extends AnimatorListenerAdapter {
    public final int f29689a;
    public final d1 f29690b;

    public z0(d1 d1Var, int i10) {
        this.f29689a = i10;
        this.f29690b = d1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29689a) {
            case 0:
                super.onAnimationEnd(animator);
                d1 d1Var = this.f29690b;
                if (d1Var.getParent() != null) {
                    ((ViewGroup) d1Var.getParent()).removeView(d1Var);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f29690b;
                if (d1Var2.getParent() != null) {
                    ((ViewGroup) d1Var2.getParent()).removeView(d1Var2);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                d1 d1Var3 = this.f29690b;
                if (d1Var3.getParent() != null) {
                    ((ViewGroup) d1Var3.getParent()).removeView(d1Var3);
                    return;
                }
                return;
        }
    }
}
