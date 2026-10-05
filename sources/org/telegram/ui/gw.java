package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class gw implements Utilities.Callback {
    public final int f36769a;
    public final Activity f36770b;

    public gw(Activity activity, int i10) {
        this.f36769a = i10;
        this.f36770b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36769a) {
            case 0:
                uy.B0(this.f36770b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f36770b, (Boolean) obj);
                return;
        }
    }
}
