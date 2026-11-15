package org.telegram.ui;

import android.content.Context;
public final class dy0 implements Runnable {
    public final int f46493a;
    public final org.telegram.messenger.video.a f46494b;
    public final org.telegram.ui.Components.cc f46495c;
    public final Context d;
    public final fi.i0 f46496e;

    public dy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, int i7) {
        this.f46493a = i7;
        this.f46494b = aVar;
        this.f46495c = ccVar;
        this.d = context;
        this.f46496e = i0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46493a;
        fi.i0 i0Var = this.f46496e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.f46495c;
        org.telegram.messenger.video.a aVar = this.f46494b;
        switch (i7) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 2), i0Var)).j();
                return;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 5), i0Var)).j();
                return;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 6), i0Var)).j();
                return;
        }
    }
}
