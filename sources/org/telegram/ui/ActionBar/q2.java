package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ns;
public final class q2 extends AnimatorListenerAdapter {
    public final int f29531a;
    public final r2 f29532b;

    public q2(r2 r2Var, int i7) {
        this.f29531a = i7;
        this.f29532b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29531a;
        r2 r2Var = this.f29532b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = r2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r2Var.h = null;
                }
                ns.e().k(99, 512);
                return;
            case 1:
                r2Var.E = 0.0f;
                u2 u2Var = r2Var.H;
                u2Var.f29682b.setTranslationX(0.0f);
                u2Var.f29685c.invalidate();
                return;
            case 2:
                u2 u2Var2 = r2Var.H;
                u2Var2.O0 = true;
                u2Var2.f29682b.setTranslationX(r2Var.getMeasuredWidth());
                u2Var2.dismiss();
                u2Var2.f29685c.invalidate();
                return;
            default:
                r2Var.H.f29682b.setTranslationY(0.0f);
                r2Var.H.h0();
                u2 u2Var3 = r2Var.H;
                u2Var3.q0(u2Var3.f29682b.getTranslationY());
                r2Var.invalidate();
                return;
        }
    }
}
