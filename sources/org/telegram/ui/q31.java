package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f40993a;
    public final org.telegram.ui.ActionBar.n2 f40994b;
    public final Context f40995c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.ci0 f40996e;

    public q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ci0 ci0Var, int i10) {
        this.f40993a = i10;
        this.f40994b = n2Var;
        this.f40995c = context;
        this.d = e6Var;
        this.f40996e = ci0Var;
    }

    @Override
    public final void run() {
        switch (this.f40993a) {
            case 0:
                org.telegram.ui.Components.ad.a0(this.f40994b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40995c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40996e);
                return;
            case 1:
                org.telegram.ui.Components.ad.a0(this.f40994b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40995c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40996e);
                return;
            default:
                org.telegram.ui.Components.ad.a0(this.f40994b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40995c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40996e);
                return;
        }
    }
}
