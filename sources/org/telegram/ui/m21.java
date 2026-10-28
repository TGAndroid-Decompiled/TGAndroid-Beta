package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m21 implements Runnable {
    public final int f41308a;
    public final org.telegram.messenger.video.a f41309b;
    public final org.telegram.ui.Components.wc f41310c;
    public final Context d;
    public final di.k0 e;

    public m21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, int i10) {
        this.f41308a = i10;
        this.f41309b = aVar;
        this.f41310c = wcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f41308a) {
            case 0:
                this.f41309b.run();
                this.f41310c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f41309b.run();
                this.f41310c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 5), this.e)).j();
                return;
            default:
                this.f41309b.run();
                this.f41310c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 6), this.e)).j();
                return;
        }
    }
}
