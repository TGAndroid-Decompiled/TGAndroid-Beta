package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k31 implements Runnable {
    public final int f34905a;
    public final org.telegram.messenger.video.a f34906b;
    public final org.telegram.ui.Components.xc f34907c;
    public final Context d;
    public final ai.a1 e;

    public k31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, int i10) {
        this.f34905a = i10;
        this.f34906b = aVar;
        this.f34907c = xcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f34905a) {
            case 0:
                this.f34906b.run();
                this.f34907c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f34906b.run();
                this.f34907c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 5), this.e)).j();
                return;
            default:
                this.f34906b.run();
                this.f34907c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new mv(this.d, 6), this.e)).j();
                return;
        }
    }
}
