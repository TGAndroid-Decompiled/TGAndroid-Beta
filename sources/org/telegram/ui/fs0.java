package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class fs0 implements Utilities.Callback {
    public final int f33361a;
    public final ls0 f33362b;
    public final boolean f33363c;

    public fs0(ls0 ls0Var, boolean z10, int i10) {
        this.f33361a = i10;
        this.f33362b = ls0Var;
        this.f33363c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33361a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f33362b.f35085b.f30908e0, this.f33363c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f33362b.f35085b.f30908e0, this.f33363c).j();
                return;
        }
    }
}
