package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m31 implements p31 {
    public final org.telegram.messenger.video.a f35469a;
    public final org.telegram.ui.Components.xc f35470b;
    public final Context f35471c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f35469a = aVar;
        this.f35470b = xcVar;
        this.f35471c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.f35469a, this.f35470b, this.f35471c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jx0(24, this.f35469a, this.f35470b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
