package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m40 extends LinearLayout {
    public boolean f36182a;
    public final org.telegram.ui.Components.wc0 f36183b;
    public final i40 f36184c;
    public final j40 d;

    public m40(LaunchActivity launchActivity, org.telegram.ui.Components.wc0 wc0Var, i40 i40Var, j40 j40Var) {
        super(launchActivity);
        this.f36183b = wc0Var;
        this.f36184c = i40Var;
        this.d = j40Var;
        this.f36182a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36182a = true;
        org.telegram.ui.Components.wc0 wc0Var = this.f36183b;
        wc0Var.setItemCount(5);
        i40 i40Var = this.f36184c;
        i40Var.setItemCount(5);
        j40 j40Var = this.d;
        j40Var.setItemCount(5);
        wc0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        i40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36182a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36182a) {
            return;
        }
        super.requestLayout();
    }
}
