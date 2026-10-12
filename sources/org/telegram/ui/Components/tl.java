package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tl extends gg.t0 {
    public final zl N;

    public tl(zl zlVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.N = zlVar;
    }

    @Override
    public final void l() {
        zl zlVar = this.N;
        tl tlVar = zlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = zlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(tlVar.J);
        }
        TextView textView = zlVar.f33426y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, tlVar.f10553x)));
        }
        super.l();
    }
}
