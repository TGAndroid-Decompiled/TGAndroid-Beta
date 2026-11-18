package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ks;
public final class t2 extends AnimatorListenerAdapter {
    public final int f29995a;
    public final u2 f29996b;

    public t2(u2 u2Var, int i7) {
        this.f29995a = i7;
        this.f29996b = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29995a;
        u2 u2Var = this.f29996b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = u2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.h = null;
                }
                ks.e().k(99, 512);
                return;
            case 1:
                u2Var.E = 0.0f;
                x2 x2Var = u2Var.H;
                x2Var.f30190b.setTranslationX(0.0f);
                x2Var.f30193c.invalidate();
                return;
            case 2:
                x2 x2Var2 = u2Var.H;
                x2Var2.O0 = true;
                x2Var2.f30190b.setTranslationX(u2Var.getMeasuredWidth());
                x2Var2.dismiss();
                x2Var2.f30193c.invalidate();
                return;
            default:
                u2Var.H.f30190b.setTranslationY(0.0f);
                u2Var.H.h0();
                x2 x2Var3 = u2Var.H;
                x2Var3.q0(x2Var3.f30190b.getTranslationY());
                u2Var.invalidate();
                return;
        }
    }
}
