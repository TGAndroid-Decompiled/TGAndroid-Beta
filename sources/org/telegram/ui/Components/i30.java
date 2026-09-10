package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class i30 extends AnimatorListenerAdapter {
    public final View f23885a;
    public final View f23886b;
    public final WindowManager f23887c;
    public final View d;
    public final View e;
    public final j30 f23888f;

    public i30(j30 j30Var, h30 h30Var, bi.ld ldVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f23888f = j30Var;
        this.f23885a = h30Var;
        this.f23886b = ldVar;
        this.f23887c = windowManager;
        this.d = frameLayout;
        this.e = t7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f23888f.h).doOnIdle(new bi.ya(this.f23885a, this.f23886b, this.f23887c, this.d, this.e, 18));
    }
}
