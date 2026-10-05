package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class h20 extends AnimatorListenerAdapter {
    public final int f27040a;
    public final i20 f27041b;

    public h20(i20 i20Var, int i10) {
        this.f27040a = i10;
        this.f27041b = i20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27040a) {
            case 0:
                i20 i20Var = this.f27041b;
                NotificationCenter.getInstance(i20Var.f27371r.f27652a).onAnimationFinish(i20Var.f27369f);
                i20Var.requestLayout();
                return;
            default:
                i20 i20Var2 = this.f27041b;
                i20Var2.d = null;
                i20Var2.f27365a = null;
                i20Var2.f27366b = false;
                return;
        }
    }
}
