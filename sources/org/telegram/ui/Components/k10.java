package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class k10 extends AnimatorListenerAdapter {
    public final View f35239a;
    public final View f35240b;
    public final WindowManager f35241c;
    public final View d;
    public final View f35242e;
    public final l10 f35243f;

    public k10(l10 l10Var, j10 j10Var, ai.o2 o2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f35243f = l10Var;
        this.f35239a = j10Var;
        this.f35240b = o2Var;
        this.f35241c = windowManager;
        this.d = frameLayout;
        this.f35242e = x7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.hs.f(this.f35243f.h).d(new org.telegram.ui.lq(this.f35239a, this.f35240b, this.f35241c, this.d, this.f35242e, 1));
    }
}
