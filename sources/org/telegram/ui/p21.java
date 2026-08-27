package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class p21 implements s21 {

    public final org.telegram.messenger.video.a f41251a;

    public final org.telegram.ui.Components.mc f41252b;

    public final Context f41253c;
    public final jh.h0 d;

    public final org.telegram.messenger.video.d f41254e;

    public p21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.mc mcVar, Context context, jh.h0 h0Var, org.telegram.messenger.video.d dVar) {
        this.f41251a = aVar;
        this.f41252b = mcVar;
        this.f41253c = context;
        this.d = h0Var;
        this.f41254e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new k21(this.f41251a, this.f41252b, this.f41253c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new m21(1, this.f41251a, this.f41252b), 200L);
    }

    @Override
    public final void c() {
        this.f41254e.run();
    }
}
