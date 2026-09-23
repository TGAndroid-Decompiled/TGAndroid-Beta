package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class fc0 extends AnimatorListenerAdapter {
    public final int f33281a;
    public final float f33282b;
    public final gc0 f33283c;

    public fc0(gc0 gc0Var, float f7, int i10) {
        this.f33281a = i10;
        this.f33283c = gc0Var;
        this.f33282b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33281a) {
            case 0:
                gc0 gc0Var = this.f33283c;
                TextView textView = gc0Var.f33516f;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false);
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18973n6, false);
                float f7 = this.f33282b;
                gc0Var.f33519s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                gc0 gc0Var2 = this.f33283c;
                TextView textView2 = gc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false);
                int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18973n6, false);
                float f10 = this.f33282b;
                gc0Var2.f33520w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
