package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class nk extends pf.i0 {
    public final tk J;

    public nk(tk tkVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.J = tkVar;
    }

    @Override
    public final void l() {
        tk tkVar = this.J;
        nk nkVar = tkVar.N;
        org.telegram.ui.ActionBar.v0 v0Var = tkVar.A;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(nkVar.F);
        }
        TextView textView = tkVar.f32826y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nkVar.f45747x)));
        }
        super.l();
    }
}
