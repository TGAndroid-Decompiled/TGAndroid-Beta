package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o21 implements q21 {
    public final org.telegram.messenger.video.a f42075a;
    public final org.telegram.ui.Components.wc f42076b;
    public final Context f42077c;
    public final di.k0 d;
    public final org.telegram.messenger.video.d e;

    public o21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f42075a = aVar;
        this.f42076b = wcVar;
        this.f42077c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.f42075a, this.f42076b, this.f42077c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new fy0(15, this.f42075a, this.f42076b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
