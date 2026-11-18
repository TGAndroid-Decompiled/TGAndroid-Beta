package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class y10 extends AnimatorListenerAdapter {
    public final View f42255a;
    public final View f42256b;
    public final WindowManager f42257c;
    public final View d;
    public final View f42258e;
    public final z10 f42259f;

    public y10(z10 z10Var, x10 x10Var, bi.a3 a3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f42259f = z10Var;
        this.f42255a = x10Var;
        this.f42256b = a3Var;
        this.f42257c = windowManager;
        this.d = frameLayout;
        this.f42258e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ks.f(this.f42259f.h).d(new org.telegram.ui.wn(this.f42255a, this.f42256b, this.f42257c, this.d, this.f42258e, 4));
    }
}
