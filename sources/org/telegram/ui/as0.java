package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class as0 implements Utilities.Callback {
    public final int f32229a;
    public final ks0 f32230b;

    public as0(ks0 ks0Var, int i10) {
        this.f32229a = i10;
        this.f32230b = ks0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32229a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f32230b.f35168b.f31224e0, null).m(org.telegram.ui.Components.wc.f29961r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f32230b.f35168b.f31224e0, null).m(org.telegram.ui.Components.wc.f29961r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
