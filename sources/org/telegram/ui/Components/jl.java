package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jl extends hg.t0 {
    public final pl N;

    public jl(pl plVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, z10, false);
        this.N = plVar;
    }

    @Override
    public final void l() {
        pl plVar = this.N;
        jl jlVar = plVar.P;
        org.telegram.ui.ActionBar.u0 u0Var = plVar.f29614x;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(jlVar.J);
        }
        TextView textView = plVar.f29612w;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, jlVar.f11847x)));
        }
        super.l();
    }
}
