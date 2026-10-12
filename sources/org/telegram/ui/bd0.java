package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bd0 extends gg.t0 {
    public final id0 N;

    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.N = id0Var;
    }

    @Override
    public final void l() {
        id0 id0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = id0Var.f38874w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(id0Var.W.J);
        }
        TextView textView = id0Var.f38867r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, id0Var.W.f10553x)));
        }
        super.l();
    }
}
