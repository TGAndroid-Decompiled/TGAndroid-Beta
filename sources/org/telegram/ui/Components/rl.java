package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rl extends gg.t0 {
    public final xl N;

    public rl(xl xlVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.N = xlVar;
    }

    @Override
    public final void l() {
        xl xlVar = this.N;
        rl rlVar = xlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = xlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(rlVar.J);
        }
        TextView textView = xlVar.f32986y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rlVar.f10555x)));
        }
        super.l();
    }
}
