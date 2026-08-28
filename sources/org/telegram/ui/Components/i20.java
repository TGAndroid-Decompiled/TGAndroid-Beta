package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class i20 extends AnimatorListenerAdapter {
    public final View f29279a;
    public final View f29280b;
    public final WindowManager f29281c;
    public final View d;
    public final View f29282e;
    public final j20 f29283f;

    public i20(j20 j20Var, h20 h20Var, fh.d2 d2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f29283f = j20Var;
        this.f29279a = h20Var;
        this.f29280b = d2Var;
        this.f29281c = windowManager;
        this.d = frameLayout;
        this.f29282e = t7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f29283f.h).doOnIdle(new org.telegram.ui.hr(this.f29279a, this.f29280b, this.f29281c, this.d, this.f29282e, 1));
    }
}
