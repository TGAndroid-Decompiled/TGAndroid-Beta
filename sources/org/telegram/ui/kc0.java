package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kc0 extends rf.j0 {
    public final rc0 J;

    public kc0(rc0 rc0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.J = rc0Var;
    }

    @Override
    public final void l() {
        rc0 rc0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.f42061w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(rc0Var.S.F);
        }
        TextView textView = rc0Var.f42054r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rc0Var.S.f47182x)));
        }
        super.l();
    }
}
