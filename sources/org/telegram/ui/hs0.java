package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f38533a;
    public final rs0 f38534b;

    public hs0(rs0 rs0Var, int i10) {
        this.f38533a = i10;
        this.f38534b = rs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38533a) {
            case 0:
                new org.telegram.ui.Components.ad(this.f38534b.f41542b.f33966e0, null).m(org.telegram.ui.Components.zc.f33600r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.ad(this.f38534b.f41542b.f33966e0, null).m(org.telegram.ui.Components.zc.f33600r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
