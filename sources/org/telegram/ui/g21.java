package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g21 implements Runnable {
    public final int f37471a;
    public final org.telegram.ui.ActionBar.o2 f37472b;
    public final Context f37473c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.ko0 e;

    public g21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ko0 ko0Var, int i10) {
        this.f37471a = i10;
        this.f37472b = o2Var;
        this.f37473c = context;
        this.d = g6Var;
        this.e = ko0Var;
    }

    @Override
    public final void run() {
        switch (this.f37471a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f37472b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37473c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f37472b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37473c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f37472b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37473c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
