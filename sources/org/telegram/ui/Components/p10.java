package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class p10 extends AnimatorListenerAdapter {
    public final View f36858a;
    public final View f36859b;
    public final WindowManager f36860c;
    public final View d;
    public final View f36861e;
    public final q10 f36862f;

    public p10(q10 q10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36862f = q10Var;
        this.f36858a = n10Var;
        this.f36859b = e5Var;
        this.f36860c = windowManager;
        this.d = frameLayout;
        this.f36861e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36862f.h).d(new o10(this.f36858a, this.f36859b, this.f36860c, this.d, this.f36861e));
    }
}
