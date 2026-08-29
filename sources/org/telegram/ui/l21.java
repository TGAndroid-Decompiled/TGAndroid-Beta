package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l21 implements Runnable {
    public final int f40076a;
    public final org.telegram.ui.ActionBar.o2 f40077b;
    public final Context f40078c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final org.telegram.ui.Components.ii0 f40079e;

    public l21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ii0 ii0Var, int i10) {
        this.f40076a = i10;
        this.f40077b = o2Var;
        this.f40078c = context;
        this.d = c6Var;
        this.f40079e = ii0Var;
    }

    @Override
    public final void run() {
        switch (this.f40076a) {
            case 0:
                org.telegram.ui.Components.tc.a0(this.f40077b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f40078c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40079e);
                return;
            case 1:
                org.telegram.ui.Components.tc.a0(this.f40077b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f40078c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40079e);
                return;
            default:
                org.telegram.ui.Components.tc.a0(this.f40077b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f40078c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f40079e);
                return;
        }
    }
}
