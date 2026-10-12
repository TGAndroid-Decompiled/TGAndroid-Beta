package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f39448a;
    public final float f39449b;
    public final lc0 f39450c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f39448a = i10;
        this.f39450c = lc0Var;
        this.f39449b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39448a) {
            case 0:
                lc0 lc0Var = this.f39450c;
                TextView textView = lc0Var.f39691f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20946y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20745n6, false);
                float f7 = this.f39449b;
                lc0Var.f39694s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                lc0 lc0Var2 = this.f39450c;
                TextView textView2 = lc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20946y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20745n6, false);
                float f10 = this.f39449b;
                lc0Var2.f39695w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
