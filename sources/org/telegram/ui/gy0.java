package org.telegram.ui;

import android.content.Context;
public final class gy0 implements hy0 {
    public final org.telegram.messenger.video.a f47541a;
    public final org.telegram.ui.Components.cc f47542b;
    public final Context f47543c;
    public final fi.i0 d;
    public final org.telegram.messenger.video.d f47544e;

    public gy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f47541a = aVar;
        this.f47542b = ccVar;
        this.f47543c = context;
        this.d = i0Var;
        this.f47544e = dVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.g0.i3(new dy0(this.f47541a, this.f47542b, this.f47543c, this.d, 2), 200L);
    }

    @Override
    public final void d() {
        org.telegram.messenger.g0.i3(new fy0(0, this.f47541a, this.f47542b), 200L);
    }

    @Override
    public final void g() {
        this.f47544e.run();
    }
}
