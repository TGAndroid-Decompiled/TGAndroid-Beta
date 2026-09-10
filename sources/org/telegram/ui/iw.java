package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class iw implements Utilities.Callback {
    public final int f33805a;
    public final Activity f33806b;

    public iw(Activity activity, int i10) {
        this.f33805a = i10;
        this.f33806b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33805a) {
            case 0:
                wy.B0(this.f33806b, (Boolean) obj);
                return;
            default:
                wy.s0(this.f33806b, (Boolean) obj);
                return;
        }
    }
}
