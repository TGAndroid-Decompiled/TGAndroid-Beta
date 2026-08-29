package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class q21 implements t21 {
    public final org.telegram.messenger.video.a f41508a;
    public final org.telegram.ui.Components.tc f41509b;
    public final Context f41510c;
    public final lh.h0 d;
    public final org.telegram.messenger.video.d f41511e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.tc tcVar, Context context, lh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f41508a = aVar;
        this.f41509b = tcVar;
        this.f41510c = context;
        this.d = h0Var;
        this.f41511e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new m21(this.f41508a, this.f41509b, this.f41510c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new av0(28, this.f41508a, this.f41509b), 200L);
    }

    @Override
    public final void c() {
        this.f41511e.run();
    }
}
