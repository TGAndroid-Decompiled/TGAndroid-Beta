package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mq0 extends org.telegram.ui.Cells.h7 {
    public final oq0 N;

    public mq0(oq0 oq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = oq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f27172f.f30097a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
