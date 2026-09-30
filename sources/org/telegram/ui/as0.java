package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class as0 implements Utilities.Callback {
    public final int f32231a;
    public final ks0 f32232b;

    public as0(ks0 ks0Var, int i10) {
        this.f32231a = i10;
        this.f32232b = ks0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32231a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f32232b.f35150b.f31225e0, null).m(org.telegram.ui.Components.xc.f30350r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f32232b.f35150b.f31225e0, null).m(org.telegram.ui.Components.xc.f30350r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
