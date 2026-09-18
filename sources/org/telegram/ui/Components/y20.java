package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f30094a;
    public final View f30095b;
    public final WindowManager f30096c;
    public final View d;
    public final View e;
    public final z20 f30097f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f30097f = z20Var;
        this.f30094a = x20Var;
        this.f30095b = f0Var;
        this.f30096c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30097f.h).doOnIdle(new ai.m3(this.f30094a, this.f30095b, this.f30096c, this.d, this.e, 22));
    }
}
