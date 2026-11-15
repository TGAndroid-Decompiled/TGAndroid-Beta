package org.telegram.ui;

import android.net.Uri;
public final class io0 implements org.telegram.messenger.z10 {
    public final int f48107a;
    public final oo0 f48108b;
    public final boolean f48109c;

    public io0(oo0 oo0Var, boolean z10, int i7) {
        this.f48107a = i7;
        this.f48108b = oo0Var;
        this.f48109c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f48107a) {
            case 0:
                org.telegram.ui.Components.cc.F(this.f48108b.f50039b.f42763f0, this.f48109c).j();
                return;
            default:
                org.telegram.ui.Components.cc.F(this.f48108b.f50039b.f42763f0, this.f48109c).j();
                return;
        }
    }
}
