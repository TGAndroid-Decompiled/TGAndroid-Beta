package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o31 implements r31 {
    public final org.telegram.messenger.video.a f39100a;
    public final org.telegram.ui.Components.yc f39101b;
    public final Context f39102c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f39103e;

    public o31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f39100a = aVar;
        this.f39101b = ycVar;
        this.f39102c = context;
        this.d = a1Var;
        this.f39103e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k31(this.f39100a, this.f39101b, this.f39102c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(22, this.f39100a, this.f39101b), 200L);
    }

    @Override
    public final void c() {
        this.f39103e.run();
    }
}
