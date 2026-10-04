package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class c30 extends AnimatorListenerAdapter {
    public final View f25178a;
    public final View f25179b;
    public final WindowManager f25180c;
    public final View d;
    public final View f25181e;
    public final d30 f25182f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f25182f = d30Var;
        this.f25178a = b30Var;
        this.f25179b = f0Var;
        this.f25180c = windowManager;
        this.d = frameLayout;
        this.f25181e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25182f.h).doOnIdle(new ai.m3(this.f25178a, this.f25179b, this.f25180c, this.d, this.f25181e, 22));
    }
}
