package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f22854a;
    public final View f22855b;
    public final WindowManager f22856c;
    public final View d;
    public final View e;
    public final c30 f22857f;

    public b30(c30 c30Var, a30 a30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f22857f = c30Var;
        this.f22854a = a30Var;
        this.f22855b = f0Var;
        this.f22856c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f22857f.h).doOnIdle(new ai.m3(this.f22854a, this.f22855b, this.f22856c, this.d, this.e, 22));
    }
}
