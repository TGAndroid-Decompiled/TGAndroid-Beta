package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class as0 implements Utilities.Callback {
    public final int f32215a;
    public final ks0 f32216b;

    public as0(ks0 ks0Var, int i10) {
        this.f32215a = i10;
        this.f32216b = ks0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f32215a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f32216b.f35135b.f31209e0, null).m(org.telegram.ui.Components.xc.f30301r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f32216b.f35135b.f31209e0, null).m(org.telegram.ui.Components.xc.f30301r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
