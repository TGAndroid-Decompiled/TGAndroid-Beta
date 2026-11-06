package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.qs;
public final class r2 extends AnimatorListenerAdapter {
    public final int f28454a;
    public final s2 f28455b;

    public r2(s2 s2Var, int i7) {
        this.f28454a = i7;
        this.f28455b = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28454a;
        s2 s2Var = this.f28455b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = s2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    s2Var.h = null;
                }
                qs.e().k(99, 512);
                return;
            case 1:
                s2Var.D = 0.0f;
                v2 v2Var = s2Var.G;
                v2Var.f28616b.setTranslationX(0.0f);
                v2Var.f28619c.invalidate();
                return;
            case 2:
                v2 v2Var2 = s2Var.G;
                v2Var2.N0 = true;
                v2Var2.f28616b.setTranslationX(s2Var.getMeasuredWidth());
                v2Var2.dismiss();
                v2Var2.f28619c.invalidate();
                return;
            default:
                s2Var.G.f28616b.setTranslationY(0.0f);
                s2Var.G.h0();
                v2 v2Var3 = s2Var.G;
                v2Var3.q0(v2Var3.f28616b.getTranslationY());
                s2Var.invalidate();
                return;
        }
    }
}
