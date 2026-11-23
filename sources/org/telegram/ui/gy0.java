package org.telegram.ui;

import android.content.Context;
public final class gy0 implements Runnable {
    public final int f48376a;
    public final org.telegram.messenger.video.a f48377b;
    public final org.telegram.ui.Components.kc f48378c;
    public final Context d;
    public final fi.h0 f48379e;

    public gy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.kc kcVar, Context context, fi.h0 h0Var, int i7) {
        this.f48376a = i7;
        this.f48377b = aVar;
        this.f48378c = kcVar;
        this.d = context;
        this.f48379e = h0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f48376a;
        fi.h0 h0Var = this.f48379e;
        Context context = this.d;
        org.telegram.ui.Components.kc kcVar = this.f48378c;
        org.telegram.messenger.video.a aVar = this.f48377b;
        switch (i7) {
            case 0:
                aVar.run();
                kcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 2), h0Var)).j();
                return;
            case 1:
                aVar.run();
                kcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 5), h0Var)).j();
                return;
            default:
                aVar.run();
                kcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new eu(context, 6), h0Var)).j();
                return;
        }
    }
}
