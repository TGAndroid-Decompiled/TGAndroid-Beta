package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bl extends gg.u0 {
    public final hl N;

    public bl(hl hlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = hlVar;
    }

    @Override
    public final void l() {
        hl hlVar = this.N;
        bl blVar = hlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = hlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(blVar.J);
        }
        TextView textView = hlVar.f24745y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, blVar.f9666x)));
        }
        super.l();
    }
}
