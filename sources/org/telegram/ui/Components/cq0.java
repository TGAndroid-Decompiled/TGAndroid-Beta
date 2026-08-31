package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cq0 extends org.telegram.ui.Cells.e7 {
    public final eq0 K;

    public cq0(eq0 eq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.K = eq0Var;
    }

    @Override
    public final String a() {
        if (this.K.f26633f.X) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
