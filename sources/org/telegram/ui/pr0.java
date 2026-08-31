package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class pr0 implements Utilities.Callback {
    public final int f40149a;
    public final yr0 f40150b;

    public pr0(yr0 yr0Var, int i10) {
        this.f40149a = i10;
        this.f40150b = yr0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40149a) {
            case 0:
                new org.telegram.ui.Components.qc(this.f40150b.f43699b.f34230b0, null).m(org.telegram.ui.Components.pc.f30018r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.qc(this.f40150b.f43699b.f34230b0, null).m(org.telegram.ui.Components.pc.f30018r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
