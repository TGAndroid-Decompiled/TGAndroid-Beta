package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k31 implements Runnable {
    public final int f37819a;
    public final org.telegram.messenger.video.a f37820b;
    public final org.telegram.ui.Components.yc f37821c;
    public final Context d;
    public final ai.a1 f37822e;

    public k31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, int i10) {
        this.f37819a = i10;
        this.f37820b = aVar;
        this.f37821c = ycVar;
        this.d = context;
        this.f37822e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f37819a) {
            case 0:
                this.f37820b.run();
                this.f37821c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 2), this.f37822e)).j();
                return;
            case 1:
                this.f37820b.run();
                this.f37821c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 5), this.f37822e)).j();
                return;
            default:
                this.f37820b.run();
                this.f37821c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 6), this.f37822e)).j();
                return;
        }
    }
}
