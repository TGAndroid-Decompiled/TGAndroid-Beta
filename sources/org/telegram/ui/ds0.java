package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final int f35831a;
    public final ns0 f35832b;

    public ds0(ns0 ns0Var, int i10) {
        this.f35831a = i10;
        this.f35832b = ns0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35831a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f35832b.f39036b.f33895e0, null).m(org.telegram.ui.Components.xc.f32759r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f35832b.f39036b.f33895e0, null).m(org.telegram.ui.Components.xc.f32759r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
