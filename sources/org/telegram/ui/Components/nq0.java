package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nq0 extends org.telegram.ui.Cells.g7 {
    public final pq0 N;

    public nq0(pq0 pq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = pq0Var;
    }

    @Override
    public final String a() {
        if (this.N.f27459f.f30454a0) {
            return LocaleController.getString(R.string.RepostToStory);
        }
        return LocaleController.getString(R.string.FwdMyStory);
    }
}
