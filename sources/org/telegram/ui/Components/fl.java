package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fl extends fg.u0 {
    public final ll N;

    public fl(ll llVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, z10, false);
        this.N = llVar;
    }

    @Override
    public final void l() {
        ll llVar = this.N;
        fl flVar = llVar.R;
        org.telegram.ui.ActionBar.w0 w0Var = llVar.E;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(flVar.J);
        }
        TextView textView = llVar.f25052y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, flVar.f7966x)));
        }
        super.l();
    }
}
