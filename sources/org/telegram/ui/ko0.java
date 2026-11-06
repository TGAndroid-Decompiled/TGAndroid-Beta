package org.telegram.ui;

import android.net.Uri;
public final class ko0 implements org.telegram.messenger.c20 {
    public final int f47217a;
    public final qo0 f47218b;
    public final boolean f47219c;

    public ko0(qo0 qo0Var, boolean z9, int i7) {
        this.f47217a = i7;
        this.f47218b = qo0Var;
        this.f47219c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f47217a) {
            case 0:
                org.telegram.ui.Components.hc.F(this.f47218b.f49287b.f41381e0, this.f47219c).j();
                return;
            default:
                org.telegram.ui.Components.hc.F(this.f47218b.f49287b.f41381e0, this.f47219c).j();
                return;
        }
    }
}
