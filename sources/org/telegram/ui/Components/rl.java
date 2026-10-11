package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rl extends gg.t0 {
    public final xl N;

    public rl(xl xlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = xlVar;
    }

    @Override
    public final void l() {
        xl xlVar = this.N;
        rl rlVar = xlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = xlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(rlVar.J);
        }
        TextView textView = xlVar.f33024y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rlVar.f10554x)));
        }
        super.l();
    }
}
