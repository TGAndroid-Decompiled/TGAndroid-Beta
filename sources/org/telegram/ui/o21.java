package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o21 implements q21 {
    public final org.telegram.messenger.video.a f42078a;
    public final org.telegram.ui.Components.wc f42079b;
    public final Context f42080c;
    public final di.k0 d;
    public final org.telegram.messenger.video.d e;

    public o21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f42078a = aVar;
        this.f42079b = wcVar;
        this.f42080c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.f42078a, this.f42079b, this.f42080c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new fy0(15, this.f42078a, this.f42079b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
