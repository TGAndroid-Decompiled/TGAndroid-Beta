package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class kc0 extends AnimatorListenerAdapter {
    public final int f38031a;
    public final float f38032b;
    public final lc0 f38033c;

    public kc0(lc0 lc0Var, float f7, int i10) {
        this.f38031a = i10;
        this.f38033c = lc0Var;
        this.f38032b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38031a) {
            case 0:
                lc0 lc0Var = this.f38033c;
                TextView textView = lc0Var.f38322f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21070y6, false);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20874n6, false);
                float f7 = this.f38032b;
                lc0Var.f38325s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                lc0 lc0Var2 = this.f38033c;
                TextView textView2 = lc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21070y6, false);
                int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20874n6, false);
                float f10 = this.f38032b;
                lc0Var2.f38326w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
