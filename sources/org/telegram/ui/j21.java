package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class j21 implements m21 {
    public final org.telegram.messenger.video.a f38023a;
    public final org.telegram.ui.Components.xc f38024b;
    public final Context f38025c;
    public final ci.k0 d;
    public final org.telegram.messenger.video.d e;

    public j21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f38023a = aVar;
        this.f38024b = xcVar;
        this.f38025c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f21(this.f38023a, this.f38024b, this.f38025c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new lv0(25, this.f38023a, this.f38024b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
