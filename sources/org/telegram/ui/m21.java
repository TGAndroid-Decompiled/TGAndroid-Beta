package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m21 implements Runnable {
    public final int f40355a;
    public final org.telegram.messenger.video.a f40356b;
    public final org.telegram.ui.Components.tc f40357c;
    public final Context d;
    public final lh.h0 f40358e;

    public m21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.tc tcVar, Context context, lh.h0 h0Var, int i10) {
        this.f40355a = i10;
        this.f40356b = aVar;
        this.f40357c = tcVar;
        this.d = context;
        this.f40358e = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f40355a) {
            case 0:
                this.f40356b.run();
                this.f40357c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 2), this.f40358e)).j();
                return;
            case 1:
                this.f40356b.run();
                this.f40357c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 5), this.f40358e)).j();
                return;
            default:
                this.f40356b.run();
                this.f40357c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new dv(this.d, 6), this.f40358e)).j();
                return;
        }
    }
}
