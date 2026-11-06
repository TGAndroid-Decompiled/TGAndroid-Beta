package org.telegram.ui;

import android.content.Context;
public final class iy0 implements jy0 {
    public final org.telegram.messenger.video.a f46784a;
    public final org.telegram.ui.Components.hc f46785b;
    public final Context f46786c;
    public final di.i0 d;
    public final org.telegram.messenger.video.d f46787e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f46784a = aVar;
        this.f46785b = hcVar;
        this.f46786c = context;
        this.d = i0Var;
        this.f46787e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new fy0(this.f46784a, this.f46785b, this.f46786c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new by0(3, this.f46784a, this.f46785b), 200L);
    }

    @Override
    public final void g() {
        this.f46787e.run();
    }
}
