package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class iq0 extends org.telegram.ui.Cells.h7 {
    public final kq0 N;

    public iq0(kq0 kq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = kq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f24798f.f27166a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
