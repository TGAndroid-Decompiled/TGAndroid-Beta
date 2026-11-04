package org.telegram.ui;

import android.net.Uri;
public final class bo0 implements org.telegram.messenger.u10 {
    public final int f44118a;
    public final ho0 f44119b;
    public final boolean f44120c;

    public bo0(ho0 ho0Var, boolean z10, int i3) {
        this.f44118a = i3;
        this.f44119b = ho0Var;
        this.f44120c = z10;
    }

    @Override
    public final void a(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f44118a) {
            case 0:
                org.telegram.ui.Components.fc.F(this.f44119b.f45959b.f41420f0, this.f44120c).j();
                return;
            default:
                org.telegram.ui.Components.fc.F(this.f44119b.f45959b.f41420f0, this.f44120c).j();
                return;
        }
    }
}
