package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f40 extends LinearLayout {
    public boolean f39148a;
    public final org.telegram.ui.Components.nd0 f39149b;
    public final b40 f39150c;
    public final c40 d;

    public f40(LaunchActivity launchActivity, org.telegram.ui.Components.nd0 nd0Var, b40 b40Var, c40 c40Var) {
        super(launchActivity);
        this.f39149b = nd0Var;
        this.f39150c = b40Var;
        this.d = c40Var;
        this.f39148a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39148a = true;
        org.telegram.ui.Components.nd0 nd0Var = this.f39149b;
        nd0Var.setItemCount(5);
        b40 b40Var = this.f39150c;
        b40Var.setItemCount(5);
        c40 c40Var = this.d;
        c40Var.setItemCount(5);
        nd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        b40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        c40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f39148a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f39148a) {
            return;
        }
        super.requestLayout();
    }
}
