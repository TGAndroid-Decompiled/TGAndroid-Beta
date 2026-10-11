package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ic0 extends AnimatorListenerAdapter {
    public final int f38654a;
    public final float f38655b;
    public final jc0 f38656c;

    public ic0(jc0 jc0Var, float f7, int i10) {
        this.f38654a = i10;
        this.f38656c = jc0Var;
        this.f38655b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38654a) {
            case 0:
                jc0 jc0Var = this.f38656c;
                TextView textView = jc0Var.f38977f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                float f7 = this.f38655b;
                jc0Var.f38980s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                jc0 jc0Var2 = this.f38656c;
                TextView textView2 = jc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                float f10 = this.f38655b;
                jc0Var2.f38981w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
