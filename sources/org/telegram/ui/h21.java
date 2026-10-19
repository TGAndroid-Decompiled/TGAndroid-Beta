package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class h21 implements k21 {
    public final org.telegram.messenger.video.a f37465a;
    public final org.telegram.ui.Components.xc f37466b;
    public final Context f37467c;
    public final ci.k0 d;
    public final org.telegram.messenger.video.d e;

    public h21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f37465a = aVar;
        this.f37466b = xcVar;
        this.f37467c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new d21(this.f37465a, this.f37466b, this.f37467c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(25, this.f37465a, this.f37466b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
