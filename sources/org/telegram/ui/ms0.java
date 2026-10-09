package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f39978a;
    public final ss0 f39979b;
    public final boolean f39980c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f39978a = i10;
        this.f39979b = ss0Var;
        this.f39980c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39978a) {
            case 0:
                org.telegram.ui.Components.ad.F(this.f39979b.f41765b.f33904e0, this.f39980c).j();
                return;
            default:
                org.telegram.ui.Components.ad.F(this.f39979b.f41765b.f33904e0, this.f39980c).j();
                return;
        }
    }
}
