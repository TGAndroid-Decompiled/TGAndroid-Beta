package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class js0 implements Utilities.Callback {
    public final int f34983a;
    public final ss0 f34984b;

    public js0(ss0 ss0Var, int i10) {
        this.f34983a = i10;
        this.f34984b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34983a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f34984b.f37521b.f31221e0, null).m(org.telegram.ui.Components.wc.f30023r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f34984b.f37521b.f31221e0, null).m(org.telegram.ui.Components.wc.f30023r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
