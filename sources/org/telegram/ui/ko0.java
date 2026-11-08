package org.telegram.ui;

import android.net.Uri;
public final class ko0 implements org.telegram.messenger.c20 {
    public final int f47221a;
    public final qo0 f47222b;
    public final boolean f47223c;

    public ko0(qo0 qo0Var, boolean z9, int i7) {
        this.f47221a = i7;
        this.f47222b = qo0Var;
        this.f47223c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f47221a) {
            case 0:
                org.telegram.ui.Components.hc.F(this.f47222b.f49289b.f41384e0, this.f47223c).j();
                return;
            default:
                org.telegram.ui.Components.hc.F(this.f47222b.f49289b.f41384e0, this.f47223c).j();
                return;
        }
    }
}
