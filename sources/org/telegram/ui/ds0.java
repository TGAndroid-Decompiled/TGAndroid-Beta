package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final int f35836a;
    public final ns0 f35837b;

    public ds0(ns0 ns0Var, int i10) {
        this.f35836a = i10;
        this.f35837b = ns0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35836a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f35837b.f39041b.f33901e0, null).m(org.telegram.ui.Components.xc.f32765r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f35837b.f39041b.f33901e0, null).m(org.telegram.ui.Components.xc.f32765r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
