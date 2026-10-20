package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ll extends hg.t0 {
    public final rl N;

    public ll(rl rlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = rlVar;
    }

    @Override
    public final void l() {
        rl rlVar = this.N;
        ll llVar = rlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = rlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(llVar.J);
        }
        TextView textView = rlVar.f29974y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, llVar.f11820x)));
        }
        super.l();
    }
}
