package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class c30 extends AnimatorListenerAdapter {
    public final View f25184a;
    public final View f25185b;
    public final WindowManager f25186c;
    public final View d;
    public final View f25187e;
    public final d30 f25188f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f25188f = d30Var;
        this.f25184a = b30Var;
        this.f25185b = f0Var;
        this.f25186c = windowManager;
        this.d = frameLayout;
        this.f25187e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25188f.h).doOnIdle(new ai.m3(this.f25184a, this.f25185b, this.f25186c, this.d, this.f25187e, 22));
    }
}
