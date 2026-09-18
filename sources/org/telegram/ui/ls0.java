package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f35622a;
    public final us0 f35623b;

    public ls0(us0 us0Var, int i10) {
        this.f35622a = i10;
        this.f35623b = us0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35622a) {
            case 0:
                new org.telegram.ui.Components.vc(this.f35623b.f38197b.f30954e0, null).m(org.telegram.ui.Components.uc.f28326r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.vc(this.f35623b.f38197b.f30954e0, null).m(org.telegram.ui.Components.uc.f28326r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
