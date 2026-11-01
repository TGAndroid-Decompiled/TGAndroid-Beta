package org.telegram.ui;

import android.widget.LinearLayout;
public final class o30 extends LinearLayout {
    public boolean f40034a;
    public final org.telegram.ui.Components.ac0 f40035b;
    public final k30 f40036c;
    public final l30 d;

    public o30(LaunchActivity launchActivity, org.telegram.ui.Components.ac0 ac0Var, k30 k30Var, l30 l30Var) {
        super(launchActivity);
        this.f40035b = ac0Var;
        this.f40036c = k30Var;
        this.d = l30Var;
        this.f40034a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40034a = true;
        org.telegram.ui.Components.ac0 ac0Var = this.f40035b;
        ac0Var.setItemCount(5);
        k30 k30Var = this.f40036c;
        k30Var.setItemCount(5);
        l30 l30Var = this.d;
        l30Var.setItemCount(5);
        ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        k30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        l30Var.getLayoutParams().height = org.telegram.messenger.i0.L(54.0f) * 5;
        this.f40034a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40034a) {
            return;
        }
        super.requestLayout();
    }
}
