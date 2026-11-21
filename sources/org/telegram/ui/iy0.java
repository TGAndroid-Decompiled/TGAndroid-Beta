package org.telegram.ui;

import android.content.Context;
public final class iy0 implements Runnable {
    public final int f48835a;
    public final org.telegram.messenger.video.a f48836b;
    public final org.telegram.ui.Components.lc f48837c;
    public final Context d;
    public final fi.h0 f48838e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, int i7) {
        this.f48835a = i7;
        this.f48836b = aVar;
        this.f48837c = lcVar;
        this.d = context;
        this.f48838e = h0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f48835a;
        fi.h0 h0Var = this.f48838e;
        Context context = this.d;
        org.telegram.ui.Components.lc lcVar = this.f48837c;
        org.telegram.messenger.video.a aVar = this.f48836b;
        switch (i7) {
            case 0:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 2), h0Var)).j();
                return;
            case 1:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 5), h0Var)).j();
                return;
            default:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new fu(context, 6), h0Var)).j();
                return;
        }
    }
}
