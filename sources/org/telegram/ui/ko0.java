package org.telegram.ui;

import android.net.Uri;
public final class ko0 implements org.telegram.messenger.c20 {
    public final int f47216a;
    public final qo0 f47217b;
    public final boolean f47218c;

    public ko0(qo0 qo0Var, boolean z9, int i7) {
        this.f47216a = i7;
        this.f47217b = qo0Var;
        this.f47218c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f47216a) {
            case 0:
                org.telegram.ui.Components.hc.F(this.f47217b.f49286b.f41380e0, this.f47218c).j();
                return;
            default:
                org.telegram.ui.Components.hc.F(this.f47217b.f49286b.f41380e0, this.f47218c).j();
                return;
        }
    }
}
