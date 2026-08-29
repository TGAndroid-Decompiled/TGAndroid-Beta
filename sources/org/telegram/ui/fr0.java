package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class fr0 implements Utilities.Callback {
    public final int f38228a;
    public final or0 f38229b;

    public fr0(or0 or0Var, int i10) {
        this.f38228a = i10;
        this.f38229b = or0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38228a) {
            case 0:
                new org.telegram.ui.Components.tc(this.f38229b.f41216b.f35647a0, null).m(org.telegram.ui.Components.sc.f32605r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.tc(this.f38229b.f41216b.f35647a0, null).m(org.telegram.ui.Components.sc.f32605r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
