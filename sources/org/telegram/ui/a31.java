package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a31 implements Runnable {
    public final int f35005a;
    public final org.telegram.messenger.video.a f35006b;
    public final org.telegram.ui.Components.qc f35007c;
    public final Context d;
    public final oh.h0 f35008e;

    public a31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, oh.h0 h0Var, int i10) {
        this.f35005a = i10;
        this.f35006b = aVar;
        this.f35007c = qcVar;
        this.d = context;
        this.f35008e = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f35005a) {
            case 0:
                this.f35006b.run();
                this.f35007c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 2), this.f35008e)).j();
                return;
            case 1:
                this.f35006b.run();
                this.f35007c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 5), this.f35008e)).j();
                return;
            default:
                this.f35006b.run();
                this.f35007c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 6), this.f35008e)).j();
                return;
        }
    }
}
