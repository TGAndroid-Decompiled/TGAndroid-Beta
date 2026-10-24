package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f21 implements Runnable {
    public final int f37176a;
    public final org.telegram.ui.ActionBar.o2 f37177b;
    public final Context f37178c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.Components.jo0 e;

    public f21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.jo0 jo0Var, int i10) {
        this.f37176a = i10;
        this.f37177b = o2Var;
        this.f37178c = context;
        this.d = g6Var;
        this.e = jo0Var;
    }

    @Override
    public final void run() {
        switch (this.f37176a) {
            case 0:
                org.telegram.ui.Components.vc.a0(this.f37177b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37178c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.vc.a0(this.f37177b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37178c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.vc.a0(this.f37177b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f37178c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
