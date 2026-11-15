package org.telegram.ui;

import android.widget.LinearLayout;
public final class q20 extends LinearLayout {
    public boolean f50446a;
    public final org.telegram.ui.Components.ib0 f50447b;
    public final m20 f50448c;
    public final n20 d;

    public q20(LaunchActivity launchActivity, org.telegram.ui.Components.ib0 ib0Var, m20 m20Var, n20 n20Var) {
        super(launchActivity);
        this.f50447b = ib0Var;
        this.f50448c = m20Var;
        this.d = n20Var;
        this.f50446a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f50446a = true;
        org.telegram.ui.Components.ib0 ib0Var = this.f50447b;
        ib0Var.setItemCount(5);
        m20 m20Var = this.f50448c;
        m20Var.setItemCount(5);
        n20 n20Var = this.d;
        n20Var.setItemCount(5);
        ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        m20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        n20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f50446a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f50446a) {
            return;
        }
        super.requestLayout();
    }
}
