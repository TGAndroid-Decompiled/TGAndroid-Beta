package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dl extends gg.u0 {
    public final jl N;

    public dl(jl jlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = jlVar;
    }

    @Override
    public final void l() {
        jl jlVar = this.N;
        dl dlVar = jlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = jlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(dlVar.J);
        }
        TextView textView = jlVar.f27832y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, dlVar.f10524x)));
        }
        super.l();
    }
}
