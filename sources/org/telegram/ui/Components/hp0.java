package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hp0 extends org.telegram.ui.Cells.e7 {
    public final jp0 J;

    public hp0(jp0 jp0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0, b6Var);
        this.J = jp0Var;
    }

    @Override
    public final String a() {
        if (this.J.f29818f.W) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
