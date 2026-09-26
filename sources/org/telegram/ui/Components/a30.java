package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class a30 extends AnimatorListenerAdapter {
    public final View f22522a;
    public final View f22523b;
    public final WindowManager f22524c;
    public final View d;
    public final View e;
    public final b30 f22525f;

    public a30(b30 b30Var, z20 z20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f22525f = b30Var;
        this.f22522a = z20Var;
        this.f22523b = f0Var;
        this.f22524c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f22525f.h).doOnIdle(new ai.m3(this.f22522a, this.f22523b, this.f22524c, this.d, this.e, 22));
    }
}
