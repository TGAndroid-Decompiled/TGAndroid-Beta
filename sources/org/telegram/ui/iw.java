package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class iw implements Utilities.Callback {
    public final int f34703a;
    public final Activity f34704b;

    public iw(Activity activity, int i10) {
        this.f34703a = i10;
        this.f34704b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34703a) {
            case 0:
                wy.B0(this.f34704b, (Boolean) obj);
                return;
            default:
                wy.s0(this.f34704b, (Boolean) obj);
                return;
        }
    }
}
