package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o31 implements r31 {
    public final org.telegram.messenger.video.a f39099a;
    public final org.telegram.ui.Components.yc f39100b;
    public final Context f39101c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f39102e;

    public o31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f39099a = aVar;
        this.f39100b = ycVar;
        this.f39101c = context;
        this.d = a1Var;
        this.f39102e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k31(this.f39099a, this.f39100b, this.f39101c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(22, this.f39099a, this.f39100b), 200L);
    }

    @Override
    public final void c() {
        this.f39102e.run();
    }
}
