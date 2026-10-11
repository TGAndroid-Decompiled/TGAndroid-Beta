package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class q30 extends AnimatorListenerAdapter {
    public final View f29980a;
    public final View f29981b;
    public final WindowManager f29982c;
    public final View d;
    public final View f29983e;
    public final r30 f29984f;

    public q30(r30 r30Var, p30 p30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.s7 s7Var) {
        this.f29984f = r30Var;
        this.f29980a = p30Var;
        this.f29981b = f0Var;
        this.f29982c = windowManager;
        this.d = frameLayout;
        this.f29983e = s7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f29984f.h).doOnIdle(new ai.n3(this.f29980a, this.f29981b, this.f29982c, this.d, this.f29983e, 22));
    }
}
