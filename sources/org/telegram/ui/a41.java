package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class a41 implements d41 {
    public final org.telegram.messenger.video.a f30797a;
    public final org.telegram.ui.Components.wc f30798b;
    public final Context f30799c;
    public final org.telegram.ui.Components.bq0 d;
    public final org.telegram.messenger.video.d e;

    public a41(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, Context context, org.telegram.ui.Components.bq0 bq0Var, org.telegram.messenger.video.d dVar) {
        this.f30797a = aVar;
        this.f30798b = wcVar;
        this.f30799c = context;
        this.d = bq0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new w31(this.f30797a, this.f30798b, this.f30799c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ey0(22, this.f30797a, this.f30798b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
