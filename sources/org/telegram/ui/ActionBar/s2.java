package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.qs;
public final class s2 extends AnimatorListenerAdapter {
    public final int f28483a;
    public final t2 f28484b;

    public s2(t2 t2Var, int i7) {
        this.f28483a = i7;
        this.f28484b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28483a;
        t2 t2Var = this.f28484b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = t2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.h = null;
                }
                qs.e().k(99, 512);
                return;
            case 1:
                t2Var.D = 0.0f;
                w2 w2Var = t2Var.G;
                w2Var.f28672b.setTranslationX(0.0f);
                w2Var.f28675c.invalidate();
                return;
            case 2:
                w2 w2Var2 = t2Var.G;
                w2Var2.N0 = true;
                w2Var2.f28672b.setTranslationX(t2Var.getMeasuredWidth());
                w2Var2.dismiss();
                w2Var2.f28675c.invalidate();
                return;
            default:
                t2Var.G.f28672b.setTranslationY(0.0f);
                t2Var.G.h0();
                w2 w2Var3 = t2Var.G;
                w2Var3.q0(w2Var3.f28672b.getTranslationY());
                t2Var.invalidate();
                return;
        }
    }
}
