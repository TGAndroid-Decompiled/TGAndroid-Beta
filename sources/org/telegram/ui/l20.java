package org.telegram.ui;

import android.widget.LinearLayout;
public final class l20 extends LinearLayout {
    public boolean f47077a;
    public final org.telegram.ui.Components.cb0 f47078b;
    public final h20 f47079c;
    public final i20 d;

    public l20(LaunchActivity launchActivity, org.telegram.ui.Components.cb0 cb0Var, h20 h20Var, i20 i20Var) {
        super(launchActivity);
        this.f47078b = cb0Var;
        this.f47079c = h20Var;
        this.d = i20Var;
        this.f47077a = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f47077a = true;
        org.telegram.ui.Components.cb0 cb0Var = this.f47078b;
        cb0Var.setItemCount(5);
        h20 h20Var = this.f47079c;
        h20Var.setItemCount(5);
        i20 i20Var = this.d;
        i20Var.setItemCount(5);
        cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        h20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        i20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f47077a = false;
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f47077a) {
            return;
        }
        super.requestLayout();
    }
}
