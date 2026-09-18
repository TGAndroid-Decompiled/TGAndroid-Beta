package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cd0 extends gg.u0 {
    public final jd0 N;

    public cd0(jd0 jd0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.N = jd0Var;
    }

    @Override
    public final void l() {
        jd0 jd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = jd0Var.f34839w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(jd0Var.W.J);
        }
        TextView textView = jd0Var.f34832r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, jd0Var.W.f9683x)));
        }
        super.l();
    }
}
