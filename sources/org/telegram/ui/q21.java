package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class q21 implements t21 {
    public final org.telegram.messenger.video.a f41652a;
    public final org.telegram.ui.Components.oc f41653b;
    public final Context f41654c;
    public final ih.j0 d;
    public final org.telegram.messenger.video.d f41655e;

    public q21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.oc ocVar, Context context, ih.j0 j0Var, org.telegram.messenger.video.d dVar) {
        this.f41652a = aVar;
        this.f41653b = ocVar;
        this.f41654c = context;
        this.d = j0Var;
        this.f41655e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new l21(this.f41652a, this.f41653b, this.f41654c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new n21(1, this.f41652a, this.f41653b), 200L);
    }

    @Override
    public final void c() {
        this.f41655e.run();
    }
}
