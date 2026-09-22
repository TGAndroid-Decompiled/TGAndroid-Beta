package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class is0 implements Utilities.Callback {
    public final int f34718a;
    public final ss0 f34719b;

    public is0(ss0 ss0Var, int i10) {
        this.f34718a = i10;
        this.f34719b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34718a) {
            case 0:
                new org.telegram.ui.Components.vc(this.f34719b.f37457b.f30934e0, null).m(org.telegram.ui.Components.uc.f28333r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.vc(this.f34719b.f37457b.f30934e0, null).m(org.telegram.ui.Components.uc.f28333r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
