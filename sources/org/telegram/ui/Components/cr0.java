package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cr0 extends org.telegram.ui.Cells.k7 {
    public final er0 N;

    public cr0(er0 er0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0, u6Var);
        this.N = er0Var;
    }

    @Override
    public final String a() {
        if (this.N.f27971f.f30699b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
