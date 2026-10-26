package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j21 implements Runnable {
    public final int f40400a;
    public final org.telegram.ui.ActionBar.r2 f40401b;
    public final Context f40402c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final org.telegram.ui.Components.t90 e;

    public j21(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.t90 t90Var, int i10) {
        this.f40400a = i10;
        this.f40401b = r2Var;
        this.f40402c = context;
        this.d = u6Var;
        this.e = t90Var;
    }

    @Override
    public final void run() {
        switch (this.f40400a) {
            case 0:
                org.telegram.ui.Components.wc.b0(this.f40401b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.f40402c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.wc.b0(this.f40401b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.f40402c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.wc.b0(this.f40401b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.f40402c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
