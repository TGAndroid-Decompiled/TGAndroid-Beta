package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class j30 extends AnimatorListenerAdapter {
    public final View f29493a;
    public final View f29494b;
    public final WindowManager f29495c;
    public final View d;
    public final View e;
    public final k30 f29496f;

    public j30(k30 k30Var, h30 h30Var, bh.r rVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.a8 a8Var) {
        this.f29496f = k30Var;
        this.f29493a = h30Var;
        this.f29494b = rVar;
        this.f29495c = windowManager;
        this.d = frameLayout;
        this.e = a8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f29496f.h).doOnIdle(new i30(this.f29493a, this.f29494b, this.f29495c, this.d, this.e));
    }
}
