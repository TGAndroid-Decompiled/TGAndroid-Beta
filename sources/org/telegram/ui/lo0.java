package org.telegram.ui;

import android.net.Uri;
public final class lo0 implements org.telegram.messenger.x10 {
    public final int f49656a;
    public final ro0 f49657b;
    public final boolean f49658c;

    public lo0(ro0 ro0Var, boolean z10, int i7) {
        this.f49656a = i7;
        this.f49657b = ro0Var;
        this.f49658c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49656a) {
            case 0:
                org.telegram.ui.Components.lc.F(this.f49657b.f51721b.f43208f0, this.f49658c).j();
                return;
            default:
                org.telegram.ui.Components.lc.F(this.f49657b.f51721b.f43208f0, this.f49658c).j();
                return;
        }
    }
}
