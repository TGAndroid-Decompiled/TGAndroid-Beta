package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gd0 extends hg.t0 {
    public final nd0 N;

    public gd0(nd0 nd0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.N = nd0Var;
    }

    @Override
    public final void l() {
        nd0 nd0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = nd0Var.f38675w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nd0Var.W.J);
        }
        TextView textView = nd0Var.f38668r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nd0Var.W.f10512x)));
        }
        super.l();
    }
}
