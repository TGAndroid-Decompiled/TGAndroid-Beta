package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
public final class c30 extends AnimatorListenerAdapter {
    public final View f25179a;
    public final View f25180b;
    public final WindowManager f25181c;
    public final View d;
    public final View f25182e;
    public final d30 f25183f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f25183f = d30Var;
        this.f25179a = b30Var;
        this.f25180b = f0Var;
        this.f25181c = windowManager;
        this.d = frameLayout;
        this.f25182e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f25183f.h).doOnIdle(new ai.m3(this.f25179a, this.f25180b, this.f25181c, this.d, this.f25182e, 22));
    }
}
