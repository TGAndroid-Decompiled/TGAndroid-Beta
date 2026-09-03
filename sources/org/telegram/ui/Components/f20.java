package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class f20 extends AnimatorListenerAdapter {
    public final int f24774a;
    public final g20 f24775b;

    public f20(g20 g20Var, int i10) {
        this.f24774a = i10;
        this.f24775b = g20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24774a) {
            case 0:
                g20 g20Var = this.f24775b;
                NotificationCenter.getInstance(g20Var.f25024r.f25293a).onAnimationFinish(g20Var.f25022f);
                g20Var.requestLayout();
                return;
            default:
                g20 g20Var2 = this.f24775b;
                g20Var2.d = null;
                g20Var2.f25019a = null;
                g20Var2.f25020b = false;
                return;
        }
    }
}
