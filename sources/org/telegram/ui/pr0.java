package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback {
    public final int f40290a;
    public final yr0 f40291b;

    public pr0(yr0 yr0Var, int i10) {
        this.f40290a = i10;
        this.f40291b = yr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40290a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f40291b.f43547b.f33282e0, null).m(org.telegram.ui.Components.wc.f32058r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f40291b.f43547b.f33282e0, null).m(org.telegram.ui.Components.wc.f32058r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
