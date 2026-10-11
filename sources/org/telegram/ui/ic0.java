package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ic0 extends AnimatorListenerAdapter {
    public final int f38688a;
    public final float f38689b;
    public final jc0 f38690c;

    public ic0(jc0 jc0Var, float f7, int i10) {
        this.f38688a = i10;
        this.f38690c = jc0Var;
        this.f38689b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38688a) {
            case 0:
                jc0 jc0Var = this.f38690c;
                TextView textView = jc0Var.f39011f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007n6, false);
                float f7 = this.f38689b;
                jc0Var.f39014s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                jc0 jc0Var2 = this.f38690c;
                TextView textView2 = jc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007n6, false);
                float f10 = this.f38689b;
                jc0Var2.f39015w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
