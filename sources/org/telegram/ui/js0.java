package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class js0 implements Utilities.Callback {
    public final int f34938a;
    public final ss0 f34939b;

    public js0(ss0 ss0Var, int i10) {
        this.f34938a = i10;
        this.f34939b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34938a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f34939b.f37466b.f31181e0, null).m(org.telegram.ui.Components.wc.f30016r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f34939b.f37466b.f31181e0, null).m(org.telegram.ui.Components.wc.f30016r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
