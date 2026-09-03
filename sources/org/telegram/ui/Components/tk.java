package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tk extends tf.i0 {
    public final al K;

    public tk(al alVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, z4, false);
        this.K = alVar;
    }

    @Override
    public final void l() {
        al alVar = this.K;
        tk tkVar = alVar.O;
        org.telegram.ui.ActionBar.w0 w0Var = alVar.B;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(tkVar.G);
        }
        TextView textView = alVar.f23427y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, tkVar.f44736x)));
        }
        super.l();
    }
}
