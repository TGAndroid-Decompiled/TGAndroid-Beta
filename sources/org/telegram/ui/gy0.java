package org.telegram.ui;

import android.content.Context;
public final class gy0 implements hy0 {
    public final org.telegram.messenger.video.a f47551a;
    public final org.telegram.ui.Components.cc f47552b;
    public final Context f47553c;
    public final fi.i0 d;
    public final org.telegram.messenger.video.d f47554e;

    public gy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f47551a = aVar;
        this.f47552b = ccVar;
        this.f47553c = context;
        this.d = i0Var;
        this.f47554e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new dy0(this.f47551a, this.f47552b, this.f47553c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new fy0(0, this.f47551a, this.f47552b), 200L);
    }

    @Override
    public final void g() {
        this.f47554e.run();
    }
}
