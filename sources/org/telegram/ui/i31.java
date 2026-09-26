package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i31 implements Runnable {
    public final int f34359a;
    public final org.telegram.messenger.video.a f34360b;
    public final org.telegram.ui.Components.xc f34361c;
    public final Context d;
    public final ai.a1 e;

    public i31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, int i10) {
        this.f34359a = i10;
        this.f34360b = aVar;
        this.f34361c = xcVar;
        this.d = context;
        this.e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f34359a) {
            case 0:
                this.f34360b.run();
                this.f34361c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f34360b.run();
                this.f34361c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 5), this.e)).j();
                return;
            default:
                this.f34360b.run();
                this.f34361c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new kv(this.d, 6), this.e)).j();
                return;
        }
    }
}
