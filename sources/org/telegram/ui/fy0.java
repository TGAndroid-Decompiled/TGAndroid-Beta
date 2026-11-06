package org.telegram.ui;

import android.content.Context;
public final class fy0 implements Runnable {
    public final int f45718a;
    public final org.telegram.messenger.video.a f45719b;
    public final org.telegram.ui.Components.hc f45720c;
    public final Context d;
    public final di.i0 f45721e;

    public fy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, int i7) {
        this.f45718a = i7;
        this.f45719b = aVar;
        this.f45720c = hcVar;
        this.d = context;
        this.f45721e = i0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45718a;
        di.i0 i0Var = this.f45721e;
        Context context = this.d;
        org.telegram.ui.Components.hc hcVar = this.f45720c;
        org.telegram.messenger.video.a aVar = this.f45719b;
        switch (i7) {
            case 0:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 2), i0Var)).j();
                return;
            case 1:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 5), i0Var)).j();
                return;
            default:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 6), i0Var)).j();
                return;
        }
    }
}
