package org.telegram.ui;

import android.net.Uri;
public final class lo0 implements org.telegram.messenger.w10 {
    public final int f49790a;
    public final ro0 f49791b;
    public final boolean f49792c;

    public lo0(ro0 ro0Var, boolean z10, int i7) {
        this.f49790a = i7;
        this.f49791b = ro0Var;
        this.f49792c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49790a) {
            case 0:
                org.telegram.ui.Components.kc.F(this.f49791b.f51804b.f43334f0, this.f49792c).j();
                return;
            default:
                org.telegram.ui.Components.kc.F(this.f49791b.f51804b.f43334f0, this.f49792c).j();
                return;
        }
    }
}
