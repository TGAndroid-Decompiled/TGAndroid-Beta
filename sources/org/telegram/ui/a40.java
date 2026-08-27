package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class a40 extends LinearLayout {

    public boolean f36371a;

    public final org.telegram.ui.Components.fc0 f36372b;

    public final w30 f36373c;
    public final x30 d;

    public a40(LaunchActivity launchActivity, org.telegram.ui.Components.fc0 fc0Var, w30 w30Var, x30 x30Var) {
        super(launchActivity);
        this.f36372b = fc0Var;
        this.f36373c = w30Var;
        this.d = x30Var;
        this.f36371a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36371a = true;
        org.telegram.ui.Components.fc0 fc0Var = this.f36372b;
        fc0Var.setItemCount(5);
        w30 w30Var = this.f36373c;
        w30Var.setItemCount(5);
        x30 x30Var = this.d;
        x30Var.setItemCount(5);
        fc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        w30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        x30Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36371a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36371a) {
            return;
        }
        super.requestLayout();
    }
}
