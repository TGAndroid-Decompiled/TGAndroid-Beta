package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ir0 extends org.telegram.ui.Cells.f7 {
    public final kr0 N;

    public ir0(kr0 kr0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.N = kr0Var;
    }

    @Override
    public final String a() {
        if (this.N.f27918f.f30632a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
