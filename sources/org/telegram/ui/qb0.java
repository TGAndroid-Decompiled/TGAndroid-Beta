package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class qb0 extends AnimatorListenerAdapter {
    public final int f42800a;
    public final float f42801b;
    public final rb0 f42802c;

    public qb0(rb0 rb0Var, float f7, int i10) {
        this.f42800a = i10;
        this.f42802c = rb0Var;
        this.f42801b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42800a) {
            case 0:
                rb0 rb0Var = this.f42802c;
                TextView textView = rb0Var.f43096f;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                float f7 = this.f42801b;
                rb0Var.f43099s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                rb0 rb0Var2 = this.f42802c;
                TextView textView2 = rb0Var2.d;
                int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                float f10 = this.f42801b;
                rb0Var2.f43100w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
