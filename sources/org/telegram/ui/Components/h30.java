package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class h30 extends AnimatorListenerAdapter {
    public final View f26742a;
    public final View f26743b;
    public final WindowManager f26744c;
    public final View d;
    public final View e;
    public final i30 f26745f;

    public h30(i30 i30Var, f30 f30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f26745f = i30Var;
        this.f26742a = f30Var;
        this.f26743b = xVar;
        this.f26744c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f26745f.h).doOnIdle(new g30(this.f26742a, this.f26743b, this.f26744c, this.d, this.e));
    }
}
