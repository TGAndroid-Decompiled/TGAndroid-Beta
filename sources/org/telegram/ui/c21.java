package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c21 implements Runnable {
    public final int f35794a;
    public final org.telegram.ui.ActionBar.n2 f35795b;
    public final Context f35796c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.go0 e;

    public c21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.go0 go0Var, int i10) {
        this.f35794a = i10;
        this.f35795b = n2Var;
        this.f35796c = context;
        this.d = d6Var;
        this.e = go0Var;
    }

    @Override
    public final void run() {
        switch (this.f35794a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f35795b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35796c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f35795b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35796c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f35795b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35796c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
