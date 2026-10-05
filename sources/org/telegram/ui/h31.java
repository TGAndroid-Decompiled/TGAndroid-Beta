package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h31 implements Runnable {
    public final int f36879a;
    public final org.telegram.ui.ActionBar.n2 f36880b;
    public final Context f36881c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.yw f36882e;

    public h31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yw ywVar, int i10) {
        this.f36879a = i10;
        this.f36880b = n2Var;
        this.f36881c = context;
        this.d = d6Var;
        this.f36882e = ywVar;
    }

    @Override
    public final void run() {
        switch (this.f36879a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.f36880b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36881c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36882e);
                return;
            case 1:
                org.telegram.ui.Components.yc.a0(this.f36880b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36881c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36882e);
                return;
            default:
                org.telegram.ui.Components.yc.a0(this.f36880b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f36881c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36882e);
                return;
        }
    }
}
