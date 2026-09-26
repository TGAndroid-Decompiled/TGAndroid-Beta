package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m40 extends LinearLayout {
    public boolean f35473a;
    public final org.telegram.ui.Components.fd0 f35474b;
    public final i40 f35475c;
    public final j40 d;

    public m40(LaunchActivity launchActivity, org.telegram.ui.Components.fd0 fd0Var, i40 i40Var, j40 j40Var) {
        super(launchActivity);
        this.f35474b = fd0Var;
        this.f35475c = i40Var;
        this.d = j40Var;
        this.f35473a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35473a = true;
        org.telegram.ui.Components.fd0 fd0Var = this.f35474b;
        fd0Var.setItemCount(5);
        i40 i40Var = this.f35475c;
        i40Var.setItemCount(5);
        j40 j40Var = this.d;
        j40Var.setItemCount(5);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        i40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f35473a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35473a) {
            return;
        }
        super.requestLayout();
    }
}
