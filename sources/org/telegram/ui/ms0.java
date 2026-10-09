package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f39980a;
    public final ss0 f39981b;
    public final boolean f39982c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f39980a = i10;
        this.f39981b = ss0Var;
        this.f39982c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39980a) {
            case 0:
                org.telegram.ui.Components.ad.F(this.f39981b.f41767b.f33904e0, this.f39982c).j();
                return;
            default:
                org.telegram.ui.Components.ad.F(this.f39981b.f41767b.f33904e0, this.f39982c).j();
                return;
        }
    }
}
