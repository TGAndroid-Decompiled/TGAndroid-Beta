package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e21 implements Runnable {
    public final int f36381a;
    public final org.telegram.ui.ActionBar.n2 f36382b;
    public final Context f36383c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.go0 e;

    public e21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.go0 go0Var, int i10) {
        this.f36381a = i10;
        this.f36382b = n2Var;
        this.f36383c = context;
        this.d = d6Var;
        this.e = go0Var;
    }

    @Override
    public final void run() {
        switch (this.f36381a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f36382b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f36383c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f36382b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f36383c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f36382b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.f36383c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
