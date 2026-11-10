package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class o10 extends AnimatorListenerAdapter {
    public final View f36449a;
    public final View f36450b;
    public final WindowManager f36451c;
    public final View d;
    public final View f36452e;
    public final p10 f36453f;

    public o10(p10 p10Var, m10 m10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f36453f = p10Var;
        this.f36449a = m10Var;
        this.f36450b = e5Var;
        this.f36451c = windowManager;
        this.d = frameLayout;
        this.f36452e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f36453f.h).d(new n10(this.f36449a, this.f36450b, this.f36451c, this.d, this.f36452e));
    }
}
