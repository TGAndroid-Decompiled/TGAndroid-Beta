package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class c30 extends AnimatorListenerAdapter {
    public final View f23141a;
    public final View f23142b;
    public final WindowManager f23143c;
    public final View d;
    public final View e;
    public final d30 f23144f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f23144f = d30Var;
        this.f23141a = b30Var;
        this.f23142b = f0Var;
        this.f23143c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f23144f.h).doOnIdle(new ai.m3(this.f23141a, this.f23142b, this.f23143c, this.d, this.e, 22));
    }
}
