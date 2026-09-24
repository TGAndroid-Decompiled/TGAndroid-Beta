package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kq0 extends org.telegram.ui.Cells.g7 {
    public final mq0 N;

    public kq0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = mq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f26564f.f28861a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
