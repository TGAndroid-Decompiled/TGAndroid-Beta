package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class j21 implements Runnable {

    public final int f39240a;

    public final org.telegram.ui.ActionBar.n2 f39241b;

    public final Context f39242c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final org.telegram.ui.Components.lg0 f39243e;

    public j21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.lg0 lg0Var, int i10) {
        this.f39240a = i10;
        this.f39241b = n2Var;
        this.f39242c = context;
        this.d = c6Var;
        this.f39243e = lg0Var;
    }

    @Override
    public final void run() {
        switch (this.f39240a) {
            case 0:
                org.telegram.ui.Components.mc.a0(this.f39241b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.f39242c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39243e);
                break;
            case 1:
                org.telegram.ui.Components.mc.a0(this.f39241b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.f39242c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39243e);
                break;
            default:
                org.telegram.ui.Components.mc.a0(this.f39241b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.f39242c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f39243e);
                break;
        }
    }
}
