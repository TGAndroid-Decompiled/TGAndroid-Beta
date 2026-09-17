package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yp0 extends org.telegram.ui.Cells.f7 {
    public final aq0 N;

    public yp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = aq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f22460f.f24984a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
