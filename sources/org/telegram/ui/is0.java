package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class is0 implements Utilities.Callback {
    public final int f37433a;
    public final rs0 f37434b;

    public is0(rs0 rs0Var, int i10) {
        this.f37433a = i10;
        this.f37434b = rs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37433a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f37434b.f40231b.f33550e0, null).m(org.telegram.ui.Components.xc.f32500r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f37434b.f40231b.f33550e0, null).m(org.telegram.ui.Components.xc.f32500r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
