package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xp0 extends org.telegram.ui.Cells.f7 {
    public final zp0 N;

    public xp0(zp0 zp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = zp0Var;
    }

    @Override
    public final String a() {
        if (this.N.f33203f.f26787a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
