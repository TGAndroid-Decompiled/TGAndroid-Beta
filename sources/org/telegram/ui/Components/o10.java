package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class o10 extends AnimatorListenerAdapter {
    public final View f36562a;
    public final View f36563b;
    public final WindowManager f36564c;
    public final View d;
    public final View f36565e;
    public final p10 f36566f;

    public o10(p10 p10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36566f = p10Var;
        this.f36562a = n10Var;
        this.f36563b = e5Var;
        this.f36564c = windowManager;
        this.d = frameLayout;
        this.f36565e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36566f.h).d(new bi.u0(this.f36562a, this.f36563b, this.f36564c, this.d, this.f36565e, 29));
    }
}
