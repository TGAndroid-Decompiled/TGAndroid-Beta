package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ic0 extends ig.t0 {
    public final pc0 N;

    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, false, z10);
        this.N = pc0Var;
    }

    @Override
    public final void l() {
        pc0 pc0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.f42453w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(pc0Var.W.J);
        }
        TextView textView = pc0Var.f42446r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.W.f14014x)));
        }
        super.l();
    }
}
