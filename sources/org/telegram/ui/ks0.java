package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ks0 implements Utilities.Callback {
    public final int f39573a;
    public final us0 f39574b;

    public ks0(us0 us0Var, int i10) {
        this.f39573a = i10;
        this.f39574b = us0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39573a) {
            case 0:
                new org.telegram.ui.Components.zc(this.f39574b.f42563b.f33743e0, null).m(org.telegram.ui.Components.yc.f33037r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.zc(this.f39574b.f42563b.f33743e0, null).m(org.telegram.ui.Components.yc.f33037r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
