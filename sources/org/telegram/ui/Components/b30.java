package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class b30 extends AnimatorListenerAdapter {
    public final View f25487a;
    public final View f25488b;
    public final WindowManager f25489c;
    public final View d;
    public final View f25490e;
    public final c30 f25491f;

    public b30(c30 c30Var, a30 a30Var, eg.s2 s2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f25491f = c30Var;
        this.f25487a = a30Var;
        this.f25488b = s2Var;
        this.f25489c = windowManager;
        this.d = frameLayout;
        this.f25490e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25491f.h).doOnIdle(new hg.j0(this.f25487a, this.f25488b, this.f25489c, this.d, this.f25490e, 28));
    }
}
