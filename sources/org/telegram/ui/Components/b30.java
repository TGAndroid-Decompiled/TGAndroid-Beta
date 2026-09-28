package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f22855a;
    public final View f22856b;
    public final WindowManager f22857c;
    public final View d;
    public final View e;
    public final c30 f22858f;

    public b30(c30 c30Var, a30 a30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f22858f = c30Var;
        this.f22855a = a30Var;
        this.f22856b = f0Var;
        this.f22857c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f22858f.h).doOnIdle(new ai.m3(this.f22855a, this.f22856b, this.f22857c, this.d, this.e, 22));
    }
}
