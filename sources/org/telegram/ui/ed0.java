package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ed0 extends hg.t0 {
    public final ld0 N;

    public ed0(ld0 ld0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.N = ld0Var;
    }

    @Override
    public final void l() {
        ld0 ld0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = ld0Var.f37711w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(ld0Var.W.J);
        }
        TextView textView = ld0Var.f37704r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, ld0Var.W.f10516x)));
        }
        super.l();
    }
}
