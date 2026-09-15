package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f36424a;
    public final org.telegram.ui.ActionBar.n2 f36425b;
    public final Context f36426c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.ny e;

    public p31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ny nyVar, int i10) {
        this.f36424a = i10;
        this.f36425b = n2Var;
        this.f36426c = context;
        this.d = e6Var;
        this.e = nyVar;
    }

    @Override
    public final void run() {
        switch (this.f36424a) {
            case 0:
                org.telegram.ui.Components.vc.a0(this.f36425b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36426c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.vc.a0(this.f36425b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36426c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.vc.a0(this.f36425b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36426c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
