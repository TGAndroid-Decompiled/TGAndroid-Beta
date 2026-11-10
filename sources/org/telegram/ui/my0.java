package org.telegram.ui;

import android.content.Context;
public final class my0 implements ny0 {
    public final org.telegram.messenger.video.a f48071a;
    public final org.telegram.ui.Components.gc f48072b;
    public final Context f48073c;
    public final di.i0 d;
    public final org.telegram.messenger.video.d f48074e;

    public my0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.gc gcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f48071a = aVar;
        this.f48072b = gcVar;
        this.f48073c = context;
        this.d = i0Var;
        this.f48074e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new jy0(this.f48071a, this.f48072b, this.f48073c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new rw0(5, this.f48071a, this.f48072b), 200L);
    }

    @Override
    public final void g() {
        this.f48074e.run();
    }
}
