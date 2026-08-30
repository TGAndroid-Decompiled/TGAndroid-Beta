package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class c31 implements f31 {
    public final org.telegram.messenger.video.a f33083a;
    public final org.telegram.ui.Components.qc f33084b;
    public final Context f33085c;
    public final nh.i0 d;
    public final org.telegram.messenger.video.d e;

    public c31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f33083a = aVar;
        this.f33084b = qcVar;
        this.f33085c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new y21(this.f33083a, this.f33084b, this.f33085c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new l01(7, this.f33083a, this.f33084b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
