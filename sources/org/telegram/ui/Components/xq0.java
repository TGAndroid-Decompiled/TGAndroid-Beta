package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xq0 extends org.telegram.ui.Cells.g7 {
    public final zq0 N;

    public xq0(zq0 zq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.N = zq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f33336f.f27121b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
