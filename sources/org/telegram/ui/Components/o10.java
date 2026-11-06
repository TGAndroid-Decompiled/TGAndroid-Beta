package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class o10 extends AnimatorListenerAdapter {
    public final View f36457a;
    public final View f36458b;
    public final WindowManager f36459c;
    public final View d;
    public final View f36460e;
    public final p10 f36461f;

    public o10(p10 p10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36461f = p10Var;
        this.f36457a = n10Var;
        this.f36458b = e5Var;
        this.f36459c = windowManager;
        this.d = frameLayout;
        this.f36460e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36461f.h).d(new bi.u0(this.f36457a, this.f36458b, this.f36459c, this.d, this.f36460e, 29));
    }
}
