package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class h30 extends AnimatorListenerAdapter {
    public final View f26743a;
    public final View f26744b;
    public final WindowManager f26745c;
    public final View d;
    public final View e;
    public final i30 f26746f;

    public h30(i30 i30Var, f30 f30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f26746f = i30Var;
        this.f26743a = f30Var;
        this.f26744b = xVar;
        this.f26745c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f26746f.h).doOnIdle(new g30(this.f26743a, this.f26744b, this.f26745c, this.d, this.e));
    }
}
