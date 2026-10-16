package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class nc0 extends AnimatorListenerAdapter {
    public final int f38358a;
    public final float f38359b;
    public final oc0 f38360c;

    public nc0(oc0 oc0Var, float f7, int i10) {
        this.f38358a = i10;
        this.f38360c = oc0Var;
        this.f38359b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38358a) {
            case 0:
                oc0 oc0Var = this.f38360c;
                TextView textView = oc0Var.f38608f;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19988y6, false);
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19784n6, false);
                float f7 = this.f38359b;
                oc0Var.f38611s = f7;
                textView.setTextColor(i0.a.d(f7, x02, x03));
                return;
            default:
                oc0 oc0Var2 = this.f38360c;
                TextView textView2 = oc0Var2.d;
                int x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19988y6, false);
                int x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19784n6, false);
                float f10 = this.f38359b;
                oc0Var2.f38612w = f10;
                textView2.setTextColor(i0.a.d(f10, x04, x05));
                return;
        }
    }
}
