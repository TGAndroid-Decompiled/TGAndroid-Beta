package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f38499a;
    public final rs0 f38500b;

    public hs0(rs0 rs0Var, int i10) {
        this.f38499a = i10;
        this.f38500b = rs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38499a) {
            case 0:
                new org.telegram.ui.Components.ad(this.f38500b.f41508b.f33932e0, null).m(org.telegram.ui.Components.zc.f33482r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.ad(this.f38500b.f41508b.f33932e0, null).m(org.telegram.ui.Components.zc.f33482r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
