package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f35617a;
    public final us0 f35618b;

    public ls0(us0 us0Var, int i10) {
        this.f35617a = i10;
        this.f35618b = us0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35617a) {
            case 0:
                new org.telegram.ui.Components.vc(this.f35618b.f38192b.f30950e0, null).m(org.telegram.ui.Components.uc.f28323r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.vc(this.f35618b.f38192b.f30950e0, null).m(org.telegram.ui.Components.uc.f28323r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
