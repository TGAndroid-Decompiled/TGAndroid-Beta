package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class y20 extends AnimatorListenerAdapter {
    public final View f32827a;
    public final View f32828b;
    public final WindowManager f32829c;
    public final View d;
    public final View f32830e;
    public final z20 f32831f;

    public y20(z20 z20Var, x20 x20Var, ah.y yVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f32831f = z20Var;
        this.f32827a = x20Var;
        this.f32828b = yVar;
        this.f32829c = windowManager;
        this.d = frameLayout;
        this.f32830e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f32831f.h).doOnIdle(new bi.z2(this.f32827a, this.f32828b, this.f32829c, this.d, this.f32830e, 22));
    }
}
