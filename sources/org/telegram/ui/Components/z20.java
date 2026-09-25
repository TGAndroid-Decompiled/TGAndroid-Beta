package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class z20 extends AnimatorListenerAdapter {
    public final View f30773a;
    public final View f30774b;
    public final WindowManager f30775c;
    public final View d;
    public final View e;
    public final a30 f30776f;

    public z20(a30 a30Var, y20 y20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f30776f = a30Var;
        this.f30773a = y20Var;
        this.f30774b = f0Var;
        this.f30775c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30776f.h).doOnIdle(new ai.m3(this.f30773a, this.f30774b, this.f30775c, this.d, this.e, 22));
    }
}
