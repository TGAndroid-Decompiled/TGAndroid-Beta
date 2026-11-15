package org.telegram.ui;

import android.net.Uri;
public final class io0 implements org.telegram.messenger.z10 {
    public final int f48092a;
    public final oo0 f48093b;
    public final boolean f48094c;

    public io0(oo0 oo0Var, boolean z10, int i7) {
        this.f48092a = i7;
        this.f48093b = oo0Var;
        this.f48094c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f48092a) {
            case 0:
                org.telegram.ui.Components.cc.F(this.f48093b.f50016b.f42763f0, this.f48094c).j();
                return;
            default:
                org.telegram.ui.Components.cc.F(this.f48093b.f50016b.f42763f0, this.f48094c).j();
                return;
        }
    }
}
