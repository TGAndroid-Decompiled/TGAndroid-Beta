package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class hp0 extends org.telegram.ui.Cells.b7 {
    public final jp0 J;

    public hp0(jp0 jp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.J = jp0Var;
    }

    @Override
    public final String a() {
        return this.J.f29774f.W ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
