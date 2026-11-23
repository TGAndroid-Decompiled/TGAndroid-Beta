package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ks;
public final class s2 extends AnimatorListenerAdapter {
    public final int f30043a;
    public final t2 f30044b;

    public s2(t2 t2Var, int i7) {
        this.f30043a = i7;
        this.f30044b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f30043a;
        t2 t2Var = this.f30044b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = t2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.h = null;
                }
                ks.e().k(99, 512);
                return;
            case 1:
                t2Var.E = 0.0f;
                w2 w2Var = t2Var.H;
                w2Var.f30226b.setTranslationX(0.0f);
                w2Var.f30229c.invalidate();
                return;
            case 2:
                w2 w2Var2 = t2Var.H;
                w2Var2.O0 = true;
                w2Var2.f30226b.setTranslationX(t2Var.getMeasuredWidth());
                w2Var2.dismiss();
                w2Var2.f30229c.invalidate();
                return;
            default:
                t2Var.H.f30226b.setTranslationY(0.0f);
                t2Var.H.h0();
                w2 w2Var3 = t2Var.H;
                w2Var3.q0(w2Var3.f30226b.getTranslationY());
                t2Var.invalidate();
                return;
        }
    }
}
