package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f25473a;
    public final View f25474b;
    public final WindowManager f25475c;
    public final View d;
    public final View f25476e;
    public final c30 f25477f;

    public b30(c30 c30Var, a30 a30Var, eg.s2 s2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f25477f = c30Var;
        this.f25473a = a30Var;
        this.f25474b = s2Var;
        this.f25475c = windowManager;
        this.d = frameLayout;
        this.f25476e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25477f.h).doOnIdle(new hg.j0(this.f25473a, this.f25474b, this.f25475c, this.d, this.f25476e, 28));
    }
}
