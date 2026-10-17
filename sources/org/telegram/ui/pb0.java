package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class pb0 extends AnimatorListenerAdapter {
    public final int f40032a;
    public final float f40033b;
    public final qb0 f40034c;

    public pb0(qb0 qb0Var, float f7, int i10) {
        this.f40032a = i10;
        this.f40034c = qb0Var;
        this.f40033b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40032a) {
            case 0:
                qb0 qb0Var = this.f40034c;
                TextView textView = qb0Var.f40359f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n6, false);
                float f7 = this.f40033b;
                qb0Var.f40362s = f7;
                textView.setTextColor(i0.b.f(f7, x02, x03));
                return;
            default:
                qb0 qb0Var2 = this.f40034c;
                TextView textView2 = qb0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n6, false);
                float f10 = this.f40033b;
                qb0Var2.f40363w = f10;
                textView2.setTextColor(i0.b.f(f10, x04, x05));
                return;
        }
    }
}
