package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class k21 implements n21 {
    public final org.telegram.messenger.video.a f38725a;
    public final org.telegram.ui.Components.vc f38726b;
    public final Context f38727c;
    public final ci.k0 d;
    public final org.telegram.messenger.video.d e;

    public k21(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, Context context, ci.k0 k0Var, org.telegram.messenger.video.d dVar) {
        this.f38725a = aVar;
        this.f38726b = vcVar;
        this.f38727c = context;
        this.d = k0Var;
        this.e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new g21(this.f38725a, this.f38726b, this.f38727c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new lv0(25, this.f38725a, this.f38726b), 200L);
    }

    @Override
    public final void c() {
        this.e.run();
    }
}
