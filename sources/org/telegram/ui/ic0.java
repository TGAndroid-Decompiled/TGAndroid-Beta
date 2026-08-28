package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ic0 extends of.q0 {
    public final pc0 J;

    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, false, z10);
        this.J = pc0Var;
    }

    @Override
    public final void l() {
        pc0 pc0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.f41470w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(pc0Var.S.F);
        }
        TextView textView = pc0Var.f41463r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.S.f19259x)));
        }
        super.l();
    }
}
