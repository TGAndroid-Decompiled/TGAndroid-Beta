package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f36331a;
    public final org.telegram.ui.ActionBar.n2 f36332b;
    public final Context f36333c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.uw e;

    public p31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.uw uwVar, int i10) {
        this.f36331a = i10;
        this.f36332b = n2Var;
        this.f36333c = context;
        this.d = e6Var;
        this.e = uwVar;
    }

    @Override
    public final void run() {
        switch (this.f36331a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f36332b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36333c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f36332b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36333c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f36332b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36333c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
