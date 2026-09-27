package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j31 implements Runnable {
    public final int f34580a;
    public final org.telegram.ui.ActionBar.o2 f34581b;
    public final Context f34582c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.Components.jy e;

    public j31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.jy jyVar, int i10) {
        this.f34580a = i10;
        this.f34581b = o2Var;
        this.f34582c = context;
        this.d = e6Var;
        this.e = jyVar;
    }

    @Override
    public final void run() {
        switch (this.f34580a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f34581b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f34582c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f34581b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f34582c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f34581b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f34582c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
