package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rq0 extends org.telegram.ui.Cells.g7 {
    public final tq0 N;

    public rq0(tq0 tq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = tq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f31214f.f25051a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
