package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tq0 extends org.telegram.ui.Cells.e7 {
    public final vq0 N;

    public tq0(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = vq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f31896f.f25652a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
