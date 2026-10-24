package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kc0 extends hg.t0 {
    public final rc0 N;

    public kc0(rc0 rc0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, false, z10);
        this.N = rc0Var;
    }

    @Override
    public final void l() {
        rc0 rc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = rc0Var.f41120w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(rc0Var.W.J);
        }
        TextView textView = rc0Var.f41113r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rc0Var.W.f11847x)));
        }
        super.l();
    }
}
