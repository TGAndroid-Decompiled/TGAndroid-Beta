package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l21 implements Runnable {
    public final int f40961a;
    public final org.telegram.ui.ActionBar.r2 f40962b;
    public final Context f40963c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final org.telegram.ui.Components.u90 e;

    public l21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.u90 u90Var, int i10) {
        this.f40961a = i10;
        this.f40962b = r2Var;
        this.f40963c = context;
        this.d = u6Var;
        this.e = u90Var;
    }

    @Override
    public final void run() {
        switch (this.f40961a) {
            case 0:
                org.telegram.ui.Components.wc.b0(this.f40962b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f40963c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.wc.b0(this.f40962b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f40963c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.wc.b0(this.f40962b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.f40963c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
