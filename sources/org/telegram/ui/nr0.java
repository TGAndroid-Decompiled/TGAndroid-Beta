package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class nr0 implements Utilities.Callback {
    public final int f36713a;
    public final wr0 f36714b;

    public nr0(wr0 wr0Var, int i10) {
        this.f36713a = i10;
        this.f36714b = wr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f36713a) {
            case 0:
                new org.telegram.ui.Components.qc(this.f36714b.f39788b.f31705b0, null).m(org.telegram.ui.Components.pc.f27813r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.qc(this.f36714b.f39788b.f31705b0, null).m(org.telegram.ui.Components.pc.f27813r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
