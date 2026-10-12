package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class s30 extends AnimatorListenerAdapter {
    public final View f30376a;
    public final View f30377b;
    public final WindowManager f30378c;
    public final View d;
    public final View f30379e;
    public final t30 f30380f;

    public s30(t30 t30Var, r30 r30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f30380f = t30Var;
        this.f30376a = r30Var;
        this.f30377b = f0Var;
        this.f30378c = windowManager;
        this.d = frameLayout;
        this.f30379e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30380f.h).doOnIdle(new ai.n3(this.f30376a, this.f30377b, this.f30378c, this.d, this.f30379e, 22));
    }
}
