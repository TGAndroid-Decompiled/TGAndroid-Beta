package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final int f33028a;
    public final ns0 f33029b;

    public ds0(ns0 ns0Var, int i10) {
        this.f33028a = i10;
        this.f33029b = ns0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33028a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f33029b.f36082b.f31225e0, null).m(org.telegram.ui.Components.wc.f29914r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f33029b.f36082b.f31225e0, null).m(org.telegram.ui.Components.wc.f29914r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
