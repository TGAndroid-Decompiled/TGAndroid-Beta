package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f35802a;
    public final ss0 f35803b;
    public final boolean f35804c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f35802a = i10;
        this.f35803b = ss0Var;
        this.f35804c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35802a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.f35803b.f37457b.f30934e0, this.f35804c).j();
                return;
            default:
                org.telegram.ui.Components.vc.F(this.f35803b.f37457b.f30934e0, this.f35804c).j();
                return;
        }
    }
}
