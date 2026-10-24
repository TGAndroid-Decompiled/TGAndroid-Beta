package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class f30 extends AnimatorListenerAdapter {
    public final View f26185a;
    public final View f26186b;
    public final WindowManager f26187c;
    public final View d;
    public final View e;
    public final g30 f26188f;

    public f30(g30 g30Var, d30 d30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f26188f = g30Var;
        this.f26185a = d30Var;
        this.f26186b = xVar;
        this.f26187c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f26188f.h).doOnIdle(new e30(this.f26185a, this.f26186b, this.f26187c, this.d, this.e));
    }
}
