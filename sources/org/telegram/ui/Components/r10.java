package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class r10 extends AnimatorListenerAdapter {
    public final View f38820a;
    public final View f38821b;
    public final WindowManager f38822c;
    public final View d;
    public final View f38823e;
    public final s10 f38824f;

    public r10(s10 s10Var, q10 q10Var, bi.g2 g2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f38824f = s10Var;
        this.f38820a = q10Var;
        this.f38821b = g2Var;
        this.f38822c = windowManager;
        this.d = frameLayout;
        this.f38823e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ns.f(this.f38824f.h).d(new org.telegram.ui.hp(this.f38820a, this.f38821b, this.f38822c, this.d, this.f38823e, 3));
    }
}
