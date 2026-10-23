package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yq0 extends org.telegram.ui.Cells.g7 {
    public final ar0 N;

    public yq0(ar0 ar0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.N = ar0Var;
    }

    @Override
    public final String a() {
        if (this.N.f24831f.f27409b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
