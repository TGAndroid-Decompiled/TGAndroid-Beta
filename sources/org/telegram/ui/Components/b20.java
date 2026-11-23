package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class b20 extends AnimatorListenerAdapter {
    public final View f33711a;
    public final View f33712b;
    public final WindowManager f33713c;
    public final View d;
    public final View f33714e;
    public final c20 f33715f;

    public b20(c20 c20Var, a20 a20Var, bi.e3 e3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f33715f = c20Var;
        this.f33711a = a20Var;
        this.f33712b = e3Var;
        this.f33713c = windowManager;
        this.d = frameLayout;
        this.f33714e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ls.f(this.f33715f.h).d(new org.telegram.ui.wn(this.f33711a, this.f33712b, this.f33713c, this.d, this.f33714e, 4));
    }
}
