package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bq0 extends org.telegram.ui.Cells.e7 {
    public final dq0 K;

    public bq0(dq0 dq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.K = dq0Var;
    }

    @Override
    public final String a() {
        if (this.K.f26353f.X) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
