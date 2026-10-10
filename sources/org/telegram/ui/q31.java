package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f41039a;
    public final org.telegram.ui.ActionBar.n2 f41040b;
    public final Context f41041c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.di0 f41042e;

    public q31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.di0 di0Var, int i10) {
        this.f41039a = i10;
        this.f41040b = n2Var;
        this.f41041c = context;
        this.d = e6Var;
        this.f41042e = di0Var;
    }

    @Override
    public final void run() {
        switch (this.f41039a) {
            case 0:
                org.telegram.ui.Components.ad.a0(this.f41040b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f41041c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41042e);
                return;
            case 1:
                org.telegram.ui.Components.ad.a0(this.f41040b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f41041c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41042e);
                return;
            default:
                org.telegram.ui.Components.ad.a0(this.f41040b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.f41041c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f41042e);
                return;
        }
    }
}
