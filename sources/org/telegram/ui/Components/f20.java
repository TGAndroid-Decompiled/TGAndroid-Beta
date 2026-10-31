package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class f20 extends AnimatorListenerAdapter {
    public final View f25951a;
    public final View f25952b;
    public final WindowManager f25953c;
    public final View d;
    public final View e;
    public final g20 f25954f;

    public f20(g20 g20Var, e20 e20Var, jg.l0 l0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f25954f = g20Var;
        this.f25951a = e20Var;
        this.f25952b = l0Var;
        this.f25953c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.zs.f(this.f25954f.h).d(new ag.e3(this.f25951a, this.f25952b, this.f25953c, this.d, this.e, 19));
    }
}
