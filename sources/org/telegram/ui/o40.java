package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o40 extends LinearLayout {
    public boolean f36643a;
    public final org.telegram.ui.Components.xc0 f36644b;
    public final k40 f36645c;
    public final l40 d;

    public o40(LaunchActivity launchActivity, org.telegram.ui.Components.xc0 xc0Var, k40 k40Var, l40 l40Var) {
        super(launchActivity);
        this.f36644b = xc0Var;
        this.f36645c = k40Var;
        this.d = l40Var;
        this.f36643a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36643a = true;
        org.telegram.ui.Components.xc0 xc0Var = this.f36644b;
        xc0Var.setItemCount(5);
        k40 k40Var = this.f36645c;
        k40Var.setItemCount(5);
        l40 l40Var = this.d;
        l40Var.setItemCount(5);
        xc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        k40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36643a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36643a) {
            return;
        }
        super.requestLayout();
    }
}
