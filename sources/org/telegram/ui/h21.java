package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class h21 implements k21 {
    public final org.telegram.messenger.video.a f37491a;
    public final org.telegram.ui.Components.xc f37492b;
    public final Context f37493c;
    public final ci.k0 d;
    public final org.telegram.messenger.video.d e;

    public h21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f37491a = aVar;
        this.f37492b = xcVar;
        this.f37493c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new d21(this.f37491a, this.f37492b, this.f37493c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(25, this.f37491a, this.f37492b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
