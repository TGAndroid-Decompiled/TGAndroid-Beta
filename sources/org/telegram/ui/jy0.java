package org.telegram.ui;

import android.content.Context;
public final class jy0 implements Runnable {
    public final int f47104a;
    public final org.telegram.messenger.video.a f47105b;
    public final org.telegram.ui.Components.gc f47106c;
    public final Context d;
    public final di.i0 f47107e;

    public jy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.gc gcVar, Context context, di.i0 i0Var, int i7) {
        this.f47104a = i7;
        this.f47105b = aVar;
        this.f47106c = gcVar;
        this.d = context;
        this.f47107e = i0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f47104a;
        di.i0 i0Var = this.f47107e;
        Context context = this.d;
        org.telegram.ui.Components.gc gcVar = this.f47106c;
        org.telegram.messenger.video.a aVar = this.f47105b;
        switch (i7) {
            case 0:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 2), i0Var)).j();
                return;
            case 1:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 5), i0Var)).j();
                return;
            default:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 6), i0Var)).j();
                return;
        }
    }
}
