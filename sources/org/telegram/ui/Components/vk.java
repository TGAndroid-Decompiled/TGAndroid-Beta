package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vk extends rf.j0 {
    public final bl J;

    public vk(bl blVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.J = blVar;
    }

    @Override
    public final void l() {
        bl blVar = this.J;
        vk vkVar = blVar.N;
        org.telegram.ui.ActionBar.w0 w0Var = blVar.A;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(vkVar.F);
        }
        TextView textView = blVar.f27180y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, vkVar.f47182x)));
        }
        super.l();
    }
}
