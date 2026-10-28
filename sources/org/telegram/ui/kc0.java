package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kc0 extends ig.t0 {
    public final rc0 N;

    public kc0(rc0 rc0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, false, z10);
        this.N = rc0Var;
    }

    @Override
    public final void l() {
        rc0 rc0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.f42949w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(rc0Var.W.J);
        }
        TextView textView = rc0Var.f42942r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rc0Var.W.f14013x)));
        }
        super.l();
    }
}
