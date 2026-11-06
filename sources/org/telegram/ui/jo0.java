package org.telegram.ui;

import android.net.Uri;
public final class jo0 implements org.telegram.messenger.c20 {
    public final int f46993a;
    public final po0 f46994b;
    public final boolean f46995c;

    public jo0(po0 po0Var, boolean z9, int i7) {
        this.f46993a = i7;
        this.f46994b = po0Var;
        this.f46995c = z9;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f46993a) {
            case 0:
                org.telegram.ui.Components.hc.F(this.f46994b.f48903b.f41356e0, this.f46995c).j();
                return;
            default:
                org.telegram.ui.Components.hc.F(this.f46994b.f48903b.f41356e0, this.f46995c).j();
                return;
        }
    }
}
