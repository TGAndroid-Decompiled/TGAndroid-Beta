package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class e31 implements h31 {
    public final org.telegram.messenger.video.a f36386a;
    public final org.telegram.ui.Components.qc f36387b;
    public final Context f36388c;
    public final oh.h0 d;
    public final org.telegram.messenger.video.d f36389e;

    public e31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.qc qcVar, Context context, oh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f36386a = aVar;
        this.f36387b = qcVar;
        this.f36388c = context;
        this.d = h0Var;
        this.f36389e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new a31(this.f36386a, this.f36387b, this.f36388c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new w01(6, this.f36386a, this.f36387b), 200L);
    }

    @Override
    public final void c() {
        this.f36389e.run();
    }
}
