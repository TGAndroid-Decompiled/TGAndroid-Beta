package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dd0 extends gg.u0 {
    public final kd0 N;

    public dd0(kd0 kd0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
        this.N = kd0Var;
    }

    @Override
    public final void l() {
        kd0 kd0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = kd0Var.f35247w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(kd0Var.W.J);
        }
        TextView textView = kd0Var.f35240r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, kd0Var.W.f9684x)));
        }
        super.l();
    }
}
