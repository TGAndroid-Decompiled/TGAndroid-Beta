package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i31 implements Runnable {
    public final int f33974a;
    public final org.telegram.ui.ActionBar.n2 f33975b;
    public final Context f33976c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.oy e;

    public i31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.oy oyVar, int i10) {
        this.f33974a = i10;
        this.f33975b = n2Var;
        this.f33976c = context;
        this.d = d6Var;
        this.e = oyVar;
    }

    @Override
    public final void run() {
        switch (this.f33974a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f33975b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f33976c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f33975b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f33976c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f33975b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new lv(this.f33976c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
