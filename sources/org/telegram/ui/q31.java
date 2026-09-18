package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f36674a;
    public final org.telegram.messenger.video.a f36675b;
    public final org.telegram.ui.Components.xc f36676c;
    public final Context d;
    public final ai.a1 e;

    public q31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, int i10) {
        this.f36674a = i10;
        this.f36675b = aVar;
        this.f36676c = xcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f36674a) {
            case 0:
                this.f36675b.run();
                this.f36676c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f36675b.run();
                this.f36676c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 5), this.e)).j();
                return;
            default:
                this.f36675b.run();
                this.f36676c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new pv(this.d, 6), this.e)).j();
                return;
        }
    }
}
