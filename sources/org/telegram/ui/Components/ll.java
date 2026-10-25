package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ll extends ig.t0 {
    public final sl N;

    public ll(sl slVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, z10, false);
        this.N = slVar;
    }

    @Override
    public final void l() {
        sl slVar = this.N;
        ll llVar = slVar.P;
        org.telegram.ui.ActionBar.w0 w0Var = slVar.f32617x;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(llVar.J);
        }
        TextView textView = slVar.f32615w;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, llVar.f14014x)));
        }
        super.l();
    }
}
