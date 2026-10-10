package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends LinearLayout {
    public boolean f40708a;
    public final org.telegram.ui.Components.vd0 f40709b;
    public final l40 f40710c;
    public final m40 d;

    public p40(LaunchActivity launchActivity, org.telegram.ui.Components.vd0 vd0Var, l40 l40Var, m40 m40Var) {
        super(launchActivity);
        this.f40709b = vd0Var;
        this.f40710c = l40Var;
        this.d = m40Var;
        this.f40708a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f40708a = true;
        org.telegram.ui.Components.vd0 vd0Var = this.f40709b;
        vd0Var.setItemCount(5);
        l40 l40Var = this.f40710c;
        l40Var.setItemCount(5);
        m40 m40Var = this.d;
        m40Var.setItemCount(5);
        vd0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        m40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f40708a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40708a) {
            return;
        }
        super.requestLayout();
    }
}
