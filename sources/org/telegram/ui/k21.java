package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k21 implements Runnable {
    public final int f40788a;
    public final org.telegram.messenger.video.a f40789b;
    public final org.telegram.ui.Components.wc f40790c;
    public final Context d;
    public final di.k0 e;

    public k21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, int i10) {
        this.f40788a = i10;
        this.f40789b = aVar;
        this.f40790c = wcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f40788a) {
            case 0:
                this.f40789b.run();
                this.f40790c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f40789b.run();
                this.f40790c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.d, 5), this.e)).j();
                return;
            default:
                this.f40789b.run();
                this.f40790c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new av(this.d, 6), this.e)).j();
                return;
        }
    }
}
