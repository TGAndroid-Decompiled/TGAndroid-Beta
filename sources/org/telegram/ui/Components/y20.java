package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f30144a;
    public final View f30145b;
    public final WindowManager f30146c;
    public final View d;
    public final View e;
    public final z20 f30147f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f30147f = z20Var;
        this.f30144a = x20Var;
        this.f30145b = f0Var;
        this.f30146c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30147f.h).doOnIdle(new ai.m3(this.f30144a, this.f30145b, this.f30146c, this.d, this.e, 22));
    }
}
