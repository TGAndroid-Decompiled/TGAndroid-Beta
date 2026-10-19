package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gc0 extends hg.t0 {
    public final nc0 N;

    public gc0(nc0 nc0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = nc0Var;
    }

    @Override
    public final void l() {
        nc0 nc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = nc0Var.f39524w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nc0Var.W.J);
        }
        TextView textView = nc0Var.f39517r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nc0Var.W.f11822x)));
        }
        super.l();
    }
}
