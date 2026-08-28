package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class jr0 implements Utilities.Callback {
    public final int f39618a;
    public final pr0 f39619b;
    public final boolean f39620c;

    public jr0(pr0 pr0Var, boolean z10, int i9) {
        this.f39618a = i9;
        this.f39619b = pr0Var;
        this.f39620c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39618a) {
            case 0:
                org.telegram.ui.Components.oc.F(this.f39619b.f41587b.f35580a0, this.f39620c).j();
                return;
            default:
                org.telegram.ui.Components.oc.F(this.f39619b.f41587b.f35580a0, this.f39620c).j();
                return;
        }
    }
}
