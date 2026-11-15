package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class r10 extends AnimatorListenerAdapter {
    public final View f38818a;
    public final View f38819b;
    public final WindowManager f38820c;
    public final View d;
    public final View f38821e;
    public final s10 f38822f;

    public r10(s10 s10Var, q10 q10Var, bi.g2 g2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f38822f = s10Var;
        this.f38818a = q10Var;
        this.f38819b = g2Var;
        this.f38820c = windowManager;
        this.d = frameLayout;
        this.f38821e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ns.f(this.f38822f.h).d(new org.telegram.ui.hp(this.f38818a, this.f38819b, this.f38820c, this.d, this.f38821e, 3));
    }
}
