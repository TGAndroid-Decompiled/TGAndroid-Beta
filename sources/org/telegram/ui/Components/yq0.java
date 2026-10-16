package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yq0 extends org.telegram.ui.Cells.f7 {
    public final ar0 N;

    public yq0(ar0 ar0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.N = ar0Var;
    }

    @Override
    public final String a() {
        if (this.N.f23288f.f25740a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
