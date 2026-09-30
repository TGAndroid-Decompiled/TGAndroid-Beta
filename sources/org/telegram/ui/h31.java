package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h31 implements Runnable {
    public final int f34208a;
    public final org.telegram.ui.ActionBar.m2 f34209b;
    public final Context f34210c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.xw e;

    public h31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.xw xwVar, int i10) {
        this.f34208a = i10;
        this.f34209b = m2Var;
        this.f34210c = context;
        this.d = d6Var;
        this.e = xwVar;
    }

    @Override
    public final void run() {
        switch (this.f34208a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.f34209b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.f34210c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.yc.a0(this.f34209b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.f34210c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.yc.a0(this.f34209b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.f34210c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
