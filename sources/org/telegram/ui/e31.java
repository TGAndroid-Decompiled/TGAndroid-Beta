package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e31 implements Runnable {
    public final int f36351a;
    public final org.telegram.ui.ActionBar.p2 f36352b;
    public final Context f36353c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.b90 f36354e;

    public e31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.b90 b90Var, int i10) {
        this.f36351a = i10;
        this.f36352b = p2Var;
        this.f36353c = context;
        this.d = g6Var;
        this.f36354e = b90Var;
    }

    @Override
    public final void run() {
        switch (this.f36351a) {
            case 0:
                org.telegram.ui.Components.qc.a0(this.f36352b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f36353c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36354e);
                return;
            case 1:
                org.telegram.ui.Components.qc.a0(this.f36352b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f36353c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36354e);
                return;
            default:
                org.telegram.ui.Components.qc.a0(this.f36352b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.f36353c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f36354e);
                return;
        }
    }
}
