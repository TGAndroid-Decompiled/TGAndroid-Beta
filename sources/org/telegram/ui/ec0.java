package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ec0 extends AnimatorListenerAdapter {
    public final int f33366a;
    public final float f33367b;
    public final fc0 f33368c;

    public ec0(fc0 fc0Var, float f7, int i10) {
        this.f33366a = i10;
        this.f33368c = fc0Var;
        this.f33367b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33366a) {
            case 0:
                fc0 fc0Var = this.f33368c;
                TextView textView = fc0Var.f33628f;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                float f7 = this.f33367b;
                fc0Var.f33631s = f7;
                textView.setTextColor(i0.a.d(f7, w02, w03));
                return;
            default:
                fc0 fc0Var2 = this.f33368c;
                TextView textView2 = fc0Var2.d;
                int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                float f10 = this.f33367b;
                fc0Var2.f33632w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
