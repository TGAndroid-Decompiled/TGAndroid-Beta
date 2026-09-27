package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class hc0 extends AnimatorListenerAdapter {
    public final int f34190a;
    public final float f34191b;
    public final ic0 f34192c;

    public hc0(ic0 ic0Var, float f7, int i10) {
        this.f34190a = i10;
        this.f34192c = ic0Var;
        this.f34191b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34190a) {
            case 0:
                ic0 ic0Var = this.f34192c;
                TextView textView = ic0Var.f34433f;
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19442y6, false);
                int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19242n6, false);
                float f7 = this.f34191b;
                ic0Var.f34436s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                ic0 ic0Var2 = this.f34192c;
                TextView textView2 = ic0Var2.d;
                int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19442y6, false);
                int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19242n6, false);
                float f10 = this.f34191b;
                ic0Var2.f34437w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
