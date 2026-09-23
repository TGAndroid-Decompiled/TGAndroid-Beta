package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o40 extends LinearLayout {
    public boolean f35677a;
    public final org.telegram.ui.Components.tc0 f35678b;
    public final k40 f35679c;
    public final l40 d;

    public o40(LaunchActivity launchActivity, org.telegram.ui.Components.tc0 tc0Var, k40 k40Var, l40 l40Var) {
        super(launchActivity);
        this.f35678b = tc0Var;
        this.f35679c = k40Var;
        this.d = l40Var;
        this.f35677a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35677a = true;
        org.telegram.ui.Components.tc0 tc0Var = this.f35678b;
        tc0Var.setItemCount(5);
        k40 k40Var = this.f35679c;
        k40Var.setItemCount(5);
        l40 l40Var = this.d;
        l40Var.setItemCount(5);
        tc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        k40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f35677a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35677a) {
            return;
        }
        super.requestLayout();
    }
}
