package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cr0 extends org.telegram.ui.Cells.g7 {
    public final er0 N;

    public cr0(er0 er0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0, e6Var);
        this.N = er0Var;
    }

    @Override
    public final String a() {
        if (this.N.f26151f.f28893a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
