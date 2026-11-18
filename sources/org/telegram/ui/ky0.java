package org.telegram.ui;

import android.content.Context;
public final class ky0 implements ly0 {
    public final org.telegram.messenger.video.a f49371a;
    public final org.telegram.ui.Components.lc f49372b;
    public final Context f49373c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49374e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49371a = aVar;
        this.f49372b = lcVar;
        this.f49373c = context;
        this.d = h0Var;
        this.f49374e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.f49371a, this.f49372b, this.f49373c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new tr0(25, this.f49371a, this.f49372b), 200L);
    }

    @Override
    public final void h() {
        this.f49374e.run();
    }
}
