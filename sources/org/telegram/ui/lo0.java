package org.telegram.ui;

import android.net.Uri;
public final class lo0 implements org.telegram.messenger.x10 {
    public final int f49615a;
    public final ro0 f49616b;
    public final boolean f49617c;

    public lo0(ro0 ro0Var, boolean z10, int i7) {
        this.f49615a = i7;
        this.f49616b = ro0Var;
        this.f49617c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49615a) {
            case 0:
                org.telegram.ui.Components.lc.F(this.f49616b.f51710b.f43208f0, this.f49617c).j();
                return;
            default:
                org.telegram.ui.Components.lc.F(this.f49616b.f51710b.f43208f0, this.f49617c).j();
                return;
        }
    }
}
