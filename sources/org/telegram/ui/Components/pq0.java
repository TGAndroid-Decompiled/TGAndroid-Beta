package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pq0 extends org.telegram.ui.Cells.g7 {
    public final rq0 N;

    public pq0(rq0 rq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = rq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f30492f.f33596a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
