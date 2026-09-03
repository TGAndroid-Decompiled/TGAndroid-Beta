package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class j31 implements m31 {
    public final org.telegram.messenger.video.a f37831a;
    public final org.telegram.ui.Components.qc f37832b;
    public final Context f37833c;
    public final oh.h0 d;
    public final org.telegram.messenger.video.d f37834e;

    public j31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, oh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f37831a = aVar;
        this.f37832b = qcVar;
        this.f37833c = context;
        this.d = h0Var;
        this.f37834e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f37831a, this.f37832b, this.f37833c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new h21(5, this.f37831a, this.f37832b), 200L);
    }

    @Override
    public final void c() {
        this.f37834e.run();
    }
}
