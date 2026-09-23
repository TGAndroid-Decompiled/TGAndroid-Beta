package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class n31 implements q31 {
    public final org.telegram.messenger.video.a f35429a;
    public final org.telegram.ui.Components.xc f35430b;
    public final Context f35431c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d e;

    public n31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.xc xcVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f35429a = aVar;
        this.f35430b = xcVar;
        this.f35431c = context;
        this.d = a1Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j31(this.f35429a, this.f35430b, this.f35431c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(19, this.f35429a, this.f35430b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
