package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class a30 extends AnimatorListenerAdapter {
    public final View f23305a;
    public final View f23306b;
    public final WindowManager f23307c;
    public final View d;
    public final View e;
    public final b30 f23308f;

    public a30(b30 b30Var, z20 z20Var, dg.u2 u2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.y7 y7Var) {
        this.f23308f = b30Var;
        this.f23305a = z20Var;
        this.f23306b = u2Var;
        this.f23307c = windowManager;
        this.d = frameLayout;
        this.e = y7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f23308f.h).doOnIdle(new gg.j0(this.f23305a, this.f23306b, this.f23307c, this.d, this.e, 28));
    }
}
