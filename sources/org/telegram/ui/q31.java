package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f41069a;
    public final org.telegram.messenger.video.a f41070b;
    public final org.telegram.ui.Components.ad f41071c;
    public final Context d;
    public final ai.a1 f41072e;

    public q31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.ad adVar, Context context, ai.a1 a1Var, int i10) {
        this.f41069a = i10;
        this.f41070b = aVar;
        this.f41071c = adVar;
        this.d = context;
        this.f41072e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41069a) {
            case 0:
                this.f41070b.run();
                this.f41071c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 2), this.f41072e)).j();
                return;
            case 1:
                this.f41070b.run();
                this.f41071c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 5), this.f41072e)).j();
                return;
            default:
                this.f41070b.run();
                this.f41071c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 6), this.f41072e)).j();
                return;
        }
    }
}
