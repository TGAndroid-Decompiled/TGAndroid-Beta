package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class er0 extends org.telegram.ui.Cells.g7 {
    public final gr0 N;

    public er0(gr0 gr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = gr0Var;
    }

    @Override
    public final String a() {
        if (this.N.f26813f.f29475a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
