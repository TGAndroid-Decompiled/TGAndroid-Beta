package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class j30 extends AnimatorListenerAdapter {
    public final View f29467a;
    public final View f29468b;
    public final WindowManager f29469c;
    public final View d;
    public final View e;
    public final k30 f29470f;

    public j30(k30 k30Var, h30 h30Var, bh.r rVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.a8 a8Var) {
        this.f29470f = k30Var;
        this.f29467a = h30Var;
        this.f29468b = rVar;
        this.f29469c = windowManager;
        this.d = frameLayout;
        this.e = a8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f29470f.h).doOnIdle(new i30(this.f29467a, this.f29468b, this.f29469c, this.d, this.e));
    }
}
