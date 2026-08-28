package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rk extends of.q0 {
    public final xk J;

    public rk(xk xkVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, z10, false);
        this.J = xkVar;
    }

    @Override
    public final void l() {
        xk xkVar = this.J;
        rk rkVar = xkVar.N;
        org.telegram.ui.ActionBar.w0 w0Var = xkVar.A;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(rkVar.F);
        }
        TextView textView = xkVar.f34716y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rkVar.f19259x)));
        }
        super.l();
    }
}
