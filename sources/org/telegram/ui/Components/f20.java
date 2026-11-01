package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class f20 extends AnimatorListenerAdapter {
    public final View f26043a;
    public final View f26044b;
    public final WindowManager f26045c;
    public final View d;
    public final View e;
    public final g20 f26046f;

    public f20(g20 g20Var, e20 e20Var, jg.l0 l0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f26046f = g20Var;
        this.f26043a = e20Var;
        this.f26044b = l0Var;
        this.f26045c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.at.f(this.f26046f.h).d(new ag.e3(this.f26043a, this.f26044b, this.f26045c, this.d, this.e, 19));
    }
}
