package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class k21 implements Runnable {

    public final int f39582a;

    public final org.telegram.messenger.video.a f39583b;

    public final org.telegram.ui.Components.mc f39584c;
    public final Context d;

    public final jh.h0 f39585e;

    public k21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.mc mcVar, Context context, jh.h0 h0Var, int i10) {
        this.f39582a = i10;
        this.f39583b = aVar;
        this.f39584c = mcVar;
        this.d = context;
        this.f39585e = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f39582a) {
            case 0:
                this.f39583b.run();
                this.f39584c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.d, 2), this.f39585e)).j();
                break;
            case 1:
                this.f39583b.run();
                this.f39584c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.d, 5), this.f39585e)).j();
                break;
            default:
                this.f39583b.run();
                this.f39584c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new fv(this.d, 6), this.f39585e)).j();
                break;
        }
    }
}
