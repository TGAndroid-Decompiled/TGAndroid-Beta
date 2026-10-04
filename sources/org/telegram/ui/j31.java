package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j31 implements Runnable {
    public final int f37569a;
    public final org.telegram.ui.ActionBar.n2 f37570b;
    public final Context f37571c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.yw f37572e;

    public j31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.yw ywVar, int i10) {
        this.f37569a = i10;
        this.f37570b = n2Var;
        this.f37571c = context;
        this.d = d6Var;
        this.f37572e = ywVar;
    }

    @Override
    public final void run() {
        switch (this.f37569a) {
            case 0:
                org.telegram.ui.Components.yc.a0(this.f37570b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f37571c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f37572e);
                return;
            case 1:
                org.telegram.ui.Components.yc.a0(this.f37570b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f37571c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f37572e);
                return;
            default:
                org.telegram.ui.Components.yc.a0(this.f37570b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.f37571c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.f37572e);
                return;
        }
    }
}
