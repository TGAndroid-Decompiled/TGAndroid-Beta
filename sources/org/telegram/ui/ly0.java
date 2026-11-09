package org.telegram.ui;

import android.content.Context;
public final class ly0 implements my0 {
    public final org.telegram.messenger.video.a f47696a;
    public final org.telegram.ui.Components.hc f47697b;
    public final Context f47698c;
    public final di.i0 d;
    public final org.telegram.messenger.video.d f47699e;

    public ly0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f47696a = aVar;
        this.f47697b = hcVar;
        this.f47698c = context;
        this.d = i0Var;
        this.f47699e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new iy0(this.f47696a, this.f47697b, this.f47698c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new ax0(4, this.f47696a, this.f47697b), 200L);
    }

    @Override
    public final void g() {
        this.f47699e.run();
    }
}
