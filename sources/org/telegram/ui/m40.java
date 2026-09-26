package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m40 extends LinearLayout {
    public boolean f35474a;
    public final org.telegram.ui.Components.ed0 f35475b;
    public final i40 f35476c;
    public final j40 d;

    public m40(LaunchActivity launchActivity, org.telegram.ui.Components.ed0 ed0Var, i40 i40Var, j40 j40Var) {
        super(launchActivity);
        this.f35475b = ed0Var;
        this.f35476c = i40Var;
        this.d = j40Var;
        this.f35474a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f35474a = true;
        org.telegram.ui.Components.ed0 ed0Var = this.f35475b;
        ed0Var.setItemCount(5);
        i40 i40Var = this.f35476c;
        i40Var.setItemCount(5);
        j40 j40Var = this.d;
        j40Var.setItemCount(5);
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        i40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        j40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f35474a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f35474a) {
            return;
        }
        super.requestLayout();
    }
}
