package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vk extends uf.i0 {
    public final cl K;

    public vk(cl clVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, z4, false);
        this.K = clVar;
    }

    @Override
    public final void l() {
        cl clVar = this.K;
        vk vkVar = clVar.O;
        org.telegram.ui.ActionBar.w0 w0Var = clVar.B;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(vkVar.G);
        }
        TextView textView = clVar.f26001y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, vkVar.f48550x)));
        }
        super.l();
    }
}
