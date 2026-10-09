package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class p30 extends AnimatorListenerAdapter {
    public final View f29704a;
    public final View f29705b;
    public final WindowManager f29706c;
    public final View d;
    public final View f29707e;
    public final q30 f29708f;

    public p30(q30 q30Var, o30 o30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f29708f = q30Var;
        this.f29704a = o30Var;
        this.f29705b = f0Var;
        this.f29706c = windowManager;
        this.d = frameLayout;
        this.f29707e = t7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f29708f.h).doOnIdle(new ai.n3(this.f29704a, this.f29705b, this.f29706c, this.d, this.f29707e, 22));
    }
}
