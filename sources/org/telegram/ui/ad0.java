package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ad0 extends gg.t0 {
    public final hd0 N;

    public ad0(hd0 hd0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.N = hd0Var;
    }

    @Override
    public final void l() {
        hd0 hd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = hd0Var.f38282w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(hd0Var.W.J);
        }
        TextView textView = hd0Var.f38275r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, hd0Var.W.f10555x)));
        }
        super.l();
    }
}
