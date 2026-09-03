package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f31 implements Runnable {
    public final int f33938a;
    public final org.telegram.messenger.video.a f33939b;
    public final org.telegram.ui.Components.qc f33940c;
    public final Context d;
    public final nh.i0 e;

    public f31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, int i10) {
        this.f33938a = i10;
        this.f33939b = aVar;
        this.f33940c = qcVar;
        this.d = context;
        this.e = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f33938a) {
            case 0:
                this.f33939b.run();
                this.f33940c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 2), this.e)).j();
                return;
            case 1:
                this.f33939b.run();
                this.f33940c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 5), this.e)).j();
                return;
            default:
                this.f33939b.run();
                this.f33940c.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new nv(this.d, 6), this.e)).j();
                return;
        }
    }
}
