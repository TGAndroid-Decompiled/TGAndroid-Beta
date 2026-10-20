package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d21 implements Runnable {
    public final int f36232a;
    public final org.telegram.messenger.video.a f36233b;
    public final org.telegram.ui.Components.xc f36234c;
    public final Context d;
    public final ci.k0 e;

    public d21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, int i10) {
        this.f36232a = i10;
        this.f36233b = aVar;
        this.f36234c = xcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f36232a) {
            case 0:
                this.f36233b.run();
                this.f36234c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f36233b.run();
                this.f36234c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.d, 5), this.e)).j();
                return;
            default:
                this.f36233b.run();
                this.f36234c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new bv(this.d, 6), this.e)).j();
                return;
        }
    }
}
