package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class q30 extends AnimatorListenerAdapter {
    public final View f29996a;
    public final View f29997b;
    public final WindowManager f29998c;
    public final View d;
    public final View f29999e;
    public final r30 f30000f;

    public q30(r30 r30Var, p30 p30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f30000f = r30Var;
        this.f29996a = p30Var;
        this.f29997b = f0Var;
        this.f29998c = windowManager;
        this.d = frameLayout;
        this.f29999e = t7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30000f.h).doOnIdle(new ai.n3(this.f29996a, this.f29997b, this.f29998c, this.d, this.f29999e, 22));
    }
}
