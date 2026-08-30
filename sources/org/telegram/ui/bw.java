package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class bw implements Utilities.Callback {
    public final int f33037a;
    public final Activity f33038b;

    public bw(Activity activity, int i10) {
        this.f33037a = i10;
        this.f33038b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33037a) {
            case 0:
                oy.A0(this.f33038b, (Boolean) obj);
                return;
            default:
                oy.r0(this.f33038b, (Boolean) obj);
                return;
        }
    }
}
