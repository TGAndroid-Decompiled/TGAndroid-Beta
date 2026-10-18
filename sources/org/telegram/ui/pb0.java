package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class pb0 extends AnimatorListenerAdapter {
    public final int f40012a;
    public final float f40013b;
    public final qb0 f40014c;

    public pb0(qb0 qb0Var, float f7, int i10) {
        this.f40012a = i10;
        this.f40014c = qb0Var;
        this.f40013b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40012a) {
            case 0:
                qb0 qb0Var = this.f40014c;
                TextView textView = qb0Var.f40323f;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false);
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n6, false);
                float f7 = this.f40013b;
                qb0Var.f40326s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                qb0 qb0Var2 = this.f40014c;
                TextView textView2 = qb0Var2.d;
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false);
                int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21169n6, false);
                float f10 = this.f40013b;
                qb0Var2.f40327w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
