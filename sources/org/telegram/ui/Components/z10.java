package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class z10 extends AnimatorListenerAdapter {
    public final View f42618a;
    public final View f42619b;
    public final WindowManager f42620c;
    public final View d;
    public final View f42621e;
    public final a20 f42622f;

    public z10(a20 a20Var, y10 y10Var, bi.g3 g3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f42622f = a20Var;
        this.f42618a = y10Var;
        this.f42619b = g3Var;
        this.f42620c = windowManager;
        this.d = frameLayout;
        this.f42621e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ks.f(this.f42622f.h).d(new org.telegram.ui.ip(this.f42618a, this.f42619b, this.f42620c, this.d, this.f42621e, 3));
    }
}
