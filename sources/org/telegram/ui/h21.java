package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h21 implements Runnable {
    public final int f37717a;
    public final org.telegram.messenger.video.a f37718b;
    public final org.telegram.ui.Components.xc f37719c;
    public final Context d;
    public final ci.k0 e;

    public h21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, int i10) {
        this.f37717a = i10;
        this.f37718b = aVar;
        this.f37719c = xcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f37717a) {
            case 0:
                this.f37718b.run();
                this.f37719c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f37718b.run();
                this.f37719c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 5), this.e)).j();
                return;
            default:
                this.f37718b.run();
                this.f37719c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 6), this.e)).j();
                return;
        }
    }
}
