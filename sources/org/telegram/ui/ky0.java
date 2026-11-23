package org.telegram.ui;

import android.content.Context;
public final class ky0 implements ly0 {
    public final org.telegram.messenger.video.a f49422a;
    public final org.telegram.ui.Components.lc f49423b;
    public final Context f49424c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49425e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49422a = aVar;
        this.f49423b = lcVar;
        this.f49424c = context;
        this.d = h0Var;
        this.f49425e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.f49422a, this.f49423b, this.f49424c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new tr0(27, this.f49422a, this.f49423b), 200L);
    }

    @Override
    public final void h() {
        this.f49425e.run();
    }
}
