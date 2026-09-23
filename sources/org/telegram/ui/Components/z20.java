package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class z20 extends AnimatorListenerAdapter {
    public final View f30519a;
    public final View f30520b;
    public final WindowManager f30521c;
    public final View d;
    public final View e;
    public final a30 f30522f;

    public z20(a30 a30Var, y20 y20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f30522f = a30Var;
        this.f30519a = y20Var;
        this.f30520b = f0Var;
        this.f30521c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30522f.h).doOnIdle(new ai.m3(this.f30519a, this.f30520b, this.f30521c, this.d, this.e, 22));
    }
}
