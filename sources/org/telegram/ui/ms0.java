package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f35810a;
    public final ss0 f35811b;
    public final boolean f35812c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f35810a = i10;
        this.f35811b = ss0Var;
        this.f35812c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35810a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f35811b.f37521b.f31221e0, this.f35812c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f35811b.f37521b.f31221e0, this.f35812c).j();
                return;
        }
    }
}
