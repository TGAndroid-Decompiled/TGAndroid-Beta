package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c21 implements Runnable {
    public final int f35798a;
    public final org.telegram.ui.ActionBar.n2 f35799b;
    public final Context f35800c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final org.telegram.ui.Components.ho0 e;

    public c21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ho0 ho0Var, int i10) {
        this.f35798a = i10;
        this.f35799b = n2Var;
        this.f35800c = context;
        this.d = d6Var;
        this.e = ho0Var;
    }

    @Override
    public final void run() {
        switch (this.f35798a) {
            case 0:
                org.telegram.ui.Components.xc.a0(this.f35799b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35800c, 4), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            case 1:
                org.telegram.ui.Components.xc.a0(this.f35799b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35800c, 3), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
            default:
                org.telegram.ui.Components.xc.a0(this.f35799b).c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.f35800c, 7), this.d)).j();
                AndroidUtilities.runOnUIThread(this.e);
                return;
        }
    }
}
