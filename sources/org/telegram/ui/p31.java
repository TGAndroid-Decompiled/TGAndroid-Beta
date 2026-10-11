package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f40725a;
    public final org.telegram.ui.ActionBar.m2 f40726b;
    public final Context f40727c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.fi0 f40728e;

    public p31(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.fi0 fi0Var, int i10) {
        this.f40725a = i10;
        this.f40726b = m2Var;
        this.f40727c = context;
        this.d = d6Var;
        this.f40728e = fi0Var;
    }

    @Override
    public final void run() {
        switch (this.f40725a) {
            case 0:
                org.telegram.ui.Components.ad.a0(this.f40726b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40727c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40728e);
                return;
            case 1:
                org.telegram.ui.Components.ad.a0(this.f40726b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40727c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40728e);
                return;
            default:
                org.telegram.ui.Components.ad.a0(this.f40726b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f40727c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40728e);
                return;
        }
    }
}
