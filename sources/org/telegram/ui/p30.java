package org.telegram.ui;

import android.widget.LinearLayout;
public final class p30 extends LinearLayout {
    public boolean f40457a;
    public final org.telegram.ui.Components.ac0 f40458b;
    public final l30 f40459c;
    public final m30 d;

    public p30(LaunchActivity launchActivity, org.telegram.ui.Components.ac0 ac0Var, l30 l30Var, m30 m30Var) {
        super(launchActivity);
        this.f40458b = ac0Var;
        this.f40459c = l30Var;
        this.d = m30Var;
        this.f40457a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40457a = true;
        org.telegram.ui.Components.ac0 ac0Var = this.f40458b;
        ac0Var.setItemCount(5);
        l30 l30Var = this.f40459c;
        l30Var.setItemCount(5);
        m30 m30Var = this.d;
        m30Var.setItemCount(5);
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        l30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        m30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        this.f40457a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40457a) {
            return;
        }
        super.requestLayout();
    }
}
