package org.telegram.ui;

import android.net.Uri;
public final class lo0 implements org.telegram.messenger.y10 {
    public final int f49670a;
    public final ro0 f49671b;
    public final boolean f49672c;

    public lo0(ro0 ro0Var, boolean z10, int i7) {
        this.f49670a = i7;
        this.f49671b = ro0Var;
        this.f49672c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49670a) {
            case 0:
                org.telegram.ui.Components.lc.F(this.f49671b.f51689b.f43253f0, this.f49672c).j();
                return;
            default:
                org.telegram.ui.Components.lc.F(this.f49671b.f51689b.f43253f0, this.f49672c).j();
                return;
        }
    }
}
