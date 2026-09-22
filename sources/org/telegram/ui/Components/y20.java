package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f30497a;
    public final View f30498b;
    public final WindowManager f30499c;
    public final View d;
    public final View e;
    public final z20 f30500f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.v7 v7Var) {
        this.f30500f = z20Var;
        this.f30497a = x20Var;
        this.f30498b = f0Var;
        this.f30499c = windowManager;
        this.d = frameLayout;
        this.e = v7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30500f.h).doOnIdle(new ai.m3(this.f30497a, this.f30498b, this.f30499c, this.d, this.e, 22));
    }
}
