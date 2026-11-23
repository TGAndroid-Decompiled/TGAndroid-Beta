package org.telegram.ui;

import android.content.Context;
public final class ky0 implements ly0 {
    public final org.telegram.messenger.video.a f49397a;
    public final org.telegram.ui.Components.lc f49398b;
    public final Context f49399c;
    public final fi.h0 d;
    public final org.telegram.messenger.video.d f49400e;

    public ky0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.lc lcVar, Context context, fi.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f49397a = aVar;
        this.f49398b = lcVar;
        this.f49399c = context;
        this.d = h0Var;
        this.f49400e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.h3(new iy0(this.f49397a, this.f49398b, this.f49399c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.h3(new ur0(25, this.f49397a, this.f49398b), 200L);
    }

    @Override
    public final void h() {
        this.f49400e.run();
    }
}
