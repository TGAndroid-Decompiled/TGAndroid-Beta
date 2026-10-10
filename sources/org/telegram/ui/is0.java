package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class is0 implements Utilities.Callback {
    public final int f38796a;
    public final ss0 f38797b;

    public is0(ss0 ss0Var, int i10) {
        this.f38796a = i10;
        this.f38797b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38796a) {
            case 0:
                new org.telegram.ui.Components.ad(this.f38797b.f41811b.f33942e0, null).m(org.telegram.ui.Components.zc.f33570r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.ad(this.f38797b.f41811b.f33942e0, null).m(org.telegram.ui.Components.zc.f33570r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
