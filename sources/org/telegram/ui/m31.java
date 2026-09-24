package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m31 implements p31 {
    public final org.telegram.messenger.video.a f35457a;
    public final org.telegram.ui.Components.yc f35458b;
    public final Context f35459c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f35457a = aVar;
        this.f35458b = ycVar;
        this.f35459c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.f35457a, this.f35458b, this.f35459c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ix0(25, this.f35457a, this.f35458b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
