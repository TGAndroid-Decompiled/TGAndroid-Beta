package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lc0 extends hg.t0 {
    public final sc0 N;

    public lc0(sc0 sc0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, false, z10);
        this.N = sc0Var;
    }

    @Override
    public final void l() {
        sc0 sc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = sc0Var.f41375w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(sc0Var.W.J);
        }
        TextView textView = sc0Var.f41368r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, sc0Var.W.f11847x)));
        }
        super.l();
    }
}
