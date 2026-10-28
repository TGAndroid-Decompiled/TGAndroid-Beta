package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class q21 implements s21 {
    public final org.telegram.messenger.video.a f42583a;
    public final org.telegram.ui.Components.wc f42584b;
    public final Context f42585c;
    public final di.k0 d;
    public final org.telegram.messenger.video.d e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, di.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f42583a = aVar;
        this.f42584b = wcVar;
        this.f42585c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new m21(this.f42583a, this.f42584b, this.f42585c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(16, this.f42583a, this.f42584b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
