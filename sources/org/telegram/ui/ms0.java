package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f35831a;
    public final ss0 f35832b;
    public final boolean f35833c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f35831a = i10;
        this.f35832b = ss0Var;
        this.f35833c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35831a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f35832b.f37545b.f31242e0, this.f35833c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f35832b.f37545b.f31242e0, this.f35833c).j();
                return;
        }
    }
}
