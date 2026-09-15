package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class gw implements Utilities.Callback {
    public final int f34029a;
    public final Activity f34030b;

    public gw(Activity activity, int i10) {
        this.f34029a = i10;
        this.f34030b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34029a) {
            case 0:
                uy.B0(this.f34030b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f34030b, (Boolean) obj);
                return;
        }
    }
}
