package org.telegram.ui;

import android.widget.LinearLayout;
public final class q20 extends LinearLayout {
    public boolean f49083a;
    public final org.telegram.ui.Components.hb0 f49084b;
    public final m20 f49085c;
    public final n20 d;

    public q20(LaunchActivity launchActivity, org.telegram.ui.Components.hb0 hb0Var, m20 m20Var, n20 n20Var) {
        super(launchActivity);
        this.f49084b = hb0Var;
        this.f49085c = m20Var;
        this.d = n20Var;
        this.f49083a = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f49083a = true;
        org.telegram.ui.Components.hb0 hb0Var = this.f49084b;
        hb0Var.setItemCount(5);
        m20 m20Var = this.f49085c;
        m20Var.setItemCount(5);
        n20 n20Var = this.d;
        n20Var.setItemCount(5);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        m20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        n20Var.getLayoutParams().height = org.telegram.messenger.g0.L(54.0f) * 5;
        this.f49083a = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f49083a) {
            return;
        }
        super.requestLayout();
    }
}
