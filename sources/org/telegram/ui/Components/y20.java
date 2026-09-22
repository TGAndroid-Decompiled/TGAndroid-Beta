package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f30141a;
    public final View f30142b;
    public final WindowManager f30143c;
    public final View d;
    public final View e;
    public final z20 f30144f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f30144f = z20Var;
        this.f30141a = x20Var;
        this.f30142b = f0Var;
        this.f30143c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30144f.h).doOnIdle(new ai.m3(this.f30141a, this.f30142b, this.f30143c, this.d, this.e, 22));
    }
}
