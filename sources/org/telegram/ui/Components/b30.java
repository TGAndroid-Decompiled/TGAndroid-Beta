package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f22891a;
    public final View f22892b;
    public final WindowManager f22893c;
    public final View d;
    public final View e;
    public final c30 f22894f;

    public b30(c30 c30Var, a30 a30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f22894f = c30Var;
        this.f22891a = a30Var;
        this.f22892b = f0Var;
        this.f22893c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f22894f.h).doOnIdle(new ai.m3(this.f22891a, this.f22892b, this.f22893c, this.d, this.e, 22));
    }
}
