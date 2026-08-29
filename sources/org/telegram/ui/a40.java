package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends LinearLayout {
    public boolean f36420a;
    public final org.telegram.ui.Components.qc0 f36421b;
    public final w30 f36422c;
    public final x30 d;

    public a40(LaunchActivity launchActivity, org.telegram.ui.Components.qc0 qc0Var, w30 w30Var, x30 x30Var) {
        super(launchActivity);
        this.f36421b = qc0Var;
        this.f36422c = w30Var;
        this.d = x30Var;
        this.f36420a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36420a = true;
        org.telegram.ui.Components.qc0 qc0Var = this.f36421b;
        qc0Var.setItemCount(5);
        w30 w30Var = this.f36422c;
        w30Var.setItemCount(5);
        x30 x30Var = this.d;
        x30Var.setItemCount(5);
        qc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        w30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36420a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36420a) {
            return;
        }
        super.requestLayout();
    }
}
