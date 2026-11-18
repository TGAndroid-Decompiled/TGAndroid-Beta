package org.telegram.ui;

import android.content.Context;
public final class iy0 implements Runnable {
    public final int f48813a;
    public final org.telegram.messenger.video.a f48814b;
    public final org.telegram.ui.Components.lc f48815c;
    public final Context d;
    public final fi.h0 f48816e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, int i7) {
        this.f48813a = i7;
        this.f48814b = aVar;
        this.f48815c = lcVar;
        this.d = context;
        this.f48816e = h0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f48813a;
        fi.h0 h0Var = this.f48816e;
        Context context = this.d;
        org.telegram.ui.Components.lc lcVar = this.f48815c;
        org.telegram.messenger.video.a aVar = this.f48814b;
        switch (i7) {
            case 0:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 2), h0Var)).j();
                return;
            case 1:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 5), h0Var)).j();
                return;
            default:
                aVar.run();
                lcVar.c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new fu(context, 6), h0Var)).j();
                return;
        }
    }
}
