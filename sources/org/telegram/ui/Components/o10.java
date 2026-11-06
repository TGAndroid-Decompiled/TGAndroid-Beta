package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class o10 extends AnimatorListenerAdapter {
    public final View f36493a;
    public final View f36494b;
    public final WindowManager f36495c;
    public final View d;
    public final View f36496e;
    public final p10 f36497f;

    public o10(p10 p10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36497f = p10Var;
        this.f36493a = n10Var;
        this.f36494b = e5Var;
        this.f36495c = windowManager;
        this.d = frameLayout;
        this.f36496e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36497f.h).d(new bi.u0(this.f36493a, this.f36494b, this.f36495c, this.d, this.f36496e, 29));
    }
}
