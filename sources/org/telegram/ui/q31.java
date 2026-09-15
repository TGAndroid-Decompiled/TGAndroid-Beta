package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q31 implements Runnable {
    public final int f36748a;
    public final org.telegram.messenger.video.a f36749b;
    public final org.telegram.ui.Components.vc f36750c;
    public final Context d;
    public final ai.a1 e;

    public q31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ai.a1 a1Var, int i10) {
        this.f36748a = i10;
        this.f36749b = aVar;
        this.f36750c = vcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f36748a) {
            case 0:
                this.f36749b.run();
                this.f36750c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f36749b.run();
                this.f36750c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 5), this.e)).j();
                return;
            default:
                this.f36749b.run();
                this.f36750c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 6), this.e)).j();
                return;
        }
    }
}
