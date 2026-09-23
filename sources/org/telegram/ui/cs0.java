package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class cs0 implements Utilities.Callback {
    public final int f32399a;
    public final ls0 f32400b;

    public cs0(ls0 ls0Var, int i10) {
        this.f32399a = i10;
        this.f32400b = ls0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32399a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f32400b.f35085b.f30908e0, null).m(org.telegram.ui.Components.wc.f29600r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f32400b.f35085b.f30908e0, null).m(org.telegram.ui.Components.wc.f29600r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
