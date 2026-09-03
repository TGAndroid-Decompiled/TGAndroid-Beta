package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class j31 implements m31 {
    public final org.telegram.messenger.video.a f35075a;
    public final org.telegram.ui.Components.qc f35076b;
    public final Context f35077c;
    public final nh.i0 d;
    public final org.telegram.messenger.video.d e;

    public j31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, nh.i0 i0Var, org.telegram.messenger.video.d dVar) {
        this.f35075a = aVar;
        this.f35076b = qcVar;
        this.f35077c = context;
        this.d = i0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f35075a, this.f35076b, this.f35077c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new b11(6, this.f35075a, this.f35076b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
