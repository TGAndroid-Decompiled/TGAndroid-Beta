package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i31 implements Runnable {
    public final int f37235a;
    public final org.telegram.messenger.video.a f37236b;
    public final org.telegram.ui.Components.yc f37237c;
    public final Context d;
    public final ai.a1 f37238e;

    public i31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, int i10) {
        this.f37235a = i10;
        this.f37236b = aVar;
        this.f37237c = ycVar;
        this.d = context;
        this.f37238e = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f37235a) {
            case 0:
                this.f37236b.run();
                this.f37237c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 2), this.f37238e)).j();
                return;
            case 1:
                this.f37236b.run();
                this.f37237c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 5), this.f37238e)).j();
                return;
            default:
                this.f37236b.run();
                this.f37237c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ov(this.d, 6), this.f37238e)).j();
                return;
        }
    }
}
