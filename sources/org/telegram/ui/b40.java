package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b40 extends LinearLayout {
    public boolean f35915a;
    public final org.telegram.ui.Components.od0 f35916b;
    public final x30 f35917c;
    public final y30 d;

    public b40(LaunchActivity launchActivity, org.telegram.ui.Components.od0 od0Var, x30 x30Var, y30 y30Var) {
        super(launchActivity);
        this.f35916b = od0Var;
        this.f35917c = x30Var;
        this.d = y30Var;
        this.f35915a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35915a = true;
        org.telegram.ui.Components.od0 od0Var = this.f35916b;
        od0Var.setItemCount(5);
        x30 x30Var = this.f35917c;
        x30Var.setItemCount(5);
        y30 y30Var = this.d;
        y30Var.setItemCount(5);
        od0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        y30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f35915a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35915a) {
            return;
        }
        super.requestLayout();
    }
}
