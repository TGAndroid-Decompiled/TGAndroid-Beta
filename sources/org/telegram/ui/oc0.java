package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class oc0 extends AnimatorListenerAdapter {
    public final int f38922a;
    public final float f38923b;
    public final pc0 f38924c;

    public oc0(pc0 pc0Var, float f7, int i10) {
        this.f38922a = i10;
        this.f38924c = pc0Var;
        this.f38923b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38922a) {
            case 0:
                pc0 pc0Var = this.f38924c;
                TextView textView = pc0Var.f39185f;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false);
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20084n6, false);
                float f7 = this.f38923b;
                pc0Var.f39188s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                pc0 pc0Var2 = this.f38924c;
                TextView textView2 = pc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false);
                int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20084n6, false);
                float f10 = this.f38923b;
                pc0Var2.f39189w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
