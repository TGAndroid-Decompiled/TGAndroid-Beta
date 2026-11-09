package org.telegram.ui;

import android.content.Context;
public final class iy0 implements Runnable {
    public final int f46785a;
    public final org.telegram.messenger.video.a f46786b;
    public final org.telegram.ui.Components.hc f46787c;
    public final Context d;
    public final di.i0 f46788e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, int i7) {
        this.f46785a = i7;
        this.f46786b = aVar;
        this.f46787c = hcVar;
        this.d = context;
        this.f46788e = i0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f46785a;
        di.i0 i0Var = this.f46788e;
        Context context = this.d;
        org.telegram.ui.Components.hc hcVar = this.f46787c;
        org.telegram.messenger.video.a aVar = this.f46786b;
        switch (i7) {
            case 0:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 2), i0Var)).j();
                return;
            case 1:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 5), i0Var)).j();
                return;
            default:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new du(context, 6), i0Var)).j();
                return;
        }
    }
}
