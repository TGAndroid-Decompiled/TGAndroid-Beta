package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f32854a;
    public final View f32855b;
    public final WindowManager f32856c;
    public final View d;
    public final View f32857e;
    public final z20 f32858f;

    public y20(z20 z20Var, x20 x20Var, ah.y yVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f32858f = z20Var;
        this.f32854a = x20Var;
        this.f32855b = yVar;
        this.f32856c = windowManager;
        this.d = frameLayout;
        this.f32857e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f32858f.h).doOnIdle(new bi.z2(this.f32854a, this.f32855b, this.f32856c, this.d, this.f32857e, 22));
    }
}
