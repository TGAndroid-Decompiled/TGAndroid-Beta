package org.telegram.ui;

import android.content.Context;
public final class dy0 implements Runnable {
    public final int f46503a;
    public final org.telegram.messenger.video.a f46504b;
    public final org.telegram.ui.Components.cc f46505c;
    public final Context d;
    public final fi.i0 f46506e;

    public dy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, int i7) {
        this.f46503a = i7;
        this.f46504b = aVar;
        this.f46505c = ccVar;
        this.d = context;
        this.f46506e = i0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46503a;
        fi.i0 i0Var = this.f46506e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.f46505c;
        org.telegram.messenger.video.a aVar = this.f46504b;
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
