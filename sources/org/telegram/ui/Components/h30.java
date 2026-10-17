package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class h30 extends AnimatorListenerAdapter {
    public final View f26752a;
    public final View f26753b;
    public final WindowManager f26754c;
    public final View d;
    public final View e;
    public final i30 f26755f;

    public h30(i30 i30Var, f30 f30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f26755f = i30Var;
        this.f26752a = f30Var;
        this.f26753b = xVar;
        this.f26754c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f26755f.h).doOnIdle(new g30(this.f26752a, this.f26753b, this.f26754c, this.d, this.e));
    }
}
