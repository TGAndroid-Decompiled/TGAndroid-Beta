package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback {
    public final int f40281a;
    public final yr0 f40282b;

    public pr0(yr0 yr0Var, int i10) {
        this.f40281a = i10;
        this.f40282b = yr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40281a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f40282b.f43538b.f33272e0, null).m(org.telegram.ui.Components.wc.f32067r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f40282b.f43538b.f33272e0, null).m(org.telegram.ui.Components.wc.f32067r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
