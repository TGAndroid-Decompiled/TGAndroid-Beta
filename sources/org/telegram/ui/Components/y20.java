package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f32855a;
    public final View f32856b;
    public final WindowManager f32857c;
    public final View d;
    public final View f32858e;
    public final z20 f32859f;

    public y20(z20 z20Var, x20 x20Var, ah.y yVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f32859f = z20Var;
        this.f32855a = x20Var;
        this.f32856b = yVar;
        this.f32857c = windowManager;
        this.d = frameLayout;
        this.f32858e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f32859f.h).doOnIdle(new bi.z2(this.f32855a, this.f32856b, this.f32857c, this.d, this.f32858e, 22));
    }
}
