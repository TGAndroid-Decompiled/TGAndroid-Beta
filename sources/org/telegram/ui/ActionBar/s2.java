package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ls;
public final class s2 extends AnimatorListenerAdapter {
    public final int f29947a;
    public final t2 f29948b;

    public s2(t2 t2Var, int i7) {
        this.f29947a = i7;
        this.f29948b = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29947a;
        t2 t2Var = this.f29948b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = t2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.h = null;
                }
                ls.e().k(99, 512);
                return;
            case 1:
                t2Var.E = 0.0f;
                w2 w2Var = t2Var.H;
                w2Var.f30142b.setTranslationX(0.0f);
                w2Var.f30145c.invalidate();
                return;
            case 2:
                w2 w2Var2 = t2Var.H;
                w2Var2.O0 = true;
                w2Var2.f30142b.setTranslationX(t2Var.getMeasuredWidth());
                w2Var2.dismiss();
                w2Var2.f30145c.invalidate();
                return;
            default:
                t2Var.H.f30142b.setTranslationY(0.0f);
                t2Var.H.h0();
                w2 w2Var3 = t2Var.H;
                w2Var3.q0(w2Var3.f30142b.getTranslationY());
                t2Var.invalidate();
                return;
        }
    }
}
