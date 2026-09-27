package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cl extends gg.u0 {
    public final il N;

    public cl(il ilVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.N = ilVar;
    }

    @Override
    public final void l() {
        il ilVar = this.N;
        cl clVar = ilVar.R;
        org.telegram.ui.ActionBar.w0 w0Var = ilVar.E;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(clVar.J);
        }
        TextView textView = ilVar.f25196y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, clVar.f9671x)));
        }
        super.l();
    }
}
