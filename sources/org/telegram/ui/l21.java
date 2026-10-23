package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class l21 implements o21 {
    public final org.telegram.messenger.video.a f39123a;
    public final org.telegram.ui.Components.xc f39124b;
    public final Context f39125c;
    public final ci.k0 d;
    public final org.telegram.messenger.video.d e;

    public l21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f39123a = aVar;
        this.f39124b = xcVar;
        this.f39125c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.f39123a, this.f39124b, this.f39125c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new mv0(25, this.f39123a, this.f39124b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
