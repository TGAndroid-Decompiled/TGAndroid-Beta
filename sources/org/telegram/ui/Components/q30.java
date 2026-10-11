package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class q30 extends AnimatorListenerAdapter {
    public final View f30099a;
    public final View f30100b;
    public final WindowManager f30101c;
    public final View d;
    public final View f30102e;
    public final r30 f30103f;

    public q30(r30 r30Var, p30 p30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.s7 s7Var) {
        this.f30103f = r30Var;
        this.f30099a = p30Var;
        this.f30100b = f0Var;
        this.f30101c = windowManager;
        this.d = frameLayout;
        this.f30102e = s7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30103f.h).doOnIdle(new ai.n3(this.f30099a, this.f30100b, this.f30101c, this.d, this.f30102e, 22));
    }
}
