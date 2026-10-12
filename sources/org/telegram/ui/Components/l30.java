package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class l30 extends AnimatorListenerAdapter {
    public final View f26922a;
    public final View f26923b;
    public final WindowManager f26924c;
    public final View d;
    public final View e;
    public final m30 f26925f;

    public l30(m30 m30Var, k30 k30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.y7 y7Var) {
        this.f26925f = m30Var;
        this.f26922a = k30Var;
        this.f26923b = xVar;
        this.f26924c = windowManager;
        this.d = frameLayout;
        this.e = y7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f26925f.h).doOnIdle(new bi.c3(this.f26922a, this.f26923b, this.f26924c, this.d, this.e, 22));
    }
}
