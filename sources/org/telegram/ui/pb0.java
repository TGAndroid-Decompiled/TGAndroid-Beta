package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class pb0 extends AnimatorListenerAdapter {
    public final int f41430a;
    public final float f41431b;
    public final qb0 f41432c;

    public pb0(qb0 qb0Var, float f10, int i9) {
        this.f41430a = i9;
        this.f41432c = qb0Var;
        this.f41431b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41430a) {
            case 0:
                qb0 qb0Var = this.f41432c;
                TextView textView = qb0Var.f41746f;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                float f10 = this.f41431b;
                qb0Var.f41749s = f10;
                textView.setTextColor(i0.a.d(f10, w02, w03));
                return;
            default:
                qb0 qb0Var2 = this.f41432c;
                TextView textView2 = qb0Var2.d;
                int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                float f11 = this.f41431b;
                qb0Var2.f41750w = f11;
                textView2.setTextColor(i0.a.d(f11, w04, w05));
                return;
        }
    }
}
