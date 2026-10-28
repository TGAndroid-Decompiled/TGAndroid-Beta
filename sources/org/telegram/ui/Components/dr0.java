package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dr0 extends org.telegram.ui.Cells.k7 {
    public final fr0 N;

    public dr0(fr0 fr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0, u6Var);
        this.N = fr0Var;
    }

    @Override
    public final String a() {
        if (this.N.f28283f.f31032b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
