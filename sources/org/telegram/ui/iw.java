package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class iw implements Utilities.Callback {
    public final int f34698a;
    public final Activity f34699b;

    public iw(Activity activity, int i10) {
        this.f34698a = i10;
        this.f34699b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34698a) {
            case 0:
                wy.B0(this.f34699b, (Boolean) obj);
                return;
            default:
                wy.s0(this.f34699b, (Boolean) obj);
                return;
        }
    }
}
