package org.telegram.ui;

import android.content.Context;
public final class ky0 implements ly0 {
    public final org.telegram.messenger.video.a f49377a;
    public final org.telegram.ui.Components.lc f49378b;
    public final Context f49379c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49380e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49377a = aVar;
        this.f49378b = lcVar;
        this.f49379c = context;
        this.d = h0Var;
        this.f49380e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.f49377a, this.f49378b, this.f49379c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new tr0(25, this.f49377a, this.f49378b), 200L);
    }

    @Override
    public final void h() {
        this.f49380e.run();
    }
}
