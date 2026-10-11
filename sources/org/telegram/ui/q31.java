package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f41035a;
    public final org.telegram.messenger.video.a f41036b;
    public final org.telegram.ui.Components.ad f41037c;
    public final Context d;
    public final ai.a1 f41038e;

    public q31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, int i10) {
        this.f41035a = i10;
        this.f41036b = aVar;
        this.f41037c = adVar;
        this.d = context;
        this.f41038e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41035a) {
            case 0:
                this.f41036b.run();
                this.f41037c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 2), this.f41038e)).j();
                return;
            case 1:
                this.f41036b.run();
                this.f41037c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 5), this.f41038e)).j();
                return;
            default:
                this.f41036b.run();
                this.f41037c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 6), this.f41038e)).j();
                return;
        }
    }
}
