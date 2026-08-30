package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class z20 extends AnimatorListenerAdapter {
    public final View f31222a;
    public final View f31223b;
    public final WindowManager f31224c;
    public final View d;
    public final View e;
    public final a30 f31225f;

    public z20(a30 a30Var, y20 y20Var, dg.u2 u2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f31225f = a30Var;
        this.f31222a = y20Var;
        this.f31223b = u2Var;
        this.f31224c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f31225f.h).doOnIdle(new gg.j0(this.f31222a, this.f31223b, this.f31224c, this.d, this.e, 28));
    }
}
