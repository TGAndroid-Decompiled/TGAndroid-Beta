package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.hs;
public final class p2 extends AnimatorListenerAdapter {
    public final int f28417a;
    public final q2 f28418b;

    public p2(q2 q2Var, int i3) {
        this.f28417a = i3;
        this.f28418b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f28417a;
        q2 q2Var = this.f28418b;
        switch (i3) {
            case 0:
                AnimatorSet animatorSet = q2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q2Var.h = null;
                }
                hs.e().k(99, 512);
                return;
            case 1:
                q2Var.E = 0.0f;
                t2 t2Var = q2Var.H;
                t2Var.f28586b.setTranslationX(0.0f);
                t2Var.f28589c.invalidate();
                return;
            case 2:
                t2 t2Var2 = q2Var.H;
                t2Var2.O0 = true;
                t2Var2.f28586b.setTranslationX(q2Var.getMeasuredWidth());
                t2Var2.dismiss();
                t2Var2.f28589c.invalidate();
                return;
            default:
                q2Var.H.f28586b.setTranslationY(0.0f);
                q2Var.H.h0();
                t2 t2Var3 = q2Var.H;
                t2Var3.q0(t2Var3.f28586b.getTranslationY());
                q2Var.invalidate();
                return;
        }
    }
}
