package org.telegram.ui;

import android.net.Uri;
public final class lo0 implements org.telegram.messenger.x10 {
    public final int f49666a;
    public final ro0 f49667b;
    public final boolean f49668c;

    public lo0(ro0 ro0Var, boolean z10, int i7) {
        this.f49666a = i7;
        this.f49667b = ro0Var;
        this.f49668c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49666a) {
            case 0:
                org.telegram.ui.Components.lc.F(this.f49667b.f51685b.f43249f0, this.f49668c).j();
                return;
            default:
                org.telegram.ui.Components.lc.F(this.f49667b.f51685b.f43249f0, this.f49668c).j();
                return;
        }
    }
}
