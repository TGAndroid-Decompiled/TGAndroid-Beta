package org.telegram.ui;

import android.content.Context;
public final class iy0 implements jy0 {
    public final org.telegram.messenger.video.a f46785a;
    public final org.telegram.ui.Components.hc f46786b;
    public final Context f46787c;
    public final di.i0 d;
    public final org.telegram.messenger.video.d f46788e;

    public iy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f46785a = aVar;
        this.f46786b = hcVar;
        this.f46787c = context;
        this.d = i0Var;
        this.f46788e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new fy0(this.f46785a, this.f46786b, this.f46787c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new by0(3, this.f46785a, this.f46786b), 200L);
    }

    @Override
    public final void g() {
        this.f46788e.run();
    }
}
