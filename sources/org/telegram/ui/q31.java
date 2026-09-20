package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f36754a;
    public final org.telegram.ui.ActionBar.n2 f36755b;
    public final Context f36756c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Components.wn0 e;

    public q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.wn0 wn0Var, int i10) {
        this.f36754a = i10;
        this.f36755b = n2Var;
        this.f36756c = context;
        this.d = f6Var;
        this.e = wn0Var;
    }

    @Override
    public final void run() {
        switch (this.f36754a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f36755b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36756c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f36755b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36756c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f36755b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.f36756c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
