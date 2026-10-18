package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends LinearLayout {
    public boolean f35263a;
    public final org.telegram.ui.Components.od0 f35264b;
    public final w30 f35265c;
    public final x30 d;

    public a40(LaunchActivity launchActivity, org.telegram.ui.Components.od0 od0Var, w30 w30Var, x30 x30Var) {
        super(launchActivity);
        this.f35264b = od0Var;
        this.f35265c = w30Var;
        this.d = x30Var;
        this.f35263a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35263a = true;
        org.telegram.ui.Components.od0 od0Var = this.f35264b;
        od0Var.setItemCount(5);
        w30 w30Var = this.f35265c;
        w30Var.setItemCount(5);
        x30 x30Var = this.d;
        x30Var.setItemCount(5);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        w30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f35263a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35263a) {
            return;
        }
        super.requestLayout();
    }
}
