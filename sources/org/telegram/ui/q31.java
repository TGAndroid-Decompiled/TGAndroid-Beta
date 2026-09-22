package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f36777a;
    public final org.telegram.ui.ActionBar.n2 f36778b;
    public final Context f36779c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.yn0 e;

    public q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.yn0 yn0Var, int i10) {
        this.f36777a = i10;
        this.f36778b = n2Var;
        this.f36779c = context;
        this.d = f6Var;
        this.e = yn0Var;
    }

    @Override
    public final void run() {
        switch (this.f36777a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f36778b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36779c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f36778b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36779c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f36778b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36779c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
