package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uq0 extends org.telegram.ui.Cells.e7 {
    public final wq0 N;

    public uq0(wq0 wq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = wq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f32202f.f25978b0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
