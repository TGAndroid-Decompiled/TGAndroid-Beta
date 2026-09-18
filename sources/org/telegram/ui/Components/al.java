package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class al extends gg.u0 {
    public final gl N;

    public al(gl glVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.N = glVar;
    }

    @Override
    public final void l() {
        gl glVar = this.N;
        al alVar = glVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = glVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(alVar.J);
        }
        TextView textView = glVar.f24453y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, alVar.f9683x)));
        }
        super.l();
    }
}
