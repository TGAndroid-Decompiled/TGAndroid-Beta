package org.telegram.ui;

import android.content.Context;
public final class jy0 implements ky0 {
    public final org.telegram.messenger.video.a f49244a;
    public final org.telegram.ui.Components.kc f49245b;
    public final Context f49246c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49247e;

    public jy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.kc kcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49244a = aVar;
        this.f49245b = kcVar;
        this.f49246c = context;
        this.d = h0Var;
        this.f49247e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new gy0(this.f49244a, this.f49245b, this.f49246c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new iy0(1, this.f49244a, this.f49245b), 200L);
    }

    @Override
    public final void i() {
        this.f49247e.run();
    }
}
