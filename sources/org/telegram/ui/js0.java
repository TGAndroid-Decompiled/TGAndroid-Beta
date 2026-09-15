package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class js0 implements Utilities.Callback {
    public final int f34967a;
    public final ss0 f34968b;

    public js0(ss0 ss0Var, int i10) {
        this.f34967a = i10;
        this.f34968b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34967a) {
            case 0:
                new org.telegram.ui.Components.vc(this.f34968b.f37448b.f30936e0, null).m(org.telegram.ui.Components.uc.f28336r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.vc(this.f34968b.f37448b.f30936e0, null).m(org.telegram.ui.Components.uc.f28336r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
