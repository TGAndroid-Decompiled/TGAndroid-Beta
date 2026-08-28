package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l21 implements Runnable {
    public final int f39980a;
    public final org.telegram.messenger.video.a f39981b;
    public final org.telegram.ui.Components.oc f39982c;
    public final Context d;
    public final ih.j0 f39983e;

    public l21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.oc ocVar, Context context, ih.j0 j0Var, int i9) {
        this.f39980a = i9;
        this.f39981b = aVar;
        this.f39982c = ocVar;
        this.d = context;
        this.f39983e = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f39980a) {
            case 0:
                this.f39981b.run();
                this.f39982c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 2), this.f39983e)).j();
                return;
            case 1:
                this.f39981b.run();
                this.f39982c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 5), this.f39983e)).j();
                return;
            default:
                this.f39981b.run();
                this.f39982c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new cv(this.d, 6), this.f39983e)).j();
                return;
        }
    }
}
