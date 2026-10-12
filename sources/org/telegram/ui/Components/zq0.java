package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zq0 extends org.telegram.ui.Cells.g7 {
    public final br0 N;

    public zq0(br0 br0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.N = br0Var;
    }

    @Override
    public final String a() {
        if (this.N.f23840f.f26457a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
