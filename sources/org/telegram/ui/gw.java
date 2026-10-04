package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class gw implements Utilities.Callback {
    public final int f36739a;
    public final Activity f36740b;

    public gw(Activity activity, int i10) {
        this.f36739a = i10;
        this.f36740b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36739a) {
            case 0:
                uy.B0(this.f36740b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f36740b, (Boolean) obj);
                return;
        }
    }
}
