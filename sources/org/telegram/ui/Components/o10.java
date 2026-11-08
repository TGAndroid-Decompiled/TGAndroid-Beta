package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class o10 extends AnimatorListenerAdapter {
    public final View f36513a;
    public final View f36514b;
    public final WindowManager f36515c;
    public final View d;
    public final View f36516e;
    public final p10 f36517f;

    public o10(p10 p10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36517f = p10Var;
        this.f36513a = n10Var;
        this.f36514b = e5Var;
        this.f36515c = windowManager;
        this.d = frameLayout;
        this.f36516e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36517f.h).d(new bi.u0(this.f36513a, this.f36514b, this.f36515c, this.d, this.f36516e, 29));
    }
}
