package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class is0 implements Utilities.Callback {
    public final int f37459a;
    public final rs0 f37460b;

    public is0(rs0 rs0Var, int i10) {
        this.f37459a = i10;
        this.f37460b = rs0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f37459a) {
            case 0:
                new org.telegram.ui.Components.yc(this.f37460b.f40257b.f33576e0, null).m(org.telegram.ui.Components.xc.f32526r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.yc(this.f37460b.f40257b.f33576e0, null).m(org.telegram.ui.Components.xc.f32526r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
