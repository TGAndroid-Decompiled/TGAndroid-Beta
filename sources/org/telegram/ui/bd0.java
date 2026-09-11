package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bd0 extends hg.u0 {
    public final id0 N;

    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
        this.N = id0Var;
    }

    @Override
    public final void l() {
        id0 id0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = id0Var.f37332w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(id0Var.W.J);
        }
        TextView textView = id0Var.f37325r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, id0Var.W.f11002x)));
        }
        super.l();
    }
}
