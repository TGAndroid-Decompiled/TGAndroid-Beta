package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f30091a;
    public final View f30092b;
    public final WindowManager f30093c;
    public final View d;
    public final View e;
    public final z20 f30094f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f30094f = z20Var;
        this.f30091a = x20Var;
        this.f30092b = f0Var;
        this.f30093c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30094f.h).doOnIdle(new ai.m3(this.f30091a, this.f30092b, this.f30093c, this.d, this.e, 22));
    }
}
