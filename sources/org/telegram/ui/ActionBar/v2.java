package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.zs;
public final class v2 extends AnimatorListenerAdapter {
    public final int f21406a;
    public final w2 f21407b;

    public v2(w2 w2Var, int i10) {
        this.f21406a = i10;
        this.f21407b = w2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21406a;
        w2 w2Var = this.f21407b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = w2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.h = null;
                }
                zs.e().k(99, 512);
                return;
            case 1:
                w2Var.D = 0.0f;
                z2 z2Var = w2Var.G;
                z2Var.f21586b.setTranslationX(0.0f);
                z2Var.f21589c.invalidate();
                return;
            case 2:
                z2 z2Var2 = w2Var.G;
                z2Var2.N0 = true;
                z2Var2.f21586b.setTranslationX(w2Var.getMeasuredWidth());
                z2Var2.dismiss();
                z2Var2.f21589c.invalidate();
                return;
            default:
                w2Var.G.f21586b.setTranslationY(0.0f);
                w2Var.G.h0();
                z2 z2Var3 = w2Var.G;
                z2Var3.q0(z2Var3.f21586b.getTranslationY());
                w2Var.invalidate();
                return;
        }
    }
}
