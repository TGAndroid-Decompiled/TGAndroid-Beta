package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cl extends gg.u0 {
    public final il N;

    public cl(il ilVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = ilVar;
    }

    @Override
    public final void l() {
        il ilVar = this.N;
        cl clVar = ilVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = ilVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(clVar.J);
        }
        TextView textView = ilVar.f25148y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, clVar.f9665x)));
        }
        super.l();
    }
}
