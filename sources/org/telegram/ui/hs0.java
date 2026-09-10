package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class hs0 implements Utilities.Callback {
    public final int f33454a;
    public final rs0 f33455b;

    public hs0(rs0 rs0Var, int i10) {
        this.f33454a = i10;
        this.f33455b = rs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33454a) {
            case 0:
                new org.telegram.ui.Components.wc(this.f33455b.f36451b.f30049e0, null).m(org.telegram.ui.Components.vc.f27909r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.wc(this.f33455b.f36451b.f30049e0, null).m(org.telegram.ui.Components.vc.f27909r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
