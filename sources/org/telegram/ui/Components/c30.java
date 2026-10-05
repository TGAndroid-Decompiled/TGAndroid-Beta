package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class c30 extends AnimatorListenerAdapter {
    public final View f25244a;
    public final View f25245b;
    public final WindowManager f25246c;
    public final View d;
    public final View f25247e;
    public final d30 f25248f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f25248f = d30Var;
        this.f25244a = b30Var;
        this.f25245b = f0Var;
        this.f25246c = windowManager;
        this.d = frameLayout;
        this.f25247e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25248f.h).doOnIdle(new ai.m3(this.f25244a, this.f25245b, this.f25246c, this.d, this.f25247e, 22));
    }
}
