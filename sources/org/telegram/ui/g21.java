package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g21 implements Runnable {
    public final int f37426a;
    public final org.telegram.messenger.video.a f37427b;
    public final org.telegram.ui.Components.vc f37428c;
    public final Context d;
    public final ci.k0 e;

    public g21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ci.k0 k0Var, int i10) {
        this.f37426a = i10;
        this.f37427b = aVar;
        this.f37428c = vcVar;
        this.d = context;
        this.e = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f37426a) {
            case 0:
                this.f37427b.run();
                this.f37428c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f37427b.run();
                this.f37428c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 5), this.e)).j();
                return;
            default:
                this.f37427b.run();
                this.f37428c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 6), this.e)).j();
                return;
        }
    }
}
