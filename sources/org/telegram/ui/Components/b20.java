package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
public final class b20 extends AnimatorListenerAdapter {
    public final View f33698a;
    public final View f33699b;
    public final WindowManager f33700c;
    public final View d;
    public final View f33701e;
    public final c20 f33702f;

    public b20(c20 c20Var, a20 a20Var, bi.e3 e3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f33702f = c20Var;
        this.f33698a = a20Var;
        this.f33699b = e3Var;
        this.f33700c = windowManager;
        this.d = frameLayout;
        this.f33701e = w7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ks.f(this.f33702f.h).d(new org.telegram.ui.wn(this.f33698a, this.f33699b, this.f33700c, this.d, this.f33701e, 4));
    }
}
