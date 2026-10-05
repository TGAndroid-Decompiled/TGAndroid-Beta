package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class m31 implements p31 {
    public final org.telegram.messenger.video.a f38464a;
    public final org.telegram.ui.Components.yc f38465b;
    public final Context f38466c;
    public final ai.a1 d;
    public final org.telegram.messenger.video.d f38467e;

    public m31(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, Context context, ai.a1 a1Var, org.telegram.messenger.video.d dVar) {
        this.f38464a = aVar;
        this.f38465b = ycVar;
        this.f38466c = context;
        this.d = a1Var;
        this.f38467e = dVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.f38464a, this.f38465b, this.f38466c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new wx0(22, this.f38464a, this.f38465b), 200L);
    }

    @Override
    public final void c() {
        this.f38467e.run();
    }
}
