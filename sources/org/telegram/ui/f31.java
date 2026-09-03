package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f31 implements Runnable {
    public final int f36647a;
    public final org.telegram.messenger.video.a f36648b;
    public final org.telegram.ui.Components.qc f36649c;
    public final Context d;
    public final oh.h0 f36650e;

    public f31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, oh.h0 h0Var, int i10) {
        this.f36647a = i10;
        this.f36648b = aVar;
        this.f36649c = qcVar;
        this.d = context;
        this.f36650e = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f36647a) {
            case 0:
                this.f36648b.run();
                this.f36649c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 2), this.f36650e)).j();
                return;
            case 1:
                this.f36648b.run();
                this.f36649c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 5), this.f36650e)).j();
                return;
            default:
                this.f36648b.run();
                this.f36649c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 6), this.f36650e)).j();
                return;
        }
    }
}
