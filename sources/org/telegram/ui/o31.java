package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o31 implements r31 {
    public final org.telegram.messenger.video.a f39105a;
    public final org.telegram.ui.Components.yc f39106b;
    public final Context f39107c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f39108e;

    public o31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f39105a = aVar;
        this.f39106b = ycVar;
        this.f39107c = context;
        this.d = a1Var;
        this.f39108e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k31(this.f39105a, this.f39106b, this.f39107c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(22, this.f39105a, this.f39106b), 200L);
    }

    @Override
    public final void c() {
        this.f39108e.run();
    }
}
