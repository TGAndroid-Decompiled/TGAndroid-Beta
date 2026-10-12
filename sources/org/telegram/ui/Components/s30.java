package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class s30 extends AnimatorListenerAdapter {
    public final View f30380a;
    public final View f30381b;
    public final WindowManager f30382c;
    public final View d;
    public final View f30383e;
    public final t30 f30384f;

    public s30(t30 t30Var, r30 r30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f30384f = t30Var;
        this.f30380a = r30Var;
        this.f30381b = f0Var;
        this.f30382c = windowManager;
        this.d = frameLayout;
        this.f30383e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30384f.h).doOnIdle(new ai.n3(this.f30380a, this.f30381b, this.f30382c, this.d, this.f30383e, 22));
    }
}
