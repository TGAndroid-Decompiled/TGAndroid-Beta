package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class b41 implements e41 {
    public final org.telegram.messenger.video.a f34196a;
    public final org.telegram.ui.Components.zc f34197b;
    public final Context f34198c;
    public final bi.s0 d;
    public final org.telegram.messenger.video.d e;

    public b41(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.f34196a = aVar;
        this.f34197b = zcVar;
        this.f34198c = context;
        this.d = s0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new x31(this.f34196a, this.f34197b, this.f34198c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new i11(9, this.f34196a, this.f34197b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
