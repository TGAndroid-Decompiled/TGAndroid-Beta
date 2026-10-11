package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f40759a;
    public final org.telegram.ui.ActionBar.m2 f40760b;
    public final Context f40761c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.ei0 f40762e;

    public p31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ei0 ei0Var, int i10) {
        this.f40759a = i10;
        this.f40760b = m2Var;
        this.f40761c = context;
        this.d = d6Var;
        this.f40762e = ei0Var;
    }

    @Override
    public final void run() {
        switch (this.f40759a) {
            case 0:
                org.telegram.ui.Components.ad.a0(this.f40760b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40761c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40762e);
                return;
            case 1:
                org.telegram.ui.Components.ad.a0(this.f40760b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40761c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40762e);
                return;
            default:
                org.telegram.ui.Components.ad.a0(this.f40760b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40761c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40762e);
                return;
        }
    }
}
