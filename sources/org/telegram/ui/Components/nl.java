package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nl extends hg.t0 {
    public final tl N;

    public nl(tl tlVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.N = tlVar;
    }

    @Override
    public final void l() {
        tl tlVar = this.N;
        nl nlVar = tlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = tlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nlVar.J);
        }
        TextView textView = tlVar.f29120y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nlVar.f10516x)));
        }
        super.l();
    }
}
