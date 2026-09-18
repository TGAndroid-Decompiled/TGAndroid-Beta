package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lq0 extends org.telegram.ui.Cells.g7 {
    public final nq0 N;

    public lq0(nq0 nq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0, e6Var);
        this.N = nq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f26746f.f29712a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
