package org.telegram.ui;

import android.content.Context;
public final class ky0 implements ly0 {
    public final org.telegram.messenger.video.a f49418a;
    public final org.telegram.ui.Components.lc f49419b;
    public final Context f49420c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49421e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49418a = aVar;
        this.f49419b = lcVar;
        this.f49420c = context;
        this.d = h0Var;
        this.f49421e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.f49418a, this.f49419b, this.f49420c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new tr0(27, this.f49418a, this.f49419b), 200L);
    }

    @Override
    public final void h() {
        this.f49421e.run();
    }
}
