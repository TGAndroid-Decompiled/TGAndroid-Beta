package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f22842a;
    public final View f22843b;
    public final WindowManager f22844c;
    public final View d;
    public final View e;
    public final c30 f22845f;

    public b30(c30 c30Var, a30 a30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f22845f = c30Var;
        this.f22842a = a30Var;
        this.f22843b = f0Var;
        this.f22844c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f22845f.h).doOnIdle(new ai.m3(this.f22842a, this.f22843b, this.f22844c, this.d, this.e, 22));
    }
}
