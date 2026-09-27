package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends LinearLayout {
    public boolean f36322a;
    public final org.telegram.ui.Components.ed0 f36323b;
    public final l40 f36324c;
    public final m40 d;

    public p40(LaunchActivity launchActivity, org.telegram.ui.Components.ed0 ed0Var, l40 l40Var, m40 m40Var) {
        super(launchActivity);
        this.f36323b = ed0Var;
        this.f36324c = l40Var;
        this.d = m40Var;
        this.f36322a = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36322a = true;
        org.telegram.ui.Components.ed0 ed0Var = this.f36323b;
        ed0Var.setItemCount(5);
        l40 l40Var = this.f36324c;
        l40Var.setItemCount(5);
        m40 m40Var = this.d;
        m40Var.setItemCount(5);
        ed0Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        l40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        m40Var.getLayoutParams().height = AndroidUtilities.dp(54.0f) * 5;
        this.f36322a = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f36322a) {
            return;
        }
        super.requestLayout();
    }
}
