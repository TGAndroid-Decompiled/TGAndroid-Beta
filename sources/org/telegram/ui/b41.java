package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class b41 implements e41 {
    public final org.telegram.messenger.video.a f34412a;
    public final org.telegram.ui.Components.zc f34413b;
    public final Context f34414c;
    public final bi.s0 d;
    public final org.telegram.messenger.video.d e;

    public b41(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.zc zcVar, Context context, bi.s0 s0Var, org.telegram.messenger.video.d dVar) {
        this.f34412a = aVar;
        this.f34413b = zcVar;
        this.f34414c = context;
        this.d = s0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new x31(this.f34412a, this.f34413b, this.f34414c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new hz0(14, this.f34412a, this.f34413b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
