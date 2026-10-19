package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback {
    public final int f40286a;
    public final yr0 f40287b;

    public pr0(yr0 yr0Var, int i10) {
        this.f40286a = i10;
        this.f40287b = yr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40286a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f40287b.f43543b.f33272e0, null).m(org.telegram.ui.Components.wc.f32069r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f40287b.f43543b.f33272e0, null).m(org.telegram.ui.Components.wc.f32069r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
