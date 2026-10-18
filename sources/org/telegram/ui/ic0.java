package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ic0 extends hg.t0 {
    public final pc0 N;

    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = pc0Var;
    }

    @Override
    public final void l() {
        pc0 pc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = pc0Var.f40045w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(pc0Var.W.J);
        }
        TextView textView = pc0Var.f40038r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.W.f11821x)));
        }
        super.l();
    }
}
