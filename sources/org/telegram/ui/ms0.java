package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f40024a;
    public final ss0 f40025b;
    public final boolean f40026c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f40024a = i10;
        this.f40025b = ss0Var;
        this.f40026c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40024a) {
            case 0:
                org.telegram.ui.Components.ad.F(this.f40025b.f41811b.f33942e0, this.f40026c).j();
                return;
            default:
                org.telegram.ui.Components.ad.F(this.f40025b.f41811b.f33942e0, this.f40026c).j();
                return;
        }
    }
}
