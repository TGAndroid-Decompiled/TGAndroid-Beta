package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ps0 implements Utilities.Callback {
    public final int f39284a;
    public final zs0 f39285b;

    public ps0(zs0 zs0Var, int i10) {
        this.f39284a = i10;
        this.f39285b = zs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39284a) {
            case 0:
                new org.telegram.ui.Components.zc(this.f39285b.f42710b.f32226e0, null).m(org.telegram.ui.Components.yc.f31537r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.zc(this.f39285b.f42710b.f32226e0, null).m(org.telegram.ui.Components.yc.f31537r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
