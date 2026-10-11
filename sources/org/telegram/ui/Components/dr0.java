package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dr0 extends org.telegram.ui.Cells.g7 {
    public final fr0 N;

    public dr0(fr0 fr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = fr0Var;
    }

    @Override
    public final String a() {
        if (this.N.f26556f.f29232a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
