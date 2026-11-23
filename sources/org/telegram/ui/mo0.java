package org.telegram.ui;

import android.net.Uri;
public final class mo0 implements org.telegram.messenger.y10 {
    public final int f49919a;
    public final so0 f49920b;
    public final boolean f49921c;

    public mo0(so0 so0Var, boolean z10, int i7) {
        this.f49919a = i7;
        this.f49920b = so0Var;
        this.f49921c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f49919a) {
            case 0:
                org.telegram.ui.Components.lc.F(this.f49920b.f52063b.f43218f0, this.f49921c).j();
                return;
            default:
                org.telegram.ui.Components.lc.F(this.f49920b.f52063b.f43218f0, this.f49921c).j();
                return;
        }
    }
}
