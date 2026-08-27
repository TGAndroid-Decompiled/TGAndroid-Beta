package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

public final class m20 extends AnimatorListenerAdapter {

    public final View f30534a;

    public final View f30535b;

    public final WindowManager f30536c;
    public final View d;

    public final View f30537e;

    public final n20 f30538f;

    public m20(n20 n20Var, k20 k20Var, ag.p1 p1Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f30538f = n20Var;
        this.f30534a = k20Var;
        this.f30535b = p1Var;
        this.f30536c = windowManager;
        this.d = frameLayout;
        this.f30537e = u7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f30538f.h).doOnIdle(new l20(this.f30534a, this.f30535b, this.f30536c, this.d, this.f30537e));
    }
}
