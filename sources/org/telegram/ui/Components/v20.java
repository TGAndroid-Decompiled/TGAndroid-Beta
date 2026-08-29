package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class v20 extends AnimatorListenerAdapter {
    public final View f33432a;
    public final View f33433b;
    public final WindowManager f33434c;
    public final View d;
    public final View f33435e;
    public final w20 f33436f;

    public v20(w20 w20Var, t20 t20Var, bg.x2 x2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.s7 s7Var) {
        this.f33436f = w20Var;
        this.f33432a = t20Var;
        this.f33433b = x2Var;
        this.f33434c = windowManager;
        this.d = frameLayout;
        this.f33435e = s7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f33436f.h).doOnIdle(new u20(this.f33432a, this.f33433b, this.f33434c, this.d, this.f33435e));
    }
}
