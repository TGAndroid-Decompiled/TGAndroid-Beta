package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends LinearLayout {
    public boolean f40664a;
    public final org.telegram.ui.Components.ud0 f40665b;
    public final l40 f40666c;
    public final m40 d;

    public p40(LaunchActivity launchActivity, org.telegram.ui.Components.ud0 ud0Var, l40 l40Var, m40 m40Var) {
        super(launchActivity);
        this.f40665b = ud0Var;
        this.f40666c = l40Var;
        this.d = m40Var;
        this.f40664a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40664a = true;
        org.telegram.ui.Components.ud0 ud0Var = this.f40665b;
        ud0Var.setItemCount(5);
        l40 l40Var = this.f40666c;
        l40Var.setItemCount(5);
        m40 m40Var = this.d;
        m40Var.setItemCount(5);
        ud0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        m40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f40664a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40664a) {
            return;
        }
        super.requestLayout();
    }
}
