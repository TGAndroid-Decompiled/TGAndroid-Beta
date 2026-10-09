package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f40995a;
    public final org.telegram.ui.ActionBar.n2 f40996b;
    public final Context f40997c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.ci0 f40998e;

    public q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ci0 ci0Var, int i10) {
        this.f40995a = i10;
        this.f40996b = n2Var;
        this.f40997c = context;
        this.d = e6Var;
        this.f40998e = ci0Var;
    }

    @Override
    public final void run() {
        switch (this.f40995a) {
            case 0:
                org.telegram.ui.Components.ad.a0(this.f40996b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40997c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40998e);
                return;
            case 1:
                org.telegram.ui.Components.ad.a0(this.f40996b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40997c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40998e);
                return;
            default:
                org.telegram.ui.Components.ad.a0(this.f40996b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f40997c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40998e);
                return;
        }
    }
}
