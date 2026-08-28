package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class fr0 implements Utilities.Callback {
    public final int f38340a;
    public final pr0 f38341b;

    public fr0(pr0 pr0Var, int i9) {
        this.f38340a = i9;
        this.f38341b = pr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38340a) {
            case 0:
                new org.telegram.ui.Components.oc(this.f38341b.f41587b.f35580a0, null).m(org.telegram.ui.Components.nc.f31067r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.oc(this.f38341b.f41587b.f35580a0, null).m(org.telegram.ui.Components.nc.f31067r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
