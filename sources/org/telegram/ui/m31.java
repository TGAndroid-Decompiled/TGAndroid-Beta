package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m31 implements p31 {
    public final org.telegram.messenger.video.a f35560a;
    public final org.telegram.ui.Components.yc f35561b;
    public final Context f35562c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f35560a = aVar;
        this.f35561b = ycVar;
        this.f35562c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.f35560a, this.f35561b, this.f35562c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jx0(24, this.f35560a, this.f35561b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
