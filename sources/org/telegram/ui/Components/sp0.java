package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sp0 extends org.telegram.ui.Cells.c7 {
    public final up0 J;

    public sp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.J = up0Var;
    }

    @Override
    public final String a() {
        if (this.J.f33290f.W) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
