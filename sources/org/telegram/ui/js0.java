package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class js0 implements Utilities.Callback {
    public final int f35005a;
    public final ss0 f35006b;

    public js0(ss0 ss0Var, int i10) {
        this.f35005a = i10;
        this.f35006b = ss0Var;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35005a) {
            case 0:
                new org.telegram.ui.Components.xc(this.f35006b.f37545b.f31242e0, null).m(org.telegram.ui.Components.wc.f29995r, 1, -115203550, -1, null).j();
                return;
            default:
                new org.telegram.ui.Components.xc(this.f35006b.f37545b.f31242e0, null).m(org.telegram.ui.Components.wc.f29995r, 1, -115203550, -1, null).j();
                return;
        }
    }
}
