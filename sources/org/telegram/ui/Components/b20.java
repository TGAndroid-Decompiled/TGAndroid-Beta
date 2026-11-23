package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class b20 extends AnimatorListenerAdapter {
    public final View f33688a;
    public final View f33689b;
    public final WindowManager f33690c;
    public final View d;
    public final View f33691e;
    public final c20 f33692f;

    public b20(c20 c20Var, a20 a20Var, bi.g3 g3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f33692f = c20Var;
        this.f33688a = a20Var;
        this.f33689b = g3Var;
        this.f33690c = windowManager;
        this.d = frameLayout;
        this.f33691e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ls.f(this.f33692f.h).d(new org.telegram.ui.ip(this.f33688a, this.f33689b, this.f33690c, this.d, this.f33691e, 3));
    }
}
