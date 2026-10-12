package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ol extends hg.t0 {
    public final ul N;

    public ol(ul ulVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.N = ulVar;
    }

    @Override
    public final void l() {
        ul ulVar = this.N;
        ol olVar = ulVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = ulVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(olVar.J);
        }
        TextView textView = ulVar.f29734y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, olVar.f10512x)));
        }
        super.l();
    }
}
