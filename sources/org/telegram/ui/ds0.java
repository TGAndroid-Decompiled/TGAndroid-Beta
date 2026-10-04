package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ds0 implements Utilities.Callback {
    public final int f35830a;
    public final ns0 f35831b;

    public ds0(ns0 ns0Var, int i10) {
        this.f35830a = i10;
        this.f35831b = ns0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35830a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f35831b.f39035b.f33894e0, null).m(org.telegram.ui.Components.xc.f32758r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f35831b.f39035b.f33894e0, null).m(org.telegram.ui.Components.xc.f32758r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
