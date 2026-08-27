package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class mc0 extends pf.i0 {
    public final tc0 J;

    public mc0(tc0 tc0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.J = tc0Var;
    }

    @Override
    public final void l() {
        tc0 tc0Var = this.J;
        org.telegram.ui.ActionBar.v0 v0Var = tc0Var.f42884w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(tc0Var.S.F);
        }
        TextView textView = tc0Var.f42877r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, tc0Var.S.f45747x)));
        }
        super.l();
    }
}
