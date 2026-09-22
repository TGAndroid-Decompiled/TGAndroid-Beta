package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class gw implements Utilities.Callback {
    public final int f33958a;
    public final Activity f33959b;

    public gw(Activity activity, int i10) {
        this.f33958a = i10;
        this.f33959b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33958a) {
            case 0:
                uy.B0(this.f33959b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f33959b, (Boolean) obj);
                return;
        }
    }
}
